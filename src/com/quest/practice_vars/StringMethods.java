package com.quest.practice_vars;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "abcdefghij";
        String s2 = "ABCDEFGHIJ";
        String s3 = " abcdefghij ";
        int n=100;
        System.out.println(s1.charAt(3));
        System.out.println(s1.length());
        System.out.println(s1.equals("hello"));
        System.out.println(s1.equalsIgnoreCase("ABCDEFGHIJ"));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.trim()); // removes leading and trailing whitespaces
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains("c"));
        System.out.println(s3.startsWith("a"));
        System.out.println(s3.endsWith("j"));
        System.out.println(s3.isEmpty());
        System.out.println(s2.indexOf("D"));
        System.out.println(s1.substring(3,5));
        String s4 = Integer.toString(n); // converts integer to string
        System.out.println(s4);
        System.out.println(s3.replace('c','m'));
        String[] array = {"hello","world"}; // array of strings
        String joinedString = String.join(",", array);
        System.out.println(joinedString);
    }
}
