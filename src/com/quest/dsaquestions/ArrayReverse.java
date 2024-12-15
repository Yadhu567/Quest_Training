package com.quest.dsaquestions;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,8,2,1,9};

        for(int i=0;i< arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}
