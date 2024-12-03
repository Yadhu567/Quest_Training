package com.quest.telecommanagementsystem;

import java.util.ArrayList;

public class SubscriberManagement implements SubscriberOperations {
    ArrayList<Subscriber> subscribersList = new ArrayList<>(); // to store subscribers list
    Subscriber[] sus=new Subscriber[4];
    @Override
    public void addSubscriber(Subscriber subscriber) {
        if (subscriber == null) {
            System.out.println("Invalid subscriber. Subscriber or Subscriber ID cannot be null.");
            return; // if id is null then returns
        }
        for (Subscriber sub : subscribersList) {
            if (sub.getSubscriberId().equalsIgnoreCase(subscriber.getSubscriberId())) {
                System.out.println("subscriber with this id already exists");
                return;
            }
        }
        subscribersList.add(subscriber);
        System.out.println("Subscriber added successfully.");
    }

    @Override
    public void getSubscriber(String subscriberId) {
        if (subscriberId == null) {
            System.out.println("Invalid Subscriber ID.");
            return; //if id is  null then returns
        }
        boolean found=false;
        for (Subscriber sub : subscribersList) {
            if (sub.getSubscriberId().equalsIgnoreCase(subscriberId)) {
                System.out.println(sub);
                found=true;
            }
        }
        if(!found) {
            System.out.println("No subscriber found with ID: " + subscriberId);
        }

    }

    @Override
    public void displaySubscribers() {
        if (subscribersList.isEmpty()) { // checks list is empty
            System.out.println("No subscribers in the system.");
            return;
        }
        System.out.println("The subscribers list are");
        for (Subscriber sub : subscribersList) {
            System.out.println(sub);
        }
    }

    @Override
    public void updateBalance(String subscriberId, double amount) {
        if (subscriberId == null) {
            System.out.println("Invalid Subscriber ID");
            return;
        }
        for (Subscriber sub : subscribersList) {
            if (sub.getSubscriberId().equalsIgnoreCase(subscriberId)) {
                if (sub.getPlanType().isPostpaid()) {
                    sub.setBalance(amount);
                    System.out.println("Balance updated successfully for subscriber ID: " + subscriberId);
                } else {
                    System.out.println("Balance update not applicable for prepaid");
                }
                return;
            }
        }
        System.out.println("No subscriber found with ID: " + subscriberId);
    }

    public void generateBills(String subscriberId) {
        if (subscriberId == null) {
            System.out.println("Invalid Subscriber ID.");
            return;
        }
        double totalAmount = 0; // to store total amount
        CallHistoryManagement callHistoryManagement = new CallHistoryManagement();
        // for getting call history of a particular user
        ArrayList<Call> histories = callHistoryManagement.getCallHistoryBySubscriber(subscriberId);

        for (Call record : histories) {
            totalAmount += record.getDuration() * record.getCallType().generateRate();
        }
        System.out.println("Total bill for Subscriber ID " + subscriberId + " is " + totalAmount);
    }
}
