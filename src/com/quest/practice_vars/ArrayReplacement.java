package com.quest.practice_vars;
import java.util.Arrays;

public class ArrayReplacement {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=sum-arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
