package com.quest.oops.test2;

public class TestClass {
    public static void main(String[] args) {
        int[] arr={10,3,2,4,6,8,9};
        for (int j = 1; j <= 10; j++) {
            boolean flag = false;
            for (int i = 0; i < arr.length; i++){
                if(arr[i]==j){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println(j);
            }
        }
        boolean[] present=new boolean[11];
        for(int i=0;i< arr.length;i++){
            present[arr[i]]=true;
        }
        for(int i=1;i<=10;i++){
            if(!present[i]){
                System.out.println(i);
            }
        }
        int[] newArr=new int[arr.length];
        int[] newArr1=new int[arr.length];

        for(int i=0;i< arr.length;i++){
            newArr[i]=arr[i]*2;
        }
        for(int i=1;i<10;i++){

        }

    }

}
