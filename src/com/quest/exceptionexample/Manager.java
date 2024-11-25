package com.quest.exceptionexample;

public class Manager extends Employee {
    private final int teamSize;
    public Manager(String name,int age,double salary,int teamSize) throws InvalidInputException {
        super(name, age, salary);
        if(teamSize<1){ // for validating team size
            throw new IllegalArgumentException("Team size must be greater than zero.");
        }else{
            this.teamSize=teamSize;
        }
    }
  // overrides toString method
    @Override
    public String toString() {
        return super.toString() + ", Team Size: " + teamSize;
    }
}
