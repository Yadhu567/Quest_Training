package com.quest.samplequestions;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,2,3,7,8};

        System.out.println("before swapping "+ Arrays.toString(arr));

        int temp=arr[3];
        arr[3]=arr[5];
        arr[5]=temp;

        System.out.println("after swapping "+ Arrays.toString(arr));
    }
}
