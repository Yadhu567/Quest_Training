package com.quest.casestudies;


public class BankMainClass {
    public static void main(String[] args) {
        BankAccountClass account = new BankAccountClass(4664, 1000);

        Runnable depositTask = ()-> account.deposit(53399);

        Runnable withdrawTask = ()-> account.deposit(53288);

        Thread t1=new Thread(depositTask);

        Thread t2=new Thread(withdrawTask);

        t1.start();

        t2.start();

       while (!account.linkedQueue.isEmpty()){
           System.out.println(account.linkedQueue.poll());
       }

    }
}
