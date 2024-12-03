package com.quest.practice_problems;

import java.util.*;

public class MapValueSortting {
    public static void main(String[] args) {

        TreeMap<Person,Integer> treeMap=new TreeMap<>();

        treeMap.put(new Person("ravi",34),72);
        treeMap.put(new Person("ron",25),38);
        treeMap.put(new Person("hentry",89),54);
        treeMap.put(new Person("ken",43),78);
        treeMap.put(new Person("johan",35),22);

        ArrayList<Map.Entry<Person,Integer>> arrayList=new ArrayList<>(treeMap.entrySet());
//        arrayList.sort(Map.Entry.comparingByValue());
        arrayList.sort(new MapEntryComparator());
        for(Map.Entry<Person,Integer> entry:arrayList){
            System.out.println("name "+entry.getKey().getName()+" mark "+entry.getValue());
//            treeMap.put(entry.getKey(),entry.getValue());
        }

//        System.out.println("------");
//        System.out.println("another method");
//
//        ArrayList<Integer> arrayList2 = new ArrayList<>(treeMap.values());
//        arrayList2.sort(Integer::compareTo);
//
//        for(Integer i:arrayList2){
//            for (Map.Entry<Person, Integer> entry : treeMap.entrySet()) {
//                if (entry.getValue()==i) {
//                    System.out.println("name "+entry.getKey().getName()+" mark "+i);
//
//                }
//            }
//        }

    }
}
