package com.quest.practice_vars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatElements {
    public static void main(String[] args) {
        int[] arr = {1,4,3,54,34,33,5,4,3};
        int count=0;
//        for(int i = 0; i<arr.length; i++){
//            for(int j = i+1; j<arr.length; j++){
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                    count++
//                    break;
//                }
//            }
//        }
//        int i=0;
//        while(i<arr.length){
//            int j=i+1;
//            while(j<arr.length){
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                    count++;
//                    break;
//                }
//                j++;
//            }
//            i++;
//        }
//        System.out.println("The number of duplicate elements are:"+count);
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("The number of duplicate elements:"+count);
    }
}
