package com.quest.oops.exception;

public class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() ;
    }
}
