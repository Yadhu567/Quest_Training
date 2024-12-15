package com.quest.dsaquestions;

import java.util.Arrays;

public class ArrayRotations {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,8,2,1,9};

        int rotations=2;

        for(int i=0;i<rotations;i++){
            int last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }

        System.out.println(Arrays.toString(arr));


    }
}
