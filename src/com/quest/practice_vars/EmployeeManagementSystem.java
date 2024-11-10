package com.quest.practice_vars;
import java.util.Scanner;
public class EmployeeManagementSystem {
    static class Employee {
        String name;
        double baseSalary;
        double[] monthlySalary= new double[12];
        Employee(String name, double baseSalary,double[] monthlySalary) {
            this.name = name;
            this.baseSalary = baseSalary;
            this.monthlySalary= monthlySalary;
        }
        double totalSalary() {
            double total = 0;
            for (int i = 0; i < 12; i++) {
                total += monthlySalary[i];
            }

            return total;

        }
        double averageSalary() {
            return totalSalary()/12;
        }
        double calculateBonus() {
            return baseSalary * 0.10;
        } // for calculating bonus
        void displaySalaryDetails(){
            System.out.println("Name: " + name);
            System.out.println("Base Salary: " + baseSalary);
            System.out.println("Monthly Salary Breakdown:");
            for (int i = 0; i < 12; i++) {
                System.out.println("Month "+(i+1)+":"+monthlySalary[i]);
            }
            System.out.println("Total Salary for the Year: " + totalSalary());
            System.out.println("Average Monthly Salary: " + averageSalary());
            System.out.println("Bonus:" + calculateBonus());

        }

    }
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of Employees:");
            int n = 0; // number of employees
            try {
                n = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer for the number of employees.");
                sc.next();
                continue;
            }
            double[] monthlySalary = new double[12];
            Employee[] employees = new Employee[n]; // array to store n employee objects
            double totalEmployeeSalary = 0;
            for(int i = 0; i < n; i++) {
                sc.nextLine();
                System.out.println("Enter Name of Employee" + (i + 1) + ":");
                String name = sc.nextLine();
                System.out.println("Enter base Salary of Employee " + name + ":");
                double baseSalary = getValidSalary(sc); // for validating the base salary
                sc.nextLine();
                for (int j = 0; j < 12; j++) {
                    System.out.println("Enter salary for month" + (j + 1) + "(0-100000):");
                    monthlySalary[j] = getValidSalary(sc); // for validating the monthly salary
                }
                employees[i] = new Employee(name, baseSalary, monthlySalary);
                totalEmployeeSalary += employees[i].totalSalary();
            }

            System.out.println("--- Employee Salary Report ---");
            for (int i = 0; i < n; i++) {
                employees[i].displaySalaryDetails();
            }
            System.out.println("Average Salary for All Employees:"+totalEmployeeSalary/n);
            return;
        }
    }

    private static double getValidSalary(Scanner sc) {
        double salary = 0;
        while(true) {
            try{
                salary = sc.nextDouble();
                if (salary >= 0 && salary <= 100000) {   // condition to valid salary or not
                    break;
                } else {
                    System.out.println("invalid value, enter again!");
                }
            }catch(Exception e) {
                System.out.println("Invalid input! Please enter an integer for the salary.");
                sc.next();
            }
        }
        return salary;
    }
}
