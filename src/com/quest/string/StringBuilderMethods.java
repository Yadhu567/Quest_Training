package com.quest.string;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("world");
        StringBuilder s6 = new StringBuilder("hello");
        check(s1, s2);
        String s3="hello";
        String s4=s3+"world";
        System.out.println(s1);
        System.out.println(s1.append(s4));
        System.out.println(s2.reverse());
        System.out.println(s2.replace(0,1,"e"));
        System.out.println(s6.delete(1,2));
        System.out.println(s6.insert(0,"e"));
        System.out.println(s6.charAt(2));
    }
    public static void check(StringBuilder s1, StringBuilder s2){
            if(s1==s2){
                System.out.println(true);
            } else{
                System.out.println(false);
            }
            if(s1.equals(s2)){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
    }
}
