package com.quest.oops.multipleinheritance;

public interface Person {
    void displayName(String name);

    void displayAge(int age);

    default void details(){
        System.out.println("this is a person interface");
    }
}
