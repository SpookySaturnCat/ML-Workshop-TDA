package meeting4;

import java.util.*;

public class SplitData {
    public static void splitData(List<List<String>> dataset) {
        Collections.shuffle(dataset, new Random(42));
        int splitIndex = (int) (dataset.size() * 0.8);
        List<List<String>> trainData = dataset.subList(0, splitIndex);
        List<List<String>> testData = dataset.subList(splitIndex, dataset.size());

        System.out.println("Training size: " + trainData.size() + ", Test size: " + testData.size());
    }
}
