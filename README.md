# ML-Workshop-TDA
This is a workshop that I made to teach lower-classmen the basics of Machine Learning using the Iris dataset. Using Java, and the Smile Library, as well as Firebase to store leaderboards (to briefly demonstrate a backend example).

Lesson plan: 

Workshop: Build a Simple Machine Learning Model with Gamification in Java
Overview
Estimated Duration: 30 Minutes
Goal: Students will build a simple ML model using the Iris dataset while participating in gamified challenges. Points will be stored using Firebase and displayed on a leaderboard in Replit.

Instructor Setup

1. Prerequisites
Basic Java knowledge (variables, loops, functions)
Familiarity with CSV files (optional, explained in workshop)
A Replit account (https://replit.com/)
A Firebase account (https://firebase.google.com/)

2. Setup Instructions

Replit Setup:
Go to Replit and create a new Java Repl.
Upload iris.csv to your Replit workspace (provided).
Install required libraries by adding the following dependencies to your project:

<dependency>
    <groupId>com.google.firebase</groupId>
    <artifactId>firebase-admin</artifactId>
    <version>9.0.0</version>
</dependency>
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-csv</artifactId>
    <version>1.8</version>
</dependency>


Firebase Setup:
Create a Firebase project at Firebase Console.
Enable Firestore Database (test mode).
Download service account key as firebase_credentials.json.
Upload it to Replit.


Lesson Plan
1. Introduction & Leaderboard Setup (5 min)
Talking Points:
Explain how students will earn points by completing coding challenges.
Show the leaderboard to track top scorers.
Introduce Firebase as a way to store scores.

Challenge: First student to update their score with updatePoints("studentName", 10); gets 10 points!

2. Load & Explore Data (5 min)
Talking Points:
Show how to load a dataset and convert it into a readable format.
Discuss why the Iris dataset is great for beginners.

Challenge: First student to print the dataset size wins 10 points!

3. Prepare Data (5 min)
Talking Points:
Explain train-test splitting.
Introduce the importance of data preparation in ML.

Challenge:
The following lines of code are all mixed up. Put them in the correct order so that the dataset is properly split into training and testing sets.
First student to unscramble it and run it correctly gets 15 points!
Bonus Round: If you can explain why we shuffle before splitting, you get extra 5 points!

Example codde:
List<List<String>> trainData = dataset.subList(0, splitIndex);
Collections.shuffle(dataset, new Random(42));
List<List<String>> testData = dataset.subList(splitIndex, dataset.size());
int splitIndex = (int) (dataset.size() * 0.8);


4. Train a Simple Model (10 min)
Talking Points:
Explain the K-Nearest Neighbors (KNN) algorithm.
Discuss model accuracy and performance.

Challenge: First student to run their model gets 15 points!

5. Final Challenge & Wrap-Up (5 min)
Feedback Survey: Students earn bonus points for providing feedback.



