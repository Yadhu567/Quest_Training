package com.quest.oops.multipleinheritance;

public class MainClass {
    public static void main(String[] args) {
        Manager mng=new Manager();

        mng.displayName("john");
        mng.displayAge(23);
        mng.displayDepartment("IT");
        mng.details();
        mng.displaySalary(59488.0);
    }
}
