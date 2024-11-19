package com.quest.oops.bankassignment;

public class Deposit extends Transaction{

    public Deposit(BankAccount account) {
        super(account);
    }
    @Override
    public void processTransaction(double amount) {
        account.deposit(amount); // calls the parent class withdraw method
    }
}
