package com.quest.oops.inheritance;

public class DogClass extends Animal{
    String type;
    public DogClass(String color, int age, String type) {
        super(color, age);
        this.type = type;
    }
    public void bark(){
        System.out.println("Dog can Bark");
    }
    @Override
   public void getInfo(){
        super.getInfo();
        System.out.println("The type of dog is " + this.type);

   }
}
