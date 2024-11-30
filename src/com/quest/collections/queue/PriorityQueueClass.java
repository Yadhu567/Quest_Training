package com.quest.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue1=new PriorityQueue<>();
        priorityQueue1.add(2);
        priorityQueue1.add(4);
        priorityQueue1.add(1);
        priorityQueue1.add(3);


        System.out.println(priorityQueue1);
        System.out.println(priorityQueue1.peek());
        while (!priorityQueue1.isEmpty()){
            System.out.println(priorityQueue1.poll());
        }

        PriorityQueue<Float> priorityQueue2=new PriorityQueue<>();
        priorityQueue2.add(4.2f);
        priorityQueue2.add(2.3f);
        priorityQueue2.add(3.7f);
        priorityQueue2.add(5.9f);

        System.out.println(priorityQueue2);
        System.out.println(priorityQueue2.peek());
        while (!priorityQueue2.isEmpty()){
            System.out.println(priorityQueue2.poll());
        }

        PriorityQueue<Double> priorityQueue3=new PriorityQueue<>();
        priorityQueue3.add(4.9);
        priorityQueue3.add(2.3);
        priorityQueue3.add(1.6);
        priorityQueue3.add(3.6);


        System.out.println(priorityQueue3);
        System.out.println(priorityQueue3.peek());
        while (!priorityQueue3.isEmpty()){
            System.out.println(priorityQueue3.poll());
        }

        PriorityQueue<String> priorityQueue4=new PriorityQueue<>();
        priorityQueue4.add("john");
        priorityQueue4.add("Mary");
        priorityQueue4.add("peter");
        priorityQueue4.add("nolan");


        System.out.println(priorityQueue4);
        System.out.println(priorityQueue4.peek());
        while (!priorityQueue4.isEmpty()){
            System.out.println(priorityQueue4.poll());
        }

        PriorityQueue<Long> priorityQueue5=new PriorityQueue<>();
        priorityQueue5.add(3L);
        priorityQueue5.add(1L);
        priorityQueue5.add(9L);
        priorityQueue5.add(4L);


        System.out.println(priorityQueue5);
        System.out.println(priorityQueue5.peek());
        while (!priorityQueue5.isEmpty()){
            System.out.println(priorityQueue5.poll());
        }


    }
}
