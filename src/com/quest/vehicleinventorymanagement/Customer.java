package com.quest.vehicleinventorymanagement;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String customerId;
    private final String name;
    private final String email;
    private Vehicle vehiobj;
    private final List<PurchasedVehicle> purchasedVehicles;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.purchasedVehicles = new ArrayList<>();
    }

    public void addPurchasedVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            System.out.println("Vehicle can't be empty");
        } else {
            PurchasedVehicle purchasedVehicle = new PurchasedVehicle(vehicle); // creates object of purchased vehicle class
            purchasedVehicles.add(purchasedVehicle);
            System.out.println("Vehicle added successfully in purchased list at " + purchasedVehicle.getPurchaseDateTime());
        }
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // get the list of purchased vehicles
    public List<PurchasedVehicle> getPurchasedVehicles() {
        return purchasedVehicles;
    }


    // overriding the toString method
    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + getCustomerId() + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", purchasedVehicles=" + getPurchasedVehicles() +
                '}';
    }
}
