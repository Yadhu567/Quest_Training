package com.quest.vehicleservicemanagement.secondpart;

// custom exception
public class InvalidBookingException extends Exception{
    public InvalidBookingException(String message){
        super(message);
    }
}
