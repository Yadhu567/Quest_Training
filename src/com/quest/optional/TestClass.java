package com.quest.optional;

import java.util.Optional;

public class TestClass {
    public static void main(String[] args) {
        Optional<Integer> op=Optional.of(2);

        Optional<Integer> op2=Optional.ofNullable(null);

        Optional<Integer> op3=Optional.empty();

        if(op3.isPresent()){
            op3.get();
        }
        op2.orElse(2);



    }
}
