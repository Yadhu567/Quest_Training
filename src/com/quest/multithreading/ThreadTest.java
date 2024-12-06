package com.quest.multithreading;

public class ThreadTest {
    public static void main(String[] args) {

        FirstThread t1=new FirstThread();
        SecondThread t2=new SecondThread();
        ThirdThread t3=new ThirdThread();

        t1.start();
        try{
            t1.join();

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        t2.start();

        try{
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        t3.start();
        try{
            t3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }


    }
    static class FirstThread extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("hello");
        }
    }
    static class SecondThread extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("world");
        }
    }
    static class ThirdThread extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("!");
        }
    }

}
