package com.quest.oops.test1;

public class TestClass {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,8,9,10};
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

    }


//    public static int returnArray(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=i+1){
//                return i+1;
//            }
//        }
//        return 0;
//    }
}
