package com.quest.dsaquestions;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,8,2,1,9};

        int[] newArr=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        int index=0;
        newArr[index++]=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]!=arr[i-1]){
                newArr[index++]=arr[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(newArr[i]+" ");
        }

    }
}
