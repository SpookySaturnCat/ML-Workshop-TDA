package meeting4;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class Leaderboard {
    private static Firestore db;

    public static void initializeFirebase() throws Exception {
        FileInputStream serviceAccount = new FileInputStream("firebase_credentials.json");
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();
        FirebaseApp.initializeApp(options);
        db = FirestoreClient.getFirestore();
    }

    public static void updatePoints(String studentId, int pointsEarned) throws ExecutionException, InterruptedException {
        DocumentReference docRef = db.collection("students").document(studentId);
        DocumentSnapshot doc = docRef.get().get();
        int currentPoints = doc.exists() ? doc.getLong("points").intValue() : 0;
        int newPoints = currentPoints + pointsEarned;

        Map<String, Object> data = new HashMap<>();
        data.put("points", newPoints);
        docRef.set(data, SetOptions.merge());

        System.out.println(studentId + " now has " + newPoints + " points!");
    }

    public static void displayLeaderboard() throws ExecutionException, InterruptedException {
        System.out.println("Leaderboard");
        db.collection("students").orderBy("points", Query.Direction.DESCENDING).limit(5).get()
                .get().forEach(doc -> System.out.println(doc.getId() + ": " + doc.getLong("points") + " points"));
    }
}
