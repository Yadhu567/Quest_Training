package com.quest.telecommanagementsystem;

import java.util.ArrayList;

public class SubscriberManagement implements SubscriberOperations {
    ArrayList<Subscribers> subscribersList=new ArrayList<>(); // to store subscribers list

    @Override
    public void addSubscriber(Subscribers subscriber) {
        if (subscriber == null) {
            System.out.println("Invalid subscriber. Subscriber or Subscriber ID cannot be null.");
            return; // if id is  null  then returns
        }
        for(Subscribers sub: subscribersList){
            if(sub.getsubscriberId().equalsIgnoreCase(subscriber.getsubscriberId())){
                System.out.println("subscriber with this id already exists");
                return;
            }
        }
        subscribersList.add(subscriber);
        System.out.println("Subscriber added successfully.");

    }

    @Override
    public void getSubscriber(String subscriberId) {
        if (subscriberId == null ) {
            System.out.println("Invalid Subscriber ID.");
            return; //if id is  null then returns
        }
        for(Subscribers sub:subscribersList){
            if(sub.getsubscriberId().equalsIgnoreCase(subscriberId)){
                System.out.println(sub);
            }
        }
        System.out.println("No subscriber found with ID: " + subscriberId);

    }
    @Override
    public void displaySubscribers() {
        if (subscribersList.isEmpty()) { // checks list is empty
            System.out.println("No subscribers in the system.");
            return;
        }
        for(Subscribers sub:subscribersList){
            System.out.println("The subscribers list are");
            System.out.println(sub);
        }
    }

    @Override
    public void updateBalance(String subscriberId, double amount) {
        if (subscriberId == null ) {
            System.out.println("Invalid Subscriber ID.");
            return;
        }
        for(Subscribers sub:subscribersList){
            if(sub.getsubscriberId().equalsIgnoreCase(subscriberId)){
                if(sub.getPlanType().equalsIgnoreCase("prepaid")){
                    sub.setBalance(amount);
                    System.out.println("Balance updated successfully for Subscriber ID: " + subscriberId);
                }else {
                    System.out.println("Balance update is only applicable for prepaid subscribers.");
                }
                return;
            }
        }
        System.out.println("No subscriber found with ID: " + subscriberId);
    }
    public void generateBills(String subscriberId) {
        if (subscriberId == null ) {
            System.out.println("Invalid Subscriber ID.");
            return;
        }
        double totalAmount = 0.0; // to store total amount
        CallHistoryManagement callHistoryManagement = new CallHistoryManagement();
        // for getting call history of a particular user
        ArrayList<CallHistory> histories = callHistoryManagement.getCallHistoryBySubscriber(subscriberId);

        for (CallHistory record : histories) {
            switch (record.getCallType()) {
                case "Local":
                    totalAmount+=record.getDuration() * 1;
                    break;
                case "STD":
                    totalAmount+=record.getDuration() * 2;
                    break;
                case "ISD":
                    totalAmount+=record.getDuration() * 5;
                    break;
            }
        }
        System.out.println("Total bill for Subscriber ID " + subscriberId + " is " + totalAmount);
    }
}
