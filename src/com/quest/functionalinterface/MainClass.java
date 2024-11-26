package com.quest.functionalinterface;

public class MainClass implements SampleInterface{
    public static void main(String[] a){
        SampleInterface obj=()->{
            System.out.println("hello world");
        };
        obj.add();
        MainClass obj2=new MainClass();
        obj2.add();
    }

    @Override
    public void add() {
        System.out.println("hai world");
    }
}
