package com.quest.telecommanagementsystem;

import java.util.ArrayList;

public class CallHistoryManagement implements CallHistoryOperations{
    ArrayList<Calls> callHistories=new ArrayList<>(); // to store call histories
    @Override
    public void addCallHistory(Calls call) {
        if (call != null && call.getsubscriberId() != null) {
            callHistories.add(call); // adding call details
            System.out.println("Call record added successfully for Subscriber ID" + call.getsubscriberId());
        } else {
            System.out.println("Invalid call record");
        }
    }

    @Override
    public ArrayList<Calls> getCallHistoryBySubscriber(String subscriberId) {
        System.out.println("The call history of a particular subscriber is");
        ArrayList<Calls> result = new ArrayList<>(); // for storing result
        for (Calls record : callHistories) {
            if (record.getsubscriberId().equals(subscriberId)) {
                System.out.println(record);
                result.add(record);
            }
        }
        return result;
    }
}
