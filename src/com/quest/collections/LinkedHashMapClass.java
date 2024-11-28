package com.quest.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(1,"Orange");
        linkedHashMap.put(2,"mango");
        linkedHashMap.put(3,"blueberry");
        linkedHashMap.put(4,"strawberry");

        for(Integer i:linkedHashMap.keySet()){
            System.out.println(i);
        }
        for(String s:linkedHashMap.values()){
            System.out.println(s);
        }
        for(Map.Entry<Integer,String> e:linkedHashMap.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println(linkedHashMap.get(2));
        System.out.println(linkedHashMap.remove(2,"mango"));
        System.out.println(linkedHashMap.isEmpty());
        System.out.println(linkedHashMap.size());
    }
}
