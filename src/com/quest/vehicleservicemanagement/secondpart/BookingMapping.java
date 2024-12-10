package com.quest.vehicleservicemanagement.secondpart;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingMapping {
    private  Map<Customer, List<ServiceBooking>> bookingMap=new HashMap<>();

    public void addBooking(Customer customer,ServiceBooking serviceBooking) throws InvalidBookingException {
       // for handling exception
        if(serviceBooking.getServiceDate().isBefore(LocalDateTime.now())){
            throw new InvalidBookingException("Service date cannot be past date");
        }


        for (List<ServiceBooking> booking : bookingMap.values()) {
            if (booking.stream().anyMatch(b -> b.getBookingId().equals(serviceBooking.getBookingId()))) {
                throw new InvalidBookingException("duplicate booking ID");
            }
        }

        bookingMap.computeIfAbsent(customer, k -> new ArrayList<>()).add(serviceBooking); // adding to map

    }
    public List<ServiceBooking> getCustomerBooking(Customer customer){
        return bookingMap.getOrDefault(customer, new ArrayList<>());
    }
    //getters
    public Map<Customer, List<ServiceBooking>> getBookingMap() {
        return bookingMap;
    }
}
