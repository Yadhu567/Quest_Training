package com.quest.practice_problems;

import java.util.Arrays;
import java.util.HashSet;

public class SetExistence7 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        HashSet<Integer> hashSet2=new HashSet<>();

        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(9);
        hashSet.add(7);
        hashSet.add(3);
        hashSet.add(6);

        hashSet2.add(2);
        hashSet2.add(5);
        hashSet2.add(11);
        hashSet2.add(17);
        hashSet2.add(3);
        hashSet2.add(16);

        int count=0;
        for(Integer i:hashSet){
            if(!hashSet2.add(i)){
                count++;
            }
        }
        if(count==hashSet.size()){
            System.out.println("hashset 2 contain all elements in hashset 1");
        }else{
            System.out.println("hashset 2 not contain all elements in hashset 1");
        }

    }
}
