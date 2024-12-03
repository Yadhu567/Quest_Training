package com.quest.practice_questions;

public class PairElements {
    public static void main(String[] args) {
        int[] arr={10,20,10,10,30,20,50,40,40,30,30,10};
        int[] flag=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            if(flag[i]==1){
                continue;
            }
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    flag[j]=1;
                }
            }
            if((count/2)>0) {
                System.out.println(arr[i] + "s-" + count / 2);
            }
        }

    }
}
