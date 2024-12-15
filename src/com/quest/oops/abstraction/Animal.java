package com.quest.oops.abstraction;

public abstract class Animal {
    public abstract void sleep();  //public by defaulf not static and final
    public void walk(){
        System.out.println("animal walks");
    }

}
