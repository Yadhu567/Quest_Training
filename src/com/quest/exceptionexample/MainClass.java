package com.quest.exceptionexample;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = null; // initially null
        while (emp == null) { // loop as for as objects is null
            try {
                System.out.println("Enter employee details");
                System.out.print("Enter employee name: ");
                String name = sc.nextLine();

                System.out.print("Enter employee age: ");
                int age = sc.nextInt();

                System.out.print("Enter employee salary: ");
                double salary = sc.nextDouble();
                sc.nextLine(); // Clear input

                emp = new Employee(name, age, salary);
            }catch (InvalidInputException e) {
                System.out.println(e.getMessage() + " Please re-enter all values.");
            }catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter again");
                sc.nextLine(); // Clear input
            }
        }

        Manager mng = null; // initially null
        while (mng == null) { // loop as for as objects is null
            try {
                System.out.println("Enter manager details");
                System.out.print("Enter manager name: ");
                String name = sc.nextLine();

                System.out.print("Enter manager age: ");
                int age = sc.nextInt();

                System.out.print("Enter manager salary: ");
                double salary = sc.nextDouble();

                System.out.print("Enter team size: ");
                int teamSize = sc.nextInt();
                sc.nextLine(); // Clear input

                mng = new Manager(name, age, salary, teamSize);
            }catch (InvalidInputException e) {
                System.out.println(e.getMessage() + " Please re-enter all values.");
            }catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter again");
                sc.nextLine(); // Clear input
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Please re-enter all values.");
            }
        }
        // for displaying details
        System.out.println("Employee Details:");
        emp.displayDetails();
        System.out.println("Manager Details:");
        System.out.println(mng);
    }
}
