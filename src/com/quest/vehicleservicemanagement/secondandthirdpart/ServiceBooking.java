package com.quest.vehicleservicemanagement.secondandthirdpart;


import java.io.Serializable;
import java.time.LocalDateTime;

public class ServiceBooking implements Serializable,Cloneable {
    private String bookingId;
    private Customer customer;
    private LocalDateTime serviceDate;
    private String serviceType;
    private double cost;

    public ServiceBooking(String bookingId, Customer customer, LocalDateTime serviceDate, String serviceType, double cost) {
       setBookingId(bookingId);
       setCustomer(customer);
       setServiceDate(serviceDate);
       setServiceType(serviceType);
       setCost(cost);
    }

    // getters and setters
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDateTime serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // cloning the object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        ServiceBooking serviceBookingClone = (ServiceBooking) super.clone();
        serviceBookingClone.setCost(this.getCost() * 0.9);
        return serviceBookingClone;
    }

    // override toString method
    @Override
    public String toString() {
        return "ServiceBooking{" +
                "bookingId=" + getBookingId() +
                ", customer=" + getCustomer() +
                ", serviceDate=" + getServiceDate() +
                ", serviceType='" + getServiceType() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
