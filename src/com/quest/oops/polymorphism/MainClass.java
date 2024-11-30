package com.quest.oops.polymorphism;

public class MainClass {
    public static void main(String[] args) {
        Area area1=new Area("area calculation not valid");
        area1.displayMessage();
        area1.calculateArea();

        Area area2=new Area("area calculation for circle",5.0);
        area2.displayMessage();
        area2.calculateArea();

        Area area3=new Area("area calculation for rectangle",5.0,4.0);
        area3.displayMessage();
        area3.calculateArea1();

        area1.areaCalc1(4.5);

        double area= area1.areaCalc1(3.5,5.8);
        System.out.println("the area of rectangle is "+area);




    }
}
