package com.quest.oops.multipleinheritance;

public interface Employee {
    void displaySalary(double salary);

    void displayDepartment(String dept);

    default void details(){
        System.out.println("this is employee class");
    }
}
