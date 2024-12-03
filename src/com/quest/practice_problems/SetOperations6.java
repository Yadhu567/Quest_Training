package com.quest.practice_problems;

import java.util.HashSet;

public class SetOperations6 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        HashSet<Integer> hashSet2=new HashSet<>();

        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(9);
        hashSet.add(7);
        hashSet.add(3);
        hashSet.add(6);

        hashSet2.add(2);
        hashSet2.add(5);
        hashSet2.add(9);
        hashSet2.add(7);
        hashSet2.add(3);
        hashSet2.add(6);

        HashSet<Integer> union = new HashSet<>(hashSet);
        union.addAll(hashSet2);
        System.out.println("union" + union);

        HashSet<Integer> intersection = new HashSet<>(hashSet);
        intersection.retainAll(hashSet2);
        System.out.println("intersection " + intersection);

        HashSet<Integer> difference = new HashSet<>(hashSet);
        difference.removeAll(hashSet2);
        System.out.println("difference of hashset1 and hashset2" + difference);


    }
}
