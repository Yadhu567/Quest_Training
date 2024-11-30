package com.quest.telecommanagementsystem;

import java.io.Serializable;

public class Subscriber implements Serializable {
    private String subscriberId;
    private String name;
    private String phoneNumber;
    private PlanType planType;
    private double balance;

    public Subscriber(String subscriberId, String name, String phoneNumber, PlanType planType, double balance){
        setSubscriberId(subscriberId);
        setName(name);
        setPhoneNumber(phoneNumber);
        setPlanType(planType);
        setBalance(balance);
    }
    //getters and setters
    public String getSubscriberId() {
        return subscriberId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public double getBalance() {
        return balance;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPlanType(PlanType planType) {
        this.planType = planType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //overriding default toString method
    @Override
    public String toString() {
        return "subscriber{" +
                "subscriberId=" + getSubscriberId() +
                ", name='" + getName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", planType='" + getPlanType() + '\'' +
                ", balance=" + getBalance() +
                '}';
    }
}
