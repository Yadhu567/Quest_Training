package com.quest.telecommanagementsystem;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
public class FileManagement {
    private static final String SUBSCRIBER_FILE = "subscribers.txt";
    private static final String CALL_HISTORY_FILE = "callhistory.txt";

    // Saving subscribers
    public void saveSubscriber(Subscribers subscriber) {
            try (FileWriter writer = new FileWriter(SUBSCRIBER_FILE, true)) { // Append mode
                writer.write(subscriber.getsubscriberId() + "," +
                        subscriber.getName() + "," +
                        subscriber.getPhoneNumber() + "," +
                        subscriber.getPlanType() + "," +
                        subscriber.getBalance() + "\n");
                System.out.println("Subscriber data saved");
            } catch (IOException e) {
                System.out.println("Error in saving subscriber: " + e.getMessage());
            }
        }

    // Saving call history
    public void saveCallHistory(CallHistory callHistory) {
        try (FileWriter writer = new FileWriter(CALL_HISTORY_FILE, true)) {
            writer.write(callHistory.getsubscriberId() + "," +
                    callHistory.getCallType() + "," +
                    callHistory.getDuration() + "," +
                    callHistory.getTimeStamp() + "\n");
            System.out.println("Call history data saved");
        } catch (IOException e) {
            System.out.println("Error in saving call history: " + e.getMessage());
        }
    }

}
