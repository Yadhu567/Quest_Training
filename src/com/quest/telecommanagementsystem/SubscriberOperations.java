package com.quest.telecommanagementsystem;

public interface SubscriberOperations {
    void addSubscriber(Subscriber subscriber);
    void getSubscriber(String susciberId);
    void displaySubscribers();
    void updateBalance(String subscriberId,double amount);
    void generateBills(String subscriberId);
}
