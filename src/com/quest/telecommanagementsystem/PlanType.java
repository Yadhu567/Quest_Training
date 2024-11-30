package com.quest.telecommanagementsystem;

public enum PlanType {
    Prepaid,
    Postpaid;

    public boolean isPrepaid(){
        return this.equals(Prepaid);
    }
    public boolean isPostpaid(){
        return this.equals(Postpaid);
    }
}
