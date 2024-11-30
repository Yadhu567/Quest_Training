package com.quest.oops.polymorphism;

public class Area extends Shape{
    private double radius;
    private double length;
    private double breadth;
    public Area(String message){
        super(message);
    }
    public Area(String message, double radius){
        super(message);
        this.radius=radius;
    }
    public Area(String message, double length,double breadth){
        super(message);
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void displayMessage(){
        super.displayMessage();
    }

    public void calculateArea(){
        double area=3.14*radius*radius;
        System.out.println("the area of circle is"+area);
    }

    public void calculateArea1(){
        double area=length*breadth;
        System.out.println("the area of rectangle is"+area);
    }

    public void areaCalc1(double radius){
        double area=3.14*radius*radius;
        System.out.println("the area of circle is"+area);
    }
    public double areaCalc1(double length,double breadth){
        return length*breadth;
    }


    // normal block
    {
        if (4>5){
            System.out.println("hai");
        }
    }
    // static block
    static {
        int a;
    }


}
