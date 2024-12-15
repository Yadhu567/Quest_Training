package com.quest.practice_questions;

/**
 * java doc
 */
public class  WrapperClass {
    public static void main(String[] args) {
        int x=20;
        Integer wrapper=Integer.valueOf(x);
        Integer wr=Integer.valueOf(4);

        Character c=Character.valueOf('r');

        Float f=Float.valueOf(3f);
        System.out.println(wrapper);

        float fp=f.floatValue();
        // single line
    }
}


/*  this is
    multiline
 */
