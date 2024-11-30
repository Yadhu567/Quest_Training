package com.quest.collections.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);

        System.out.println(arrayList.stream().findFirst().get());
        System.out.println(arrayList.stream().findAny().get());
        System.out.println(arrayList.stream().count());
        System.out.println(arrayList.stream().distinct().count());
        System.out.println(arrayList.stream().reduce(0,Integer::sum));
        System.out.println(arrayList.stream().max(Integer::compareTo).get());
        System.out.println(arrayList.stream().min(Integer::compareTo).get());

        Optional<Integer> op=arrayList.stream().min(Integer::compareTo);
        System.out.println(op.get());

        List<Integer> list1=arrayList.stream().filter(i->i%2==0).toList();
        System.out.println(list1);

        List<Integer> list2=arrayList.stream().map(i->i*2).toList();
        System.out.println(list2);

        int sum=arrayList.stream().map(integer->integer*2).reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
