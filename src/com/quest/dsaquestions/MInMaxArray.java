package com.quest.dsaquestions;

public class MInMaxArray {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,8,2,1,9};

        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum is "+min);

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum is "+max);
    }
}
