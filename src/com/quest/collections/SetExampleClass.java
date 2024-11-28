package com.quest.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Random;
public class SetExampleClass {
    public static void main(String[] args) {

        HashSet<Integer> hashSet1=new HashSet<>();
        HashSet<Integer> hashSet2=new HashSet<>();
        HashSet<Integer> hashSet3=new HashSet<>();

        LinkedHashSet<Integer> linkedHashSet1=new LinkedHashSet<>();
        LinkedHashSet<Integer> linkedHashSet2=new LinkedHashSet<>();
        LinkedHashSet<Integer> linkedHashSet3=new LinkedHashSet<>();

        TreeSet<Integer> treeSet1=new TreeSet<>();
        TreeSet<Integer> treeSet2=new TreeSet<>();
        TreeSet<Integer> treeSet3=new TreeSet<>();

        for(int i=1;i<=100;i++){
            hashSet1.add(i);
            linkedHashSet1.add(i);
            treeSet1.add(i);
        }
        System.out.println("After first operation hashset");
        for(Integer i:hashSet1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("After first operation linked hashset");
        for(Integer i:linkedHashSet1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("After first operation tree set");
        for(Integer i:treeSet1){
            System.out.print(i+" ");
        }
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            hashSet2.add(random.nextInt(50));
            linkedHashSet2.add(random.nextInt(50));
            treeSet2.add(random.nextInt(50));
        }
        System.out.println("After second operation hashset");
        for(Integer i:hashSet2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("After second operation linked hashset");
        for(Integer i:linkedHashSet2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("After second operation tree set");
        for(Integer i:treeSet2){
            System.out.print(i+" ");
        }
        System.out.println();

        try {
            for (int i = 0; i < 10; i++) {
                hashSet3.add(34);
                hashSet3.add(null);
                hashSet3.add(67);
                hashSet3.add(24);
                hashSet3.add(null);

                linkedHashSet3.add(34);
                linkedHashSet3.add(null);
                linkedHashSet3.add(67);
                linkedHashSet3.add(24);
                linkedHashSet3.add(null);

                treeSet3.add(34);
                treeSet2.add(null);
                treeSet3.add(67);
                treeSet3.add(24);
                treeSet3.add(null);
            }

        }catch (NullPointerException e){
            System.out.println("After third operation hashset");
            for (Integer i : hashSet3) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("After third operation linked hashset");
            for (Integer i : linkedHashSet3) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("After third operation tree set");
            for (Integer i : treeSet3) {
                System.out.print(i + " ");

            System.out.println("null pointer exception occurred in tree set");

            }
        }
    }
}
