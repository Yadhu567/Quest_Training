package com.quest.practice_vars;

public class Controlflow {
    public static void main(String[] args) {
        int number = 10;
        if (number <= 10) {
            System.out.println("number is negative" + number);
        } else if (number > 10) {
            System.out.println("number is positive" + number);
        } else {
            System.out.println("number is zero" + number);
        }
        String day = "monday";
        switch (day) {
            case "monday":
                System.out.println("monday");
                break;
            case "tuesday":
                System.out.println("tuesday");
                break;
            case "wednesday":
                System.out.println("wednesday");
                break;
            default:
                System.out.println("no day");
        }
        testForloop();
    }
    static void testForloop(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        for(int j = 0; j < 10; j++){
            if (j%2==0){
                System.out.println("even number "+j);
            } else{
                continue;
            }
        }
    }
    static void testWhileloop(){
        int n=5;
        while(n<0){
            System.out.println("hello");
            n--;
        }
    }
}
