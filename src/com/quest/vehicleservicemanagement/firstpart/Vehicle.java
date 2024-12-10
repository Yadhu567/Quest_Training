package com.quest.vehicleservicemanagement.firstpart;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String vin;
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private String ownerName;

    public Vehicle(String vin,String brand,String model,int year,double mileage,String ownerName){
        setVin(vin);
        setBrand(brand);
        setModel(model);
        setYear(year);
        setMileage(mileage);
        setOwnerName(ownerName);
    }

    //getters and setters
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    //override toString method
    @Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + getVin() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", mileage=" + getMileage() +
                ", ownerName='" + getOwnerName() + '\'' +
                '}';
    }
}
