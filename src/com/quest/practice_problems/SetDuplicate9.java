package com.quest.practice_problems;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDuplicate9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(7);

        HashSet<Integer> hashSet=new HashSet<>(arrayList);

        System.out.println(hashSet);



    }
}
