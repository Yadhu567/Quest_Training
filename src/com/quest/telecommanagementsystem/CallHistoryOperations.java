package com.quest.telecommanagementsystem;

import java.util.ArrayList;

public interface CallHistoryOperations {
    void addCallHistory(Calls call);
    ArrayList<Calls> getCallHistoryBySubscriber(String subscriberId);
}
