package com.quest.collections;

import java.util.*;

public class CollectionImpl {
    public static void main(String[] args) {
        Person person1 = new Person("john", 22, "M", "907896");
        Person person2 = new Person("smith", 42, "M", "9033896");
        Person person3 = new Person("mary", 32, "F", "9056896");
        ArrayList<Person> arrayList = new ArrayList<>();
        HashSet<Person> hashSet = new HashSet<>();
        HashMap<Integer, Person> hashMap = new HashMap<>();
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();

        Comparator<Person> compareObj=Comparator.comparing(Person::getAge);

        PriorityQueue<Person> priorityQueue2=new PriorityQueue<>(compareObj);

//
//        //add operation
//        arrayList.add(person1);
//        arrayList.add(person2);
//        arrayList.add(person3);
//
//        hashSet.add(person1);
//        hashSet.add(person2);
//        hashSet.add(person3);
//
//        hashMap.put(1, person1);
//        hashMap.put(2, person2);
//        hashMap.put(3, person3);
//
//        priorityQueue2.add(person1);
//        priorityQueue2.add(person2);
//        priorityQueue2.add(person3);
//
//
//
//        // Displaying data
//        System.out.println("ArrayList:");
//        for (Person person : arrayList) {
//            System.out.println(person.getName());
//        }
//
//        System.out.println("HashSet:");
//        for (Person person : hashSet) {
//            System.out.println(person.getName());
//        }
//
//        System.out.println("HashMap:");
//        for (Map.Entry<Integer, Person> entry : hashMap.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().getName());
//        }
//
//        System.out.println("PriorityQueue:");
//
//        while (!priorityQueue2.isEmpty()){
//            System.out.println(priorityQueue2.poll().getName());
//        }
    }
}




