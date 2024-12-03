package com.quest.practice_questions;
import java.util.Scanner;
import java.lang.Math;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean s = true; // flag to check user wants to continue or not
        double result = 0;
        while (s) {
            System.out.println("Enter your choice: 1. Addition 2. Subtraction 3. Multiplication 4. Division 5. Square Root 6. Clear Current Result 7. Exit");
            int ch = sc.nextInt(); // represents the choice
            switch (ch) {
                case 1:
                    System.out.println("Enter the number to be added:");
                    double num = sc.nextDouble();
                    result += num;
                    System.out.println("Current result: " + result);
                    break;
                case 2:
                    System.out.println("Enter the number to be subtracted:");
                    double num1 = sc.nextDouble();
                    result -= num1;
                    System.out.println("Current result: " + result);
                    break;
                case 3:
                    System.out.println("Enter the number to be multiplied:");
                    double num2 = sc.nextDouble();
                    result *= num2;
                    System.out.println("Current result: " + result);
                    break;
                case 4:
                    System.out.println("Enter the number to be divided:");
                    double num3 = sc.nextDouble();
                    if (num3 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        result /= num3;
                        System.out.println("Current result: " + result);
                    }
                    break;
                case 5:
                    System.out.println("Enter the number to find the square root:");
                    if (result < 0) {
                        System.out.println("Invalid number for square root.");
                    } else {
                        result = Math.sqrt(result);
                        System.out.println("Square root: " + result);
                    }
                    break;
                case 6:
                    result = 0;
                    System.out.println("Result cleared. Current result: " + result);
                    break;
                // for exiting from the process 
                case 7:
                    s = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            if (s) {
                System.out.println("Do you want to continue? yes / no");
                String cn = sc.next();
                if (cn.equalsIgnoreCase("no")) {
                    s = false;
                }
            }
        }

        sc.close();
    }
}
