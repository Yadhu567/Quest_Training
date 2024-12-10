package com.quest.vehicleservicemanagement.firstpart;

import java.util.HashSet;
import java.util.Set;


//generic class
public class ServiceCenter<T>{
    Set<T> servicedVehicles=new HashSet<>();


    public void addServicedVehicles(T vehicle){
        servicedVehicles.add(vehicle);
    }
    public Set<T> getAllServicedVehicle(){
        return servicedVehicles;
    }
}
