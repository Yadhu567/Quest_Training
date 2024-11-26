package com.quest.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListClass {
    public static void main(String[] args) {
        ArrayList<Person> lst1= new ArrayList<>();
        ArrayList<Person> lst2= new ArrayList<>();
        lst1.add(new Person("john",22,"m","9999"));
        lst1.add(new Person("bob",24,"f","7845777"));
        for(Person p:lst1){
            if(p.getAge()>20){
                System.out.println(p.getName());
            }
        }
        lst2.addAll(lst1);
        ArrayList<Integer> lst=new ArrayList<>();
        lst.add(1);
        lst.add(2);
       /* for(Person p1:lst1){
            System.out.println(p1.getName()+p1.getAge());
        }*/
        ArrayList<Integer> lst3=new ArrayList<>();
        lst3.add(1);
        lst3.add(2);
        lst3.add(3);
        System.out.println(lst3.get(1));
//        lst.remove(2);
//        lst3.clear();
       /* for(int i:lst3){
            System.out.println(i);
        }*/
        Iterator<Person> itObj= lst1.iterator();
        while (itObj.hasNext()){
            Person p1=itObj.next();
            if(p1.getAge()>20) {
                System.out.println(p1.getName());
                System.out.println(p1.getAge());
            }
        }
    }

}
