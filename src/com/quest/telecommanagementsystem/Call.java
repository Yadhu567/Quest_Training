package com.quest.telecommanagementsystem;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Call implements Serializable {
    private String subscriberId;
    private CallType callType;
    private int duration;
    private LocalDateTime timeStamp;

    public Call(String subscriberId, CallType callType, int duration, LocalDateTime timeStamp) {
        setSubscriberId(subscriberId);
        setCallType(callType);
        setDuration(duration);
        setTimeStamp(timeStamp);
    }

    //getters and setters
    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public CallType getCallType() {
        return callType;
    }

    public void setCallType(CallType callType) {
        this.callType = callType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    //overriding default toString method
    @Override
    public String toString() {
        return "CallHistory{" +
                "subscriberId=" + getSubscriberId() +
                ", callType='" + getCallType() + '\'' +
                ", duration=" + getDuration() +
                ", timeStamp=" + getTimeStamp() +
                '}';
    }
}
