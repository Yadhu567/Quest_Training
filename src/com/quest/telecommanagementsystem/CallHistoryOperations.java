package com.quest.telecommanagementsystem;

import java.util.ArrayList;

public interface CallHistoryOperations {
    void addCallHistory(Call call);
    ArrayList<Call> getCallHistoryBySubscriber(String subscriberId);
}
