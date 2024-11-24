package com.quest.oops.exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter name of employee");
            String name = sc.nextLine();
            System.out.println("enter age of employee");
            int age = sc.nextInt();
            validateAge(age);
            System.out.println("enter salary of employee");
            double salary = sc.nextDouble();
            validateSalary(salary);

            System.out.println("Employee Details:");
            Employee emp = new Employee(name, age, salary);
            System.out.println(emp);
            System.out.println();

            System.out.println("Manager Details:");
            Manager mng = new Manager(name, age, salary);
            System.out.println(mng);

        }catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
            e.printStackTrace();
        }catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred");
            e.printStackTrace();
        }finally {
            System.out.println("--exiting--");
        }
    }
    public static void validateAge(int age) {
        if (age <= 0) {
            throw new ArithmeticException("Age should be positive.");
        }
    }
    public static void validateSalary(double salary) {
        if (salary < 0 || salary > 100000) {
            throw new ArithmeticException("Salary should be greater than zero and less than 1 lakh");
        }
    }
}


