package com.quest.oops.test1;

public class RandomClass extends AbstractClass {
    public static void main(String[] args) {
       AbstractClass obj = new AbstractClass() {
           @Override
           public void drive() {
               System.out.println("random object");
           }
           void add(){
               System.out.println("add object");
               super.add();
           }
       };
       obj.drive();
       obj.add();

       RandomClass dc = new RandomClass();
       dc.drive();
       dc.add();
    }
    @Override
    public void drive() {
        System.out.println("Random class");
    }
    public void add(){
        System.out.println("Add method");
    }
}
