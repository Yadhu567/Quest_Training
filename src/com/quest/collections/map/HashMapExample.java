package com.quest.collections.map;

import java.util.HashMap;
import java.util.Map;

public class  HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(5,"banana");
        hashMap.put(2,"apple");
        hashMap.put(3,"orange");
        hashMap.put(4,"grape");
        hashMap.put(2,"watermelon");
        for(String s:hashMap.values()){
            System.out.println(s);
        }
        for(Integer i:hashMap.keySet()){
            System.out.println(i);
        }
        for(Map.Entry<Integer,String> e:hashMap.entrySet()){
            System.out.println(e.getKey()+e.getValue());
        }

        hashMap.containsKey(2);
        hashMap.containsValue("banana");
        System.out.println(hashMap.get(9)); //it returns null when key is not available
        System.out.println(hashMap.remove(3,"orange"));
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());

        hashMap.clear();
    }
}
