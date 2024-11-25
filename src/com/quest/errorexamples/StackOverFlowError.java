package com.quest.errorexamples;

public class StackOverFlowError {
    public static void causeStackOverflow() {
        causeStackOverflow();
    }
    public static void main(String[] args) {
        try {
            causeStackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred"+e.getMessage());
            e.printStackTrace();
        }
    }
}
