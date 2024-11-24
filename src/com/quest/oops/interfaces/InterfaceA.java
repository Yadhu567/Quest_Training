package com.quest.oops.interfaces;

public interface InterfaceA {
    void add();
    default void print() {
        System.out.println("hello");
    }
    static void hello() {
        System.out.println("hello");
    }
}
