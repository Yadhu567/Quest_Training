package com.quest.practice_questions;

public class StudentScores {
    public static void main(String[] args) {
        // Step 1: Initialize arrays
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}
        };

        // Step 2: Calculate average scores
        System.out.println("Average scores of each student:");
        double[] avgScore=calculateAverageScores(names, ages, scores);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" age:"+ages[i]+" average-score:"+avgScore[i]);
        }
        System.out.println();
        // Step 3: Find the highest scorer
        findHighestScore(names, ages, scores);
        System.out.println();
        // Step 4: Ranking students by average score
        rankStudents(names, ages, scores);
        System.out.println();
        // Step 5: Detect missing data
        detectMissingData(names, scores);

    }

    // Method to calculate and print average scores
    public static double[] calculateAverageScores(String[] names, int[] ages, int[][] scores) {
        // Logic to calculate and print average scores for each student
        double[] avgScore= new double[names.length]; // array to store the average scores
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int counter = 0;
            for (int sc:scores[i]) {
                if(sc!=-1){
                   sum += sc;
                   counter++;
                }
            }
            if(counter>0){
                avgScore[i] = (double) sum /counter;
            }
        }
        return avgScore;
    }

    // Method to find the student with the highest average score
    public static void findHighestScore(String[] names, int[] ages, int[][] scores) {
        // Logic to find and print the student with the highest average score
        System.out.println("student with the highest average score");
        double[] avgScore=calculateAverageScores(names, ages, scores); //to get average scores
        double highestScore=avgScore[0];
        int index=0;
        for (int i = 1; i < avgScore.length; i++) {
            if(avgScore[i]>highestScore){
                highestScore=avgScore[i];
                index=i;
            }
        }
        System.out.println(names[index]+" age:"+ages[index]+" has the highest score:"+highestScore);
    }

    // Method to rank students based on average score
    public static void rankStudents(String[] names, int[] ages, int[][] scores) {
        // Logic to rank students by average score
        System.out.println("student in the rank of highest average score:");
        double[] avgScore=calculateAverageScores(names, ages, scores); //to get average scores
        //arrays to store the sorted values
        String[] sortedNames = new String[names.length];
        int[] sortedAges = new int[ages.length];
        double[] sortedScores = new double[avgScore.length];

        // copy the original arrays
        System.arraycopy(names, 0, sortedNames, 0, names.length);
        System.arraycopy(ages, 0, sortedAges, 0, ages.length);
        System.arraycopy(avgScore, 0, sortedScores, 0, avgScore.length);

        for (int i = 0; i < avgScore.length; i++) {
            int maxIndex=i;
            for (int j = i+1; j < avgScore.length; j++) {
                if (avgScore[j]>avgScore[maxIndex]) {
                    maxIndex=j;
                }
            }

            // swapping the highest values
            double tempScore = sortedScores[i];
            sortedScores[i] = sortedScores[maxIndex];
            sortedScores[maxIndex] = tempScore;

            String tempName = sortedNames[i];
            sortedNames[i] = sortedNames[maxIndex];
            sortedNames[maxIndex] = tempName;

            int tempAge = sortedAges[i];
            sortedAges[i] = sortedAges[maxIndex];
            sortedAges[maxIndex] = tempAge;
        }
        for (int i = 0; i < sortedScores.length; i++) {
            System.out.println(sortedNames[i]+" age:"+sortedAges[i]+" score:"+sortedScores[i]);
        }
    }

    // Method to detect missing data in the scores array
    public static void detectMissingData(String[] names, int[][] scores) {
        // Logic to detect missing data and print the missing subject(s) for each student
        System.out.println("missing data in the scores array:");
        for (int i = 0; i < scores.length; i++) {
            boolean found=false; // flag to check value is missing or not 
            for (int j = 0; j < scores[i].length; j++) {
                if(scores[i][j]==-1){
                    System.out.println(names[i]+" has missing score for subject"+(j+1));
                    found=true;
                }
            }
            if(!found){
                System.out.println(names[i]+" has no missing score for all subjects");
            }
        }
    }
}
