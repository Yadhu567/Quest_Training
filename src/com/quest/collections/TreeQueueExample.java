package com.quest.collections;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class TreeQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        TreeSet<Integer> treeSet=new TreeSet<>();

        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(4);
        priorityQueue.add(4);
        priorityQueue.add(5);
//        priorityQueue.add(null);
//        priorityQueue.add(null);

        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(8);
        treeSet.add(2);
//        treeSet.add(null);
//        treeSet.add(null);

        priorityQueue.forEach(System.out::println);
        System.out.println();
        treeSet.forEach((v)->
                System.out.println(v)
        );
    }
}
