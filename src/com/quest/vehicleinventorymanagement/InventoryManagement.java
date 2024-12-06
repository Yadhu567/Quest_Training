package com.quest.vehicleinventorymanagement;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {
    List<Vehicle> vehicles;

    public InventoryManagement(){
        vehicles=new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicles.add(vehicle);
        } else {
            System.out.println("vehicle cannot be null");
        }
    }

    public List<Vehicle> getVehicles(){
        if (vehicles.isEmpty()) {
            System.out.println("The vehicle list is empty.");
            return new ArrayList<>();
        }
        return vehicles;
    }
    public Vehicle findVehicleById(String vehicleId){
        if(vehicleId==null){
            System.out.println("vehicle id cannot be null");
            return null;
        }
        for(Vehicle vehicle:vehicles){
            if(vehicle.getVehicleId().equals(vehicleId)){
                return vehicle;
            }
        }
        return null;
    }

    public void vehiclesByBrand(String brand){
        if (brand == null) {
            System.out.println("brand name cannot be null");
            return;
        }
        List<Vehicle> filteredVehicles= vehicles
                .stream()
                .filter(v->v.getBrand().equals(brand))
                .toList();

        System.out.println("The vehicles in the "+brand+" are:");
        for(Vehicle vehicle:filteredVehicles){
            System.out.println(vehicle);
        }
    }

}
