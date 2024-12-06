package com.quest.streams;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class StreamClass {
    public static void main(String[] args) {
        List<Integer> arrayList= Arrays.asList(2,4,3,2);

        List<Integer> arrayList2=arrayList.stream().findFirst().stream().toList();
        System.out.println(arrayList2);

        Consumer<Integer> integerConsumer = (i) -> {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        };

        arrayList.stream().peek(integerConsumer).forEach(i->{});
    }

    }

