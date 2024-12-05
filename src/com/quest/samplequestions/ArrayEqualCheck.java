package com.quest.samplequestions;

public class ArrayEqualCheck {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,2,7,8};
        int[] arr2={2,3,4,6,2,7,8};

        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        if(count==arr.length){
            System.out.println("All elements in first array contained in second array");
        }else{
            System.out.println("All elements in first array not contained in second array");
        }

    }
}
