package com.quest.exception;

public class Manager extends  Employee implements Bonus{
    public Manager( String name,int age, double salary) {
        super(name,age,salary);
    }

    @Override
    public double calculateBonus() {
        return this.getSalary()*0.2;
    }

    @Override
    public String toString() {
        return super.toString()+ "Manager Bonus=" + calculateBonus();
    }
}
