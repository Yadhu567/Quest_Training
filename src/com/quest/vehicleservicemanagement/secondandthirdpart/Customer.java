package com.quest.vehicleservicemanagement.secondandthirdpart;

import com.quest.vehicleservicemanagement.firstpart.Vehicle;

import java.io.Serializable;

public class Customer implements Serializable {
    private String customerId;
    private String name;
    private String email;
    private Vehicle vehicle;

    public Customer(String customerId, String name, String email, Vehicle vehicle) {
        setCustomerId(customerId);
        setName(name);
        setEmail(email);
        setVehicle(vehicle);
    }

    // getters and setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // override toString method
    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + getCustomerId() + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", vehicle=" + getVehicle() +
                '}';
    }
}
