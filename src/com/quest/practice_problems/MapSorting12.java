package com.quest.practice_problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class MapSorting12 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(5,"apple");
        hashMap.put(2,"orange");
        hashMap.put(6,"banana");
        hashMap.put(3,"mango");
        hashMap.put(4,"grapes");

        TreeMap<Integer,String> treeMap=new TreeMap<>(hashMap);

        for(Map.Entry<Integer,String> e:treeMap.entrySet()){
            System.out.println(e.getKey()+" = "+e.getValue());
        }
    }
}
