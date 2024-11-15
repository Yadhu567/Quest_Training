package com.quest.oops.abstraction;

public class RegularStudent extends Student {

    @Override
    public void attendClass() {
        System.out.println("regular student attends class");
    }

    @Override
    public void submitAssignment() {
        System.out.println("regular student submit assignment");
    }
}
