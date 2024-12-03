package com.quest.practice_questions;
import java.util.Scanner;
public class MatrixExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] newMatrix=new int[10][10];
        System.out.println("enter the rows");
        int rows=sc.nextInt();
        System.out.println("enter the columns");
        int columns=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("enter the value for position "+i+j);
                newMatrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
