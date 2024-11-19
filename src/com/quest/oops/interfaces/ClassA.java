package com.quest.oops.interfaces;

public class ClassA implements InterfaceA ,InterfaceB {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.add1();
    }

    @Override
    public void add() {
        System.out.println("Interface A add method");
    }

    @Override
    public void sub() {
        System.out.println("Interface B Substract method");
    }

    @Override
    public void add1() {
        System.out.println("Interface B add1 method");
    }

}
