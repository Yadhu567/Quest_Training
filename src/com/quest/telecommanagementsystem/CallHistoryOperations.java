package com.quest.telecommanagementsystem;

import java.util.ArrayList;

public interface CallHistoryOperations {
    void addCallHistory(CallHistory call);
    ArrayList<CallHistory> getCallHistoryBySubscriber(String subscriberId);
}
