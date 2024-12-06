package com.quest.vehicleinventorymanagement;

import java.time.LocalDate;

public class Bike extends Vehicle {
    private final int engineCapacity;
    public Bike(String vehicleId, String brand, String model, double price, LocalDate manufactureDate,int engineCapacity) {
        super(vehicleId, brand, model, price, manufactureDate);
        this.engineCapacity=engineCapacity;
    }

    //overriding the toString method
    @Override
    public String toString() {
        return "Bike{" + super.toString()+
                "Engine Capacity=" + engineCapacity +
                '}';
    }
}
