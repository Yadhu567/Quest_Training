package com.quest.oops.bankassignment;
import java.util.Scanner;
public class Mainclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account=null; // default value of object
        while(true) {
            System.out.println("enter your choice \n 1.Create Savings Account 2." +
                    "Create Current Account 3.Deposit Money 4.Withdraw Money " +
                    "5.View Account Details 6.Exit");
            int choice = integerValidation(sc); // to validate integer
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String savingsAccNumber = sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String savingsHolderName = sc.nextLine();
                    System.out.print("Enter Balance Amount: ");
                    double savingsBalance = doubleValidation(sc); // to validate double
                    account = new SavingsAccount(savingsAccNumber, savingsHolderName, savingsBalance);
                    System.out.println("Savings Account created successfully.");
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    String currAccNumber = sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String currHolderName = sc.nextLine();
                    System.out.print("Enter Balance Amount: ");
                    double currBalance = doubleValidation(sc); // to validate double
                    account = new CurrentAccount(currAccNumber, currHolderName, currBalance);
                    System.out.println("Savings Account created successfully.");
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = doubleValidation(sc); // to validate double
                    Transaction deposit = new Deposit(account);
                    deposit.processTransaction(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = doubleValidation(sc); // to validate double
                    Transaction withdraw = new Withdraw(account);
                    withdraw.processTransaction(withdrawAmount);
                    break;
                case 5:
                    if(account!=null) {
                        account.accountDetails(); //display account details
                    }
                    else{
                        System.out.println("No account is found.");
                    }
                    break;
                case 6:
                    return; // to exit from loop
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    // integer validation
    private static int integerValidation(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            sc.next();
        }
        return sc.nextInt();
    }

    // double validation
    private static Double doubleValidation(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            sc.next();
        }
        return sc.nextDouble();
    }
}
