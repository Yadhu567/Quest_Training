package com.quest.vehicleinventorymanagement;

public class VehicleNotFoundException extends Exception{ //extending compile time exception
    public VehicleNotFoundException(String message){
        super(message);
    }
}
