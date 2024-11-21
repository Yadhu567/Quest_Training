package com.quest.string;

public class StringSample {
    public static void main(String[] args) {
        String s1 = "Hello World";
        StringBuilder s3= new StringBuilder("hello world");
        StringBuffer s2= new StringBuffer("hello world");

        check1(s1,s3);
        check2(s1,s2);
        check3(s3,s2);
        System.out.println();

        System.out.println(s2.append("welcome world"));
        System.out.println(s3.append("welcome world"));
        System.out.println();

        System.out.println(s3.charAt(2));
        System.out.println(s2.charAt(2));
        System.out.println();

        System.out.println(s3.replace(0,3,"good"));
        System.out.println(s2.replace(0,3,"good"));
        System.out.println();

        System.out.println(s3.insert(2,"good"));
        System.out.println(s2.insert(2,"good"));
        System.out.println();

        System.out.println(s3.reverse());
        System.out.println(s2.reverse());
        System.out.println();

        System.out.println(s3.delete(2,4));
        System.out.println(s2.delete(2,4));
        System.out.println();
    }
    public static void check1(String s1, StringBuilder s2){
        String s3 = s2.toString();
        if(s1==s3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(s1.equals(s2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static void check2(String s1, StringBuffer s3){
        String s4 = s3.toString();
        if(s1==s4){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(s1.equals(s3)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static void check3(StringBuilder s1, StringBuffer s3){
        String s4 = s3.toString();
        String s5 = s1.toString();
        if(s4==s5){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(s1.equals(s3)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
