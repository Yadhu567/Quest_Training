package com.quest.practice_vars;

import java.util.Scanner;

public class EmployeeManagementSystem {
    // Employee class
    static class Employee {
        String name;
        double baseSalary;
        double[] monthlySalary;

        Employee(String name, double baseSalary, double[] monthlySalary) {
            this.name = name;
            this.baseSalary = baseSalary;
            this.monthlySalary = monthlySalary;
        }

        // for calculating Total Salary
        double totalSalary() {
            double total = 0;
            for (int i = 0; i < 12; i++) {
                total += monthlySalary[i];
            }
            return total;
        }

        // for calculating Average Salary
        double averageSalary() {
            return totalSalary() / 12;
        }

        double calculateBonus() {
            return baseSalary * 0.10;
        } // for calculating bonus

        // for displaying Salary Details
        void displaySalaryDetails() {
            System.out.println("Name: " + name);
            System.out.println("Base Salary: " + baseSalary);
            System.out.println("Monthly Salary Breakdown:");
            for (int i = 0; i < 12; i++) {
                System.out.println("Month-" + (i + 1) + ": " + monthlySalary[i]);
            }
            System.out.println("Total Salary for the Year: " + totalSalary());
            System.out.println("Average Monthly Salary: " + averageSalary());
            System.out.println("Bonus: " + calculateBonus());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Employees:");
        int numberOfEmployee = getInteger(sc);
        Employee[] employees = new Employee[numberOfEmployee]; // array to store n employee objects
        double totalEmployeeSalary = 0;

        for (int i = 0; i < numberOfEmployee; i++) {
            sc.nextLine();
            System.out.println("Enter Name of Employee " + (i + 1) + ":");
            String name = sc.nextLine();
            System.out.println("Enter base Salary of Employee " + name + ":");
            double baseSalary = getValidSalary(sc); // for validating the base salary

            double[] monthlySalary = new double[12];
            for (int j = 0; j < 12; j++) {
                System.out.println("Enter salary for month " + (j + 1) + " (0-100000):");
                monthlySalary[j] = getValidSalary(sc); // for validating the monthly salary
            }

            employees[i] = new Employee(name, baseSalary, monthlySalary);
            totalEmployeeSalary += employees[i].totalSalary();
        }

        System.out.println("--- Employee Salary Report ---");
        for (int i = 0; i < numberOfEmployee; i++) {
            employees[i].displaySalaryDetails();
        }
        System.out.println("Average Salary for All Employees: " + totalEmployeeSalary / numberOfEmployee); // total average salary
        sc.close();
    }
    // For validating integer
    private static Integer getInteger(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer for the number of employees.");
                sc.next(); // Clear the invalid input
            }
        }
    }

    // for validating salary
    private static double getValidSalary(Scanner sc) {
        double salary = 0;
        while (true) {
            try {
                salary = sc.nextDouble();
                if (salary >= 0 && salary <= 100000) {   // condition to check valid salary or not
                    break;
                } else {
                    System.out.println("Invalid value, enter again!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid salary (0-100000).");
                sc.next(); // Clear the invalid input
            }
        }
        return salary;
    }
}
