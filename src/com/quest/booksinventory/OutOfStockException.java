package com.quest.booksinventory;

public class OutOfStockException extends Exception{ //custom exception class
    public OutOfStockException(String message){
        super(message);
    }
}
