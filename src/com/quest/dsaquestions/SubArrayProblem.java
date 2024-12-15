package com.quest.dsaquestions;

import java.util.Arrays;

public class SubArrayProblem {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 7, 5};
        int k = 3;
        longestSubArray(arr,k);
        evenOdd(arr);
        smallestPositive(arr);
    }
    public static void longestSubArray(int[] arr,int k){

        int maxLen=0;
        for(int  i=0;i<arr.length;i++){
            int currSum=0;
            for(int j=i;j< arr.length;j++){
                currSum+=arr[j];
                if(currSum==k){
                    if(maxLen<j-i+1){
                        maxLen=j-i+1;
                    }
                }
            }

        }
        System.out.println(maxLen);
    }
    public static void evenOdd(int[] arr){

        for(int i = 0; i < arr.length-1; i++) {
            if(i%2==0 && arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            if(i%2==1 && arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void smallestPositive(int[] arr){
        int[] arr2=new int[7- arr.length];
        int index=0;
        for(int i=1;i<=6;i++){
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    flag=true;
                }
            }
            if(!flag){
                if(i>0) {
                    arr2[index++] = i;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
        int small=arr2[0];
        for(int i=1;i<arr2.length;i++){
            if(small>arr2[i]){
                small=arr2[i];
            }
        }
        System.out.println("small "+small);
    }
}
