package com.quest.dsaquestions;

public class StringReverse {
    public static void main(String[] args) {
        String str="hello world";

        StringBuilder reverse=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reverse.append(str.charAt(i));
        }
        str=reverse.toString();
        System.out.println(str);
    }
}
