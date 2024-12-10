package com.quest.vehicleservicemanagement.secondandthirdpart;

import com.quest.vehicleservicemanagement.firstpart.Vehicle;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ServiceMainClass {
    public static void main(String[] args) throws InvalidBookingException, CloneNotSupportedException {

        Customer customer = new Customer("123", "johan", "johan@gmail.com", new Vehicle("123", "BMW", "S-series", 2014, 3400, "ron"));

        ServiceBooking booking1 = new ServiceBooking("345", customer, LocalDateTime.now().plusDays(5), "Oil change", 2300);
        ServiceBooking booking2 = new ServiceBooking("438", customer, LocalDateTime.now().plusDays(3), "Battery change", 7800);

        BookingMapping bm=new BookingMapping();

        bm.addBooking(customer, booking1);
        bm.addBooking(customer, booking2);

        //predicate operation
        System.out.println("Booking in next 7 days: "+ServiceOperations.pd1.test(booking1));

        // supplier operation
        ServiceBooking randomBooking = ServiceOperations.sp1.get();
        System.out.println("Random Booking: " + randomBooking);

        // consumer operation
        ServiceOperations.cn1.accept(customer);

        // function operation
        double totalCost = ServiceOperations.fun1.apply(bm.getCustomerBooking(customer));
        System.out.println("Total cost with discount: " + totalCost);


        // serialization and deserialization
        String fileName = "serviceData.ser";
        SerializerDataClass.serializeServiceData(bm.getBookingMap(), fileName);
        Map<Customer, List<ServiceBooking>> deserializedMap = SerializerDataClass.deserializeServiceData(fileName);
        System.out.println("Deserialized Data: " + deserializedMap);

        // generate report
        String reportFile = "serviceReports.txt";
        FileReportClass.writeServiceReport(deserializedMap, reportFile);
        FileReportClass.readServiceReport(reportFile);

        //stream apis
        FileReportClass.avgCostType(deserializedMap);
        FileReportClass.topCustomer(deserializedMap);

        // cloned service booking
        try {
            ServiceBooking discountedBooking = (ServiceBooking) booking1.clone();
            System.out.println("Cloned Booking with Discount:");
            System.out.println(discountedBooking);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }




}
