package com.quest.vehicleinventorymanagement;

import java.io.Serializable;
import java.time.LocalDate;

public class Vehicle implements Serializable {
    private String vehicleId;
    private String brand;
    private String model;
    private double price;
    private LocalDate manufactureDate;

    public Vehicle(String vehicleId, String brand, String model, double price, LocalDate manufactureDate) {
        setVehicleId(vehicleId);
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setManufactureDate(manufactureDate);
    }
    // getters and setters
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //object cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Vehicle clonedVehicle=(Vehicle)super.clone();
        clonedVehicle.setPrice(this.getPrice()*0.10); //discount price
        return clonedVehicle;
    }

    //overriding the toString method
    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + getVehicleId() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", manufactureDate=" + getManufactureDate() +
                '}';
    }
}
