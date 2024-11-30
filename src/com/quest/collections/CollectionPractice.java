package com.quest.collections;

import java.util.PriorityQueue;

public class CollectionPractice {
    public static void main(String[] args) {
        Student std1=new Student(107,"ron",34.5);
        Student std2=new Student(102,"tony",64.2);
        Student std3=new Student(106,"kane",74.7);
        Student std4=new Student(101,"logan",24.1);
        Student std5=new Student(104,"nolan",32.9);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(std1);
        priorityQueue.add(std2);
        priorityQueue.add(std3);
        priorityQueue.add(std4);
        priorityQueue.add(std5);


        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

    }
}
