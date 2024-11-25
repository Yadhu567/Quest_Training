package com.quest.exceptionexample;

public class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name,int age,double salary) throws InvalidInputException {
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    // getters and setters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age) throws InvalidInputException {
        if(age<18){ // for validating age
            throw new InvalidInputException("age must be greater than 18");
        }else{
            this.age=age;
        }
    }
    public void setSalary(double salary) throws InvalidInputException {
        if(salary<0){ // for validating salary
            throw new InvalidInputException("salary must be a positive value");
        }else{
            this.salary=salary;
        }
    }
    // for displaying details
    public void displayDetails(){
        System.out.println("name"+getName());
        System.out.println("age"+getAge());
        System.out.println("salary"+getSalary());
    }
   // overrides toString
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                '}';
    }
}
