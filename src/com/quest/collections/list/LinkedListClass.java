package com.quest.collections.list;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> lst=new LinkedList<>();
        lst.add("john");
        lst.add("johan");
        lst.add("james");
        lst.add("justin");
        lst.add(4,"luna");
        lst.addFirst("smith");
        lst.addLast("jane");

        System.out.println(lst.getFirst());
        System.out.println(lst.getLast());
        System.out.println(lst.get(2));
        System.out.println(lst.removeFirst());
        System.out.println(lst.removeLast());
        System.out.println(lst.remove(3));
        System.out.println(lst.size());
        System.out.println(lst.contains("john"));
//        lst.clear();

//        for(String str:lst){
//            System.out.println("list is empty");
//            System.out.println(str);
//        }

        LinkedList<String> lst2=new LinkedList<>();
        lst2.isEmpty();

    }
}
