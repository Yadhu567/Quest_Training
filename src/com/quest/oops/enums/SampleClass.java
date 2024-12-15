package com.quest.oops.enums;

public class SampleClass {
    public static void main(String[] args) {
       String shape = "circle";
       getShape(shape);
       ShapeType sh;
    }

    public static void getShape(String shape) {
        if (shape.equals(ShapeType.CIRCLE)){
            System.out.println(false);
        }
    }
}
