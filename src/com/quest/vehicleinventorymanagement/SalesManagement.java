package com.quest.vehicleinventorymanagement;

import java.io.*;
import java.util.*;

public class SalesManagement {
    private Map<Customer, Set<Vehicle>> salesMap;
    private final InventoryManagement inventory;

    public SalesManagement(InventoryManagement inventory){
        salesMap=new HashMap<>();
        this.inventory= inventory;
    }

    public void purchaseVehicle(Customer customer, Vehicle vehicle) throws VehicleNotFoundException {
        // check customer or vehicle is null
        if (customer == null || vehicle == null) {
            System.out.println("customer or vehicle cannot be empty");
            return;
        }
        // checks vehicle in inventory
        if(!inventory.getVehicles().contains(vehicle)){
            throw new VehicleNotFoundException("this vehicle not available in inventory");
        }
        inventory.getVehicles().remove(vehicle);

        customer.addPurchasedVehicle(vehicle);

        Set<Vehicle> vehicleSet = salesMap.get(customer);

        // checks vehicle set is empty
        if (vehicleSet == null) {
            vehicleSet = new HashSet<>();
            salesMap.put(customer, vehicleSet);
        }

        vehicleSet.add(vehicle);
    }

    public void serializeSalesData(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(salesMap);
        }
    }

    public void deserializeSalesData(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            salesMap = (Map<Customer, Set<Vehicle>>) ois.readObject(); // typecasting the data
        }
    }

    public void purchasesVehicleSortedByPrice(){
        List<Vehicle> filteredVehicles= salesMap.values().stream()
                .flatMap(Set::stream)
                .sorted((v1, v2) -> Double.compare(v2.getPrice(), v1.getPrice()))
                .toList();

        System.out.println("vehicles purchased by customers sorted by price in descending order ");

        // display the filtered vehicles
        for(Vehicle vehicle:filteredVehicles){
            System.out.println(vehicle);
        }
    }
}
