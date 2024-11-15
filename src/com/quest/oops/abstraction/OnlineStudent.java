package com.quest.oops.abstraction;

public class OnlineStudent extends Student {

    @Override
    public void attendClass() {
        System.out.println("online student attends class");
    }
    @Override
    public void submitAssignment() {
        System.out.println("online student submit assignment");
    }
}
