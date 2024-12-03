package com.quest.exceptionexample;

public class InvalidInputException extends Exception{  //exception class
    public InvalidInputException(String message){
        super(message);
    }
}
