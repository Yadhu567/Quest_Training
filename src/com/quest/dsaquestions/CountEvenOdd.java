package com.quest.dsaquestions;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,8,2,1,9};

        int evenc=0;

        int oddc=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                evenc++;
            }
            else {
                oddc++;
            }
        }
        System.out.println("even count "+evenc);
        System.out.println("odd count "+oddc);
    }
}
