package com.quest.practice_questions;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        for (int x:arr){
            System.out.println(x);
        }
        int[][] arr2 = new int[10][10];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = j+1;
            }
        }
        for(int[] arrayEg:arr2){
            System.out.println("--");
            for(int x:arrayEg){
                System.out.println(x);
            }
        }
        int[][] arr3=new int[5][5];
        for(int[] x:arr3){
            for(int j:x){
                System.out.println(j);
            }
        }
        int[] arr4=new int[3];
        System.out.println(arr4.length);
    }
}
