package com.quest.vehicleservicemanagement.secondpart;
import com.quest.vehicleservicemanagement.firstpart.Vehicle;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.*;


public class ServiceOperations {

    //predicate
    public static Predicate<ServiceBooking> pd1 = b ->
            b.getServiceDate().isAfter(LocalDateTime.now()) &&
                    b.getServiceDate().isBefore(LocalDateTime.now().plusDays(7));

    //consumer
    public static Consumer<Customer> cn1= customer -> {
        System.out.println("Invoice for Customer: " + customer.getName());

        BookingMapping bm=new BookingMapping();
        List<ServiceBooking> bookings = bm.getCustomerBooking(customer);
        double totalCost = bookings.stream().mapToDouble(ServiceBooking::getCost).sum();
        bookings.forEach(System.out::println);
        System.out.println("Total Cost: " + totalCost);
    };

    // function
    public static Function<List<ServiceBooking>, Double> fun1 = b -> {
        double totalCost = b.stream().mapToDouble(ServiceBooking::getCost).sum();
        if(b.size()>3){
           return totalCost * 0.85;
        }else{
            return totalCost;
        }

    };

    // supplier
    public static Supplier<ServiceBooking> sp1 = () -> {
        Customer randomCustomer = new Customer("573", "ryan", "ryan@gmail.com", new Vehicle("890", "benz", "n-series", 2022, 4500, "ryan"));
        return new ServiceBooking("284", randomCustomer, LocalDateTime.now(), "Battery change", 6700);
    };
}
