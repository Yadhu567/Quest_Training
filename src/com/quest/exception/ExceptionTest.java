package com.quest.exception;
import java.lang.ArithmeticException;
public class ExceptionTest {
    public static void main(String[] args) {
        //unchecked exception-run time
        //checked exception-compile time
        try {
            int x=2/0;
        }catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e);

        }finally {
            System.out.println("finally");
        }
    }
}
