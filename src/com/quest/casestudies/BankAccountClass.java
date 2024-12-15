package com.quest.casestudies;

import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BankAccountClass {
    private int accountNumber;
    private double balance;
    PriorityQueue<String> linkedQueue=new PriorityQueue<>();

    public BankAccountClass(int accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.balance=balance;
    }

    public synchronized void deposit(double amount){
        balance+=amount;
        linkedQueue.add(amount+"amount added");
    }
    public synchronized void withdraw(double amount){
        balance-=amount;
        linkedQueue.add(amount+"amount withdrawed");
    }



}
