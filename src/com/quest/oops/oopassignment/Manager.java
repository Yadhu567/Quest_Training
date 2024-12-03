package com.quest.oops.oopassignment;

public class Manager extends Employee implements TeamSize{
    private int teamSize;
    public Manager(String name, int age, double salary,int teamSize) {
        super(name, age, salary);
        this.teamSize=teamSize;
    }

    @Override
    public void teamSize() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
