package com.quest.errorexamples;

public class OutOfMemmoryError {

    public static void causeOutOfMemory() {
        try {
            int[] arr=new int[Integer.MAX_VALUE];
            System.out.println(arr[456]);
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError occurred " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        causeOutOfMemory();
    }
}
