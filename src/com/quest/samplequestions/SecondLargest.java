package com.quest.samplequestions;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,2,7,7,8};
        int firstMax=arr[1];
        int secondMax=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            } else if (arr[i]>secondMax && firstMax!=secondMax) {
                secondMax=arr[i];
            }
        }
        System.out.println("second max value is: "+secondMax);
    }
}
