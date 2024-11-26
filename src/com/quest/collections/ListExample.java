package com.quest.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ListExample {
    public static void main(String[] args) {
        ArrayList<Person> personList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter details for 3 person's");
        for(int i=0;i<3;i++){
            System.out.println("name");
            String name=sc.nextLine();
            System.out.println("age");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.println("gender");
            String gender=sc.nextLine();
            System.out.println("Phone Number");
            String phoneNumber=sc.nextLine();
            personList.add(new Person(name,age,gender,phoneNumber));
        }
        System.out.println("person details are");
        for(Person p:personList){
            System.out.println(p.getName()+" "+p.getAge()+" "+p.getGender()+" "+p.getPhoneNUmber());
        }
        System.out.println("person with age below 20");
        ageBelow(personList);
        System.out.println();
        System.out.println("person with age above 20");
        ageAbove(personList);

    }
    public static void ageBelow(ArrayList<Person> personList){
        Iterator<Person> itObj= personList.iterator();
        while (itObj.hasNext()){
            Person obj=itObj.next();
            if(obj.getAge()>20) {
                System.out.print(obj.getName()+" ");
                System.out.print(obj.getAge()+" ");
                System.out.print(obj.getGender()+" ");
                System.out.print(obj.getPhoneNUmber()+" ");
                System.out.println();
            }
        }
    }
    public static void ageAbove(ArrayList<Person> personList){
        Iterator<Person> itObj= personList.iterator();
        while (itObj.hasNext()){
            Person obj=itObj.next();
            if(obj.getAge()<20) {
                System.out.print(obj.getName()+" ");
                System.out.print(obj.getAge()+" ");
                System.out.print(obj.getGender()+" ");
                System.out.print(obj.getPhoneNUmber()+" ");
            }
        }
    }

}
