package com.quest.oops.oopassignment;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private final String COMPANY="AAAA";

    public Employee() {
        this.name="Rony";
        this.age=32;
        this.salary=56000.0;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public void displayDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", COMPANY='" + COMPANY + '\'' +
                '}';
    }
}
