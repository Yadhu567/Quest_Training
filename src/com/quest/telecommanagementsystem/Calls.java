package com.quest.telecommanagementsystem;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Calls implements Serializable {
    private String subscriberId;
    private String callType;
    private int duration;
    private LocalDateTime timeStamp;

    public Calls(String subscriberId, String callType, int duration, LocalDateTime timeStamp) {
        setsubscriberId(subscriberId);
        setCallType(callType);
        setDuration(duration);
        setTimeStamp(timeStamp);
    }

    //getters and setters
    public String getsubscriberId() {
        return subscriberId;
    }

    public void setsubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
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
                "subscriberId=" + getsubscriberId() +
                ", callType='" + getCallType() + '\'' +
                ", duration=" + getDuration() +
                ", timeStamp=" + getTimeStamp() +
                '}';
    }
}
