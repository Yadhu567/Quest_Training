package com.quest.practice_vars;

import java.util.Scanner;

public class StudentManagementSystem {
    private static final int MAX_SCORE = 100; // constant to store maximum mark

    public static void main(String[] args) {
        while (true) {

            System.out.println("enter the number of students");
            Scanner sc = new Scanner(System.in);
            int n = 0; // number od students
            try {
                n = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer for the number of students.");
                sc.next();
                continue;
            }
            if (n < 0 || n > 100) { // for validating the value of number of students
                System.out.println("invalid number, enter again!");
                continue;
            }
            char[] grade = new char[n];
            for (int i = 0; i < n; i++) {
                sc.nextLine();
                System.out.println("enter the name of student" + (i+1) + ":");
                String name = sc.nextLine(); // name of student
                double mathScore = getValidScore(sc, "Math"); // function to enter and validate score
                double englishScore = getValidScore(sc, "English");
                double scienceScore = getValidScore(sc, "Science");
                double totalScore = mathScore + scienceScore + englishScore;
                double averageScore = totalScore / 3;
                if (totalScore < 50) {
                    System.out.println("total score less than 50, cannot continue");
                    continue;
                }
                if (mathScore < 60 || englishScore < 60 || scienceScore < 60) {
                    System.out.println("Warning:Needs improvement in individual subjects");
                }
                if (averageScore >= 90) {
                    grade[i] = 'A';
                } else if (averageScore >= 80) {
                    grade[i] = 'B';
                } else if (averageScore >= 70) {
                    grade[i] = 'C';
                } else if (averageScore >= 60) {
                    grade[i] = 'D';
                } else {
                    grade[i] = 'F';
                }
                System.out.println("Total Score:" + totalScore);
                System.out.println("Average Score:" + averageScore);
                switch (grade[i]) {
                    case 'A':
                        System.out.println("excellent performance!");
                        break;
                    case 'B':
                        System.out.println("Good job, but you can aim higher!");
                        break;
                    case 'C':
                        System.out.println("You need to put in more effort!");
                        break;
                    case 'D':
                        System.out.println("Your performance is below expectations. Consider seeking help!");
                        break;
                    case 'F':
                        System.out.println("Failure. You need significant improvement!");
                        break;
                    default:
                        System.out.println("doesn't exist");
                }
            }
            System.out.println("Summary:" + n + " students processed.");
            return; // exit if all students are processed
        }
    }

    private static double getValidScore(Scanner sc, String subject) {
        double score;
        while (true) {
            System.out.println("enter the score for subject " + subject + "(0-100):");
            try {
                score = sc.nextDouble();
                if (score >= 0 && score <= MAX_SCORE) { // condition to check valid score or not
                    break;
                } else {
                    System.out.println("invalid score, enter again!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer for the score for subject.");
                sc.next();
            }
        }
        return score;
    }
}
