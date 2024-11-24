package com.quest.oops.exception;

public class CustomException {
    public static void main(String[] args) {
        String s1=null;
        try{
            System.out.println(s1.length());
        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
