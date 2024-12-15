package com.quest.dsaquestions;

import java.util.Arrays;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,8,2,1,9};

        boolean flag=false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                flag=true;
            }
        }
        if(!flag){
            System.out.println("arrays sorted");
        }
        else{
            System.out.println("arrays not sorted");
        }
    }
}
