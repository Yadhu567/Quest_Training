package com.quest.vehicleservicemanagement.firstpart;

public class CombustionEngineVehicle extends Vehicle {
    private final String fuelType;
    private final double engineCapacity;

    public CombustionEngineVehicle(String vin, String brand, String model, int year, double mileage, String ownerName,String fuelType,double engineCapacity) {
        super(vin, brand, model, year, mileage, ownerName);
        this.fuelType=fuelType;
        this.engineCapacity=engineCapacity;

    }

    public String getFuelType() {
        return fuelType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    //override toString method
    @Override
    public String toString() {
        return super.toString()+ "CombustionEngineVehicle{" +
                "fuelType='" + getFuelType() + '\'' +
                ", engineCapacity=" + getEngineCapacity() +
                '}';
    }
}
