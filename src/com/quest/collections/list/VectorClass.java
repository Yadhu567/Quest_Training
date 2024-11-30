package com.quest.collections.list;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        ArrayList<Integer> list=new ArrayList<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.addAll(list);
        System.out.println(vector.get(2));
        System.out.println(vector.size());
        System.out.println(vector.isEmpty());
        System.out.println(vector.remove(2));

    }
}
