package com.quest.oops.test1;

public class TestClass {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,8,9,6,10};
        for (int j = 1; j <= 10; j++) {
            boolean flag = false;
            for (int i = 0; i < arr.length; i++){
                if(arr[i]==j){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(j);
            }
        }
       boolean[] check = new boolean[11];
       for(int i=0;i<arr.length;i++){
           if(arr[i]>=1 && arr[i]<=10){
               check[arr[i]]=true;
           }
       }
       for(int i=1;i<10;i++){
           if(!check[i]){
               System.out.println(i);
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
