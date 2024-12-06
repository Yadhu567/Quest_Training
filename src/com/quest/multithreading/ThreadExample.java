package com.quest.multithreading;

public class ThreadExample extends Thread{
    private boolean flag;
    public ThreadExample(boolean flag){
        this.flag=flag;
    }

    @Override
    public void run(){
        if(flag){
            for(int i=1;i<=10;i++){
                if(i%2==0){
                    System.out.println("Thread 0 -- even number "+i);
                }
            }
        }else{
            for(int i=1;i<=10;i++){
                if(i%2!=0){
                    System.out.println("Thread 1 -- odd number "+i);
                }
            }
        }

    }

    public static void main(String[] args) {
        ThreadExample t1=new ThreadExample(true);

        ThreadExample t2=new ThreadExample(false);

        t1.setPriority(8);
        t2.setPriority(2);

        t1.start();
        t2.start();

        EvenThread t3=new EvenThread();

        OddThread t4=new OddThread();

        t3.setPriority(6);
        t4.setPriority(3);

        t3.start();
        t4.start();

    }
    static class EvenThread extends Thread{
        @Override
        public void run() {
            for(int i=1;i<=10;i++){
                if(i%2==0){
                    System.out.println("Thread 0 -- even number "+i);
                }
            }
        }
    }
    static class OddThread extends Thread{
        @Override
        public void run() {
            for(int i=1;i<=10;i++){
                if(i%2!=0){
                    System.out.println("Thread 1 -- odd number "+i);
                }
            }
        }
    }
}
