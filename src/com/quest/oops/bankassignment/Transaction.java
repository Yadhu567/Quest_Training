package com.quest.oops.bankassignment;

public abstract class Transaction {
    public BankAccount account;

    public Transaction(BankAccount account) {

        this.account = account;
    }

    public abstract void processTransaction(double amount);

}
