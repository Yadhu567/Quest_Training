package com.quest.practice_problems;

import java.util.ArrayList;

public class MergeList3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList1.add("hello");
        arrayList1.add("welcome");
        arrayList1.add("world");

        arrayList2.add("hello");
        arrayList2.add("come");
        arrayList2.add("here");

        for (String s : arrayList2) {
            if (!arrayList1.contains(s)) {
                arrayList1.add(s);
            }
        }
        for (String s : arrayList2) {
            System.out.println(s);
        }
    }
}
