package com.quest.oops.multipleinheritance;

public class Manager implements Person,Employee {
    @Override
    public void displaySalary(double salary) {
        System.out.println("this is the salary"+salary);
    }

    @Override
    public void displayDepartment(String dept) {
        System.out.println("this is the department"+dept);

    }

    @Override
    public void displayName(String name) {
        System.out.println("name:"+name);
    }

    @Override
    public void displayAge(int age) {
        System.out.println("age:"+age);
    }

    @Override
    public void details() {
        Employee.super.details();  // super to access the parent class here two parent interface so need to specify the which one
        Person.super.details();
    }
}
