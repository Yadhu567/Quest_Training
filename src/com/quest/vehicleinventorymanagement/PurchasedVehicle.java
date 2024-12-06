package com.quest.vehicleinventorymanagement;

import java.time.LocalDateTime;

public class PurchasedVehicle {

    private final Vehicle vehicle;
    private final LocalDateTime purchaseDateTime;

    public PurchasedVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.purchaseDateTime = LocalDateTime.now();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getPurchaseDateTime() {
        return purchaseDateTime;
    }

    @Override
    public String toString() {
        return "PurchasedVehicle{" +
                "vehicle=" + getVehicle() +
                ", purchaseDateTime=" + getPurchaseDateTime() +
                '}';
    }
}

