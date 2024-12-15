package com.quest.oops.test1;

public abstract class AbstractClass {
    public abstract void drive();
    void add(){
        System.out.println("abstract class add content");
    }
    AbstractClass(){
        System.out.println("abstract constructor");
        add();

    }
}
