package com.quest.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExampleClass {
    public static void main(String[] args) {
        HashMap<Double,Boolean> hashMap=new HashMap<>();
        hashMap.put(2.5,true);
        hashMap.put(3.4,false);
        hashMap.put(6.7,true);

        hashMap.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        System.out.println(hashMap.get(3.4));
        System.out.println(hashMap.remove(3.4));

        LinkedHashMap<Float,Short> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(2.3f, (short) 12);
        linkedHashMap.put(4.2f, (short) 32);
        linkedHashMap.put(7.9f, (short) 42);

        linkedHashMap.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        System.out.println(linkedHashMap.get(2.3f));
        System.out.println(linkedHashMap.remove(2.3f));

        TreeMap<Long,Character> treeMap=new TreeMap<>();
        treeMap.put(23L,'r');
        treeMap.put(68L,'s');
        treeMap.put(19L,'t');


        treeMap.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        System.out.println(treeMap.get(23L));
        System.out.println(treeMap.remove(23L));


    }

}
