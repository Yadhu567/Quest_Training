package com.quest.collections.set;

import java.util.HashSet;


public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(6);
        hashSet.add(4);
        hashSet.add(1);
        hashSet.add(null);
        hashSet.add(null);
        for(Integer i:hashSet){
            System.out.println(i);
        }

        System.out.println(hashSet.remove(2));
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.contains(3));
        hashSet.clear();
        System.out.println(hashSet);
    }
}
