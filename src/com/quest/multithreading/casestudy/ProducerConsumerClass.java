package com.quest.multithreading.casestudy;


import java.util.ArrayList;

class ArrayBuffer{
    private int size;
    private ArrayList<Integer> buffer;
    public ArrayBuffer(int size){
        this.size=size;
    }
    public synchronized void produce(int item){
        if(buffer.size()==size){
            System.out.println("buffer is full");
        }
        buffer.add(item);
    }
    public synchronized void consume(int item){
        if(buffer==null){
            System.out.println("buffer is empty");
        }
        buffer.remove(item);
    }
}
class Producer extends Thread{

    private  ArrayBuffer buffer;
    private int item;

    public Producer(ArrayBuffer buffer,int item) {
        this.buffer = buffer;
        this.item=item;
    }

    @Override
    public void run() {
        buffer.produce(item);
    }
}
class Consumer extends Thread{

    private  ArrayBuffer buffer;
    private int item;

    public Consumer(ArrayBuffer buffer,int item) {
        this.buffer = buffer;
        this.item=item;
    }

    @Override
    public void run() {
        buffer.consume(item);
    }
}

public class ProducerConsumerClass {
    public static void main(String[] args) {
        ArrayBuffer arrayBuffer=new ArrayBuffer(5);

        Producer t1=new Producer(arrayBuffer,4);
        Producer t2=new Producer(arrayBuffer,8);
        Producer t3=new Producer(arrayBuffer,9);

        Consumer t4=new Consumer(arrayBuffer,2);

        t1.start();

        t2.start();

        t3.start();

        t4.start();

        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
