package com.quest.oops.test1;

public class NonAbstractClass extends AbstractClass  {
    @Override
    public void drive() {
        System.out.println("hello");
    }

    public void add(){
        super.add();
    }
}
