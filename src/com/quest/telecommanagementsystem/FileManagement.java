package com.quest.telecommanagementsystem;
import java.io.FileWriter;
import java.io.IOException;
public class FileManagement {

    // Saving subscribers
    public void saveSubscriber(Subscriber subscriber) {
            try (FileWriter writer = new FileWriter("subscribers.txt", true)) {
                writer.write(subscriber.getSubscriberId() + "," +
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
    public void saveCallHistory(Call callHistory) {
        try (FileWriter writer = new FileWriter("call history.txt", true)) {
            writer.write(callHistory.getSubscriberId() + "," +
                    callHistory.getCallType() + "," +
                    callHistory.getDuration() + "," +
                    callHistory.getTimeStamp() + "\n");
            System.out.println("Call history data saved");
        } catch (IOException e) {
            System.out.println("Error in saving call history: " + e.getMessage());
        }
    }

}
