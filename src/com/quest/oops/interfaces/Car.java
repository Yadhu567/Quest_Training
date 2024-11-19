package com.quest.oops.interfaces;

public class Car implements Vehicle {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.engine();
        obj.horn();
    }
    @Override
    public void engine() {
        System.out.println("This is a car engine");
    }

    @Override
    public void horn() {
        System.out.println("This is a car horn");
    }
}
