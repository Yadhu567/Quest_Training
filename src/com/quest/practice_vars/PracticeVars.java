package com.quest.practice_vars;

public class PracticeVars {

    public static void main(String[] args) {
        final int  VOTE_AGE=18;
        int age = 18;
        double salary = 200.4;
        char gender = 'M';
        String firstName = "John";

        System.out.println("age=" + age);
        System.out.println("salary="+ salary);
        System.out.println("gender=" + gender);
        System.out.println("firstname="+ firstName);
        System.out.println("Vote_age=" + VOTE_AGE);
        practiceConversion();
        stringConcatination();
        stringMethods();
    }
    private static void practiceConversion(){

        int a=20;
        double b=20.5;
        double sum=a+b;
        int round=(int)b;
        System.out.println("sum="+sum);

    }
    private static void stringConcatination(){
        String s1="Hello";
        String s2="World";
        String s3=s1+" "+s2;
        System.out.printf(s3);
        int age=20;
        System.out.println("name="+s3+"age="+age);
        s1.length();
        int[] arr=new int[10];
        int a=arr.length;
        
    }
    private static void stringMethods(){
        String s1="Hello";
        String s2="World";
        String s4= new String("hello world");
        String s3= new String("john doe");
        System.out.println(s3.length());
        System.out.println(s3.equalsIgnoreCase(s2)); // checks two strings are equal by ignoring the case
        System.out.println(s3.equals(s2));
        System.out.println(s4.equals(s1));
    }
}
