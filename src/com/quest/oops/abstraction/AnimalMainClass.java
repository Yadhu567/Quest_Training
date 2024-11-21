package com.quest.oops.abstraction;

public class AnimalMainClass {
    public static void main(String[] args) {
        Animal[] animal=new Animal[3];
        animal[0]=new Dog();
        animal[1]=new Bird();
        animal[2]=new Cat();

        animal[0].walk();
        animal[0].sleep();
        animal[1].walk();
        animal[1].sleep();
        animal[2].walk();
        animal[2].sleep();
    }
}
