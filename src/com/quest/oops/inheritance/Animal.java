package com.quest.oops.inheritance;

public class Animal {
    String color;
    int age;
    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }
    public void getInfo() {
        System.out.println("color: " + color);
    }
}
