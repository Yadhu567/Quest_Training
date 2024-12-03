package com.quest.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(8);
//        priorityQueue.add(null);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.offer(4 );
//        priorityQueue.add(null);

        Iterator<Integer> itObj=priorityQueue.iterator();
        while (itObj.hasNext()){
            System.out.println(itObj.next());
        }
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());

        priorityQueue.forEach(System.out::println);

        System.out.println(priorityQueue.remove()); // removes first element
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.isEmpty());
        priorityQueue.clear();
    }
}
