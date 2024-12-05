package com.quest.samplequestions;

public class StringMutable {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = str1;

        System.out.println("before modification");
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        str1 = str1.concat(" World");

        System.out.println("after modification");
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
    }
}
