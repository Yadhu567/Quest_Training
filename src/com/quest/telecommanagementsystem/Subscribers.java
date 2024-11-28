package com.quest.telecommanagementsystem;

import java.io.Serializable;

public class Subscribers implements Serializable {
    private String subscriberId;
    private String name;
    private String phoneNumber;
    private String planType;
    private double balance;

    public Subscribers(String subscriberId, String name, String phoneNumber, String planType, double balance){
        setsubscriberId(subscriberId);
        setName(name);
        setPhoneNumber(phoneNumber);
        setPlanType(planType);
        setBalance(balance);
    }
    //getters and setters
    public String getsubscriberId() {
        return subscriberId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPlanType() {
        return planType;
    }

    public double getBalance() {
        return balance;
    }

    public void setsubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //overriding default toString method
    @Override
    public String toString() {
        return "subscriber{" +
                "subscriberId=" + getsubscriberId() +
                ", name='" + getName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", planType='" + getPlanType() + '\'' +
                ", balance=" + getBalance() +
                '}';
    }
}