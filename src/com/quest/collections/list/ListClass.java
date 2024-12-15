package com.quest.collections.list;

import com.quest.collections.Person;

import java.util.*;

public class ListClass {
    public static void main(String[] args) {
        ArrayList<Person> lst1= new ArrayList<>();
        ArrayList<Person> lst2= new ArrayList<>();
        lst1.add(new Person("john",22,"m","937373999"));
        lst1.add(new Person("bob",24,"f","7845777"));
        for(Person p:lst1){
            if(p.getAge()>20){
                System.out.println(p.getName());
            }
        }
        Collection<Integer> newObj  =new ArrayList<>();
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
        lst3.contains(2);
        lst3.add(null);
        lst3.add(null);
        System.out.println(lst3);
        System.out.println(lst3.get(1));
        System.out.println(lst3.contains(2));
        lst3.stream().max(Comparator.comparingInt(Integer::intValue));
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

        int[] arr={2,4,5,6};
        System.out.println(Arrays.toString(arr));  // to print in array form an array
    }

}
