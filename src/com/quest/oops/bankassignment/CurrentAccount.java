package com.quest.oops.bankassignment;

public class CurrentAccount extends BankAccount{
    private static final double OVERDRAFT_LIMIT = 1000; // to store overdraft limit value

    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -OVERDRAFT_LIMIT) {
            super.withdraw(amount); // calls the parent class withdraw method
        } else {
            System.out.println("Withdrawal denied. Overdraft limit of " + OVERDRAFT_LIMIT + " exceeded.");

        }
    }
}

