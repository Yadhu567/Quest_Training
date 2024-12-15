package com.quest.string;

public class StringBuilderMethods2 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello world");
        StringBuilder s8 = new StringBuilder("new hello world");
        StringBuffer s9= new StringBuffer("new hello world");
        String str=new String("Hao");

        System.out.println(s1);
        StringBuilder s2 = s8.reverse();
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        StringBuilder s3 = s1.append("hai");
        System.out.println(s3);
        StringBuilder s4 = s1.replace(1,3,"hai");
        System.out.println(s4);
        StringBuilder s5 = s1.insert(2,"new");
        System.out.println(s5);
        StringBuilder s6 = s1.delete(0,2);
        System.out.println(s6);
        System.out.println(s1.charAt(2));

    }
}
