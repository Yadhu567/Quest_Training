package com.quest.oopassignment;

public class MainClass {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayDetails();
        System.out.println();
        Employee emp2 = new Employee("Daniel",22,35000.0);
        emp2.displayDetails();
        System.out.println();
        Manager manager=new Manager("James",24,45000.0,4);
        manager.displayDetails();
        System.out.println();
        Employee emp3=new Employee("John",28,75000.0);
        System.out.println(emp3);
    }
}
