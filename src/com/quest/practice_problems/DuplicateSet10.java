package com.quest.practice_problems;

import java.util.HashSet;

public class DuplicateSet10 {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,2,5,6,3,4,7};
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:arr){
            if(!hashSet.add(i)){
                System.out.println("the first duplicate number is "+i);
                break;
            }
        }
    }
}
