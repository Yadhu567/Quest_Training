package com.quest.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> arrayList= Arrays.asList(2,4,3,3,4,6,7,9,2);

        int firstMax=arrayList.stream().findFirst().get();


        Stream<Integer> integerStream=Stream.of(2,4,3,3,4,6,7,9,2);
        Optional<Integer> secondMax=arrayList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        System.out.println(secondMax.get());


    }
}
