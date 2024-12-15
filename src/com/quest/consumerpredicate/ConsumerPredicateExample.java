package com.quest.consumerpredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerPredicateExample {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>();

        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(1);

        Predicate<Integer> predicate= (element)-> element%2==0;

        Consumer<Integer> consumer=(element)-> System.out.println(element*2);

        ArrayList transformedList=new ArrayList();

        for (Integer i : arrayList) {
            if (predicate.test(i)) {
                consumer.accept(i);
                transformedList.add(i * 2);
            }
        }
        Supplier<List<Integer>> supplier = () -> transformedList;
        System.out.println("new list: "+supplier.get());

        Function<Integer,String> fun=(i)->{
            return i+"";
        };

        int a=3;

        fun.apply(a);

    }
}
