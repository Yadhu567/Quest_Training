package com.quest.collections.list;

import com.quest.collections.Person;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Person> personList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter details for 3 person's");
        for (int i = 0; i < 3; i++) {
            System.out.println("name");
            String name = sc.nextLine();
            System.out.println("age");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("gender");
            String gender = sc.nextLine();
            System.out.println("Phone Number");
            String phoneNumber = sc.nextLine();
            personList.add(new Person(name, age, gender, phoneNumber));
        }
        System.out.println("person details are");
        for (Person p : personList) {
            System.out.println(p.getName() + " " + p.getAge() + " " + p.getGender() + " " + p.getPhoneNUmber());
        }
        System.out.println("person with age below 20");
        ageBelow(personList);
        System.out.println();
        System.out.println("person with age above 20");
        ageAbove(personList);
    }

    public static void ageBelow(LinkedList<Person> personList) {
        for (Person p : personList) {
            if (p.getAge() > 20) {
                System.out.print(p.getName() + " ");
                System.out.print(p.getAge() + " ");
                System.out.print(p.getGender() + " ");
                System.out.print(p.getPhoneNUmber() + " ");
            }
        }
        for(int i=0;i<personList.size();i++){
            Person obj=personList.get(i);
            System.out.print(obj.getName() + " ");
            System.out.print(obj.getAge() + " ");
            System.out.print(obj.getGender() + " ");
            System.out.print(obj.getPhoneNUmber() + " ");
        }
    }

    public static void ageAbove(LinkedList<Person> personList) {
        Iterator<Person> itObj = personList.iterator();
        while (itObj.hasNext()) {
            Person obj = itObj.next();
            if (obj.getAge() < 20) {
                System.out.print(obj.getName() + " ");
                System.out.print(obj.getAge() + " ");
                System.out.print(obj.getGender() + " ");
                System.out.print(obj.getPhoneNUmber() + " ");
            }
        }
    }

}


