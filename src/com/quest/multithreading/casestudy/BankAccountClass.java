package com.quest.multithreading.casestudy;

class Bank  {
    private double balance;

    public Bank(double amount){
        this.balance=amount;
    }

    public synchronized void deposit(double amount){
        balance=balance+amount;
        System.out.println("current balance after deposit "+balance);
    }
    public synchronized void withdraw(double amount){
        balance=balance-amount;
        System.out.println("current balance after withdraw "+balance);
    }

}

class DepositThread extends Thread {
    private final Bank bank;
    private final double amount;

    public DepositThread(Bank bank, double amount) {
        this.bank = bank;
        this.amount = amount;
    }

    @Override
    public void run() {
        bank.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    private final Bank bank;
    private final double amount;

    public WithdrawThread(Bank bank, double amount) {
        this.bank = bank;
        this.amount = amount;
    }

    @Override
    public void run() {
        bank.withdraw(amount);
    }
}

public class BankAccountClass{
    public static void main(String[] args) {
        Bank bank=new Bank(23000);

        DepositThread t1 = new DepositThread(bank, 2399);
        WithdrawThread t2 = new WithdrawThread(bank, 3566);

        t1.start();

        t2.start();




    }
}

