package com.quest.oops.bankassignment;

public class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 500;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MINIMUM_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance of " + MINIMUM_BALANCE + " must be maintained.");

        }
    }
}

