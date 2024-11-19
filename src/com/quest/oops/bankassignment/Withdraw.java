package com.quest.oops.bankassignment;

public class Withdraw extends Transaction {

    public Withdraw(BankAccount account) {
        super(account);

    }
    @Override
    public void processTransaction(double amount) {
        account.withdraw(amount); // calls the parent class withdraw method
    }
}
