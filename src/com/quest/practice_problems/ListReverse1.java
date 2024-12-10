package com.quest.practice_problems;

import java.util.ArrayList;

public class ListReverse1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();// List.of() or Arrays.asList()
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(6);

        int size = arrayList.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = arrayList.get(i);
            arrayList.set(i,arrayList.get(size-i-1));
            arrayList.set(size-i-1,temp);
        }

        for (Integer i:arrayList) {
            System.out.println(i);
        }
    }
}
