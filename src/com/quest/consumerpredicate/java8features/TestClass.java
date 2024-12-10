package com.quest.consumerpredicate.java8features;

import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestClass {
    public static void main(String[] args) {
        Random rd=new Random();
        Supplier<Integer> randomSupplier=()-> rd.nextInt(1,100);

        Predicate<Integer> isEvenPredicate = TestClass::isEven;

        Function<Integer, Integer> sampleFun = number ->{ if(isEven(number)){
            number=number*number;
        }else{
            number=2*number;
        }
            return number;
        };

        Consumer<String> resConsumer = System.out::println;

        squareOfDouble(randomSupplier,isEvenPredicate,sampleFun,resConsumer);


    }
    public static void squareOfDouble(Supplier<Integer> supplier, Predicate<Integer> predicate,
                               Function<Integer, Integer> function, Consumer<String> consumer) {
        int number = supplier.get();

        if (predicate.test(number)) {
            Optional<Integer> result = Optional.of(function.apply(number));

            result.ifPresentOrElse(
                    res -> consumer.accept("result: "+res),
                    () -> consumer.accept("no result")
            );
        } else {
            consumer.accept("no result");
        }
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
