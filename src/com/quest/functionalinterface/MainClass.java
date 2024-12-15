package com.quest.functionalinterface;

public class MainClass implements SampleInterface{
    public static void main(String[] a){
        SampleInterface obj=()->{
            System.out.println("hello world");
        };
        obj.add();
        MainClass obj2=new MainClass();
        obj2.add();
        SampleInterface obj3=new SampleInterface() {
            @Override
            public void add() {
                System.out.println("hoi");
            }
        };
        obj3.add();
    }

    @Override
    public void add() {
        System.out.println("hai world");
    }
}
