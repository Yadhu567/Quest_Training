package com.quest.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Integer,String > treeMap=new TreeMap<>();
        treeMap.put(1,"john");
        treeMap.put(2,"smith");
        treeMap.put(3,"ron");
        treeMap.put(4,"logan");

        treeMap.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
        System.out.println(treeMap.get(1));
        System.out.println(treeMap.isEmpty());
        System.out.println(treeMap.size());
        System.out.println(treeMap.containsValue("john"));
        System.out.println(treeMap.containsKey(2));
        System.out.println(treeMap.remove(2));
        treeMap.clear();

        for(Map.Entry<Integer,String> e:treeMap.entrySet()){
            e.getKey();
            e.getValue();
        }
    }
}
