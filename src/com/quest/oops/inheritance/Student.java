package com.quest.oops.inheritance;

public class Student extends Person {
    private final String schoolName;
    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }
    private void study(){
        System.out.println("Student study"+this.name);
    }
    @Override
    public void nameDisplay() {
        super.nameDisplay();
        System.out.println("I studied at school "+this.schoolName);
    }
}
