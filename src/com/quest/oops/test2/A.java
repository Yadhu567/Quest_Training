package com.quest.oops.test2;

public class A extends B {
    public static void main(String[] args) {
        A obj = new A();
        obj.add(8,5);
    }
    A(){
        System.out.println("A class constructor");
    }
    void add(){
        this.add();
        System.out.println("A class Add Method with no arguments");
    }
    @Override
    void add(int a,int b){
        super.add(a,b);
        int c=a+b;
        System.out.println("A class add method"+c);
    }
    static void add(int a){
        System.out.println("A inside static method"+a);
    }

}
