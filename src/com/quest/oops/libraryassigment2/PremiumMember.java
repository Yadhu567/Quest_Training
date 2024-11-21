package com.quest.oops.libraryassigment2;

public class PremiumMember extends Member {

    public PremiumMember(String memberId, String name,String memberType,int borrowLimit) {
        super(memberId, name,memberType,borrowLimit);
    }
    //method to calculate late fine for premium members
    @Override
    public double lateFine(final int days){
        return days * 1.2;
    }

    // overriding the toString method
    @Override
    public String toString() {
        return super.toString();
    }
}
