package com.quest.string;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        //string class doesn't contain append method but includes concat method
        String s5 = s1;
        equalString(s5,s1);
        int i1=1;
        int i2=1;
        equalInt(i1,i2);
    }
    public static void  equalString(String s1, String s2) {
        if(s1.contains(s2)){
            System.out.println(true);
        }
        if(s1==s2){
            System.out.println(true);
        }

    }
    public static void  equalInt(int s1, int s2) {

        if(s1==s2){
            System.out.println(true);
        }

    }
}
