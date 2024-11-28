package com.quest.telecommanagementsystem;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SubscriberManagement subscriberManagement = new SubscriberManagement();
        CallHistoryManagement callHistoryManagement = new CallHistoryManagement();
        FileManagement fileManagement = new FileManagement();
        try {
            //adding Subscribers
            System.out.println("Enter the number of subscribers");
            int numberOfSubscribers = integerValidation(sc);
            sc.nextLine();// clear input
            for (int i = 0; i < numberOfSubscribers; i++) {
                System.out.println("Enter details for Subscriber " + (i + 1));

                System.out.println("Subscriber ID");
                String subscriberId = sc.nextLine();

                System.out.println("Name");
                String name = sc.nextLine();

                System.out.println("Phone Number");
                String phoneNumber = sc.nextLine();

                System.out.println("Plan Type Prepaid or Postpaid");
                String planType = sc.nextLine();

                System.out.println("Enter initial balance");
                double balance = doubleValidation(sc);
                sc.nextLine();//clear input

                Subscribers subscriber = new Subscribers(subscriberId, name, phoneNumber, planType, balance);
                subscriberManagement.addSubscriber(subscriber);
                fileManagement.saveSubscriber(subscriber); //saving subscriber to file

            }

            //display all subscribers
            System.out.println("Displaying all subscribers");
            subscriberManagement.displaySubscribers();

            //add Call Details
            System.out.println("Enter Subscriber ID for Call History");
            String subIdForCall = sc.nextLine();

            System.out.println("Call Type Local or STD or ISD");
            String callType = sc.nextLine();

            System.out.println("Call Duration");
            int duration = integerValidation(sc);
            sc.nextLine();//clear input

            CallHistory callHistory = new CallHistory(subIdForCall, callType, duration, java.time.LocalDateTime.now());
            callHistoryManagement.addCallHistory(callHistory);

            fileManagement.saveCallHistory(callHistory); //saving call history to file

            //call History
            System.out.println("Enter Subscriber ID to view Call History");
            String historyId = sc.nextLine();
            System.out.println("Call History for Subscriber ID " + historyId );
            callHistoryManagement.getCallHistoryBySubscriber(historyId);

            //updating  Balance
            System.out.println("Enter Subscriber ID to update balance for prepaid only");
            String balanceId = sc.nextLine();

            System.out.println("Enter new balance");
            double newBalance = doubleValidation(sc);
            sc.nextLine(); //clear input
            subscriberManagement.updateBalance(balanceId, newBalance);

            //generate bill
            System.out.println("Enter Subscriber ID to generate bill for postpaid only");
            String billId = sc.nextLine();
            subscriberManagement.generateBills(billId);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception error occurred"+e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Input mismatch Exception error occurred"+e.getMessage());
        }

    }
    // integer validation
    private static int integerValidation(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer");
            sc.next();
        }
        return sc.nextInt();
    }
    // double validation
    private static Double doubleValidation(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid integer");
            sc.next();
        }
        return sc.nextDouble();
    }
}
