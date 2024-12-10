package com.quest.vehicleservicemanagement.secondandthirdpart;

// custom exception
public class InvalidBookingException extends Exception{
    public InvalidBookingException(String message){
        super(message);
    }
}
