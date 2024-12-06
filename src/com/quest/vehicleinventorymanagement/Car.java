package com.quest.vehicleinventorymanagement;

import java.time.LocalDate;

public class Car extends Vehicle {
    private final int seatingCapacity;
    public Car(String vehicleId, String brand, String model, double price, LocalDate manufactureDate,int seatingCapacity){
        super(vehicleId, brand, model, price, manufactureDate);
        this.seatingCapacity=seatingCapacity;
    }

    //overriding the toString method
    @Override
    public String toString() {
        return "Car{" + super.toString()+
                "Seating Capacity=" + seatingCapacity +
                '}';
    }


}
