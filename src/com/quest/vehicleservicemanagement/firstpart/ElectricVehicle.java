package com.quest.vehicleservicemanagement.firstpart;

public class ElectricVehicle extends Vehicle {
    private final double batteryCapacity;
    private final double rangePerCapacity;

    public ElectricVehicle(String vin, String brand, String model, int year, double mileage, String ownerName,double batteryCapacity,double rangePerCapacity) {
        super(vin, brand, model, year, mileage, ownerName);
        this.batteryCapacity=batteryCapacity;
        this.rangePerCapacity=rangePerCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getRangePerCapacity() {
        return rangePerCapacity;
    }
   //override toString method
    @Override
    public String toString() {
        return super.toString()+ "ElectricVehicle{" +
                "batteryCapacity=" + getBatteryCapacity() +
                ", rangePerCapacity=" + getRangePerCapacity() +
                '}';
    }
}
