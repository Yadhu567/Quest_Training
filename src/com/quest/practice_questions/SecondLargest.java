package com.quest.practice_questions;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8};
        int firstMax = arr[0];
        int secondMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }else if (arr[i] > secondMax && arr[i]!=firstMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("second max is " + secondMax);
    }
}
