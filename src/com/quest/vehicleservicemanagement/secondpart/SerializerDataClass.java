package com.quest.vehicleservicemanagement.secondpart;

import java.io.*;
import java.util.List;
import java.util.Map;

public class SerializerDataClass {

    // Serialize data
    public static void serializeServiceData(Map<Customer, List<ServiceBooking>> bookingMap, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(bookingMap);
            System.out.println("Data successfully serialized to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize data
    public static Map<Customer, List<ServiceBooking>> deserializeServiceData(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Map<Customer, List<ServiceBooking>>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
