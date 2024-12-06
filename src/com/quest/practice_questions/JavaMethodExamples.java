package com.quest.practice_questions;

public class JavaMethodExamples {
    private static final int x=20;
    public static void main(String[] args) {
        JavaMethodExamples obj = new JavaMethodExamples();
        obj.display("hello");
        int result =obj.add(2,4);
        System.out.println(result);

    }
    /**
    * displays string
    * @param str-name
    */
    void display(String str){
        System.out.println(str);
    }
    /**
     *add two numbers
     * @param a-n1
     * @param b-n2
     * @return sum
     *
     */
    private int add(int a, int b){
        return a+b;
    }
}