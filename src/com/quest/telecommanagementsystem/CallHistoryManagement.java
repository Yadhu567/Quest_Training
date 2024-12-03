package com.quest.telecommanagementsystem;

import java.util.ArrayList;

public class CallHistoryManagement implements CallHistoryOperations{
    ArrayList<Call> callHistories=new ArrayList<>(); // to store call histories
    @Override
    public void addCallHistory(Call call) {
        if (call != null && call.getSubscriberId() != null) {
            callHistories.add(call); // adding call details
            System.out.println("Call record added successfully for Subscriber ID" + call.getSubscriberId());
        } else {
            System.out.println("Invalid call record");
        }
    }

    @Override
    public ArrayList<Call> getCallHistoryBySubscriber(String subscriberId) {
        System.out.println("The call history of a particular subscriber is");
        ArrayList<Call> result = new ArrayList<>(); // for storing result
        for (Call record : callHistories) {
            if (record.getSubscriberId().equals(subscriberId)) {
                System.out.println(record);
                result.add(record);
            }
        }
        return result;
    }
}
