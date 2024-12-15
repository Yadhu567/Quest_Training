package com.quest.dsaquestions;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};

        for(int i=1;i<=6;i++){
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    flag=true;
                }
            }
            if(!flag){
                System.out.println(i);
            }
        }
    }
}
