package com.quest.vehicleservicemanagement.secondpart;
import com.quest.vehicleservicemanagement.firstpart.CombustionEngineVehicle;
import com.quest.vehicleservicemanagement.firstpart.ElectricVehicle;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class FileReportClass {

    // write report
    public static void writeServiceReport(Map<Customer, List<ServiceBooking>> bookingMap, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            double totalRevenue = bookingMap.values().stream().flatMap(List::stream).mapToDouble(ServiceBooking::getCost)
                    .sum();

            Map<String, Long> serviceCount = bookingMap.values().stream().flatMap(List::stream).collect(Collectors.groupingBy(ServiceBooking::getServiceType, Collectors.counting()));

            writer.write("Total Revenue: "+totalRevenue);
            writer.write("Service Counts: ");
            for (Map.Entry<String, Long> entry:serviceCount.entrySet()) {
                writer.write(entry.getKey()+":"+entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // read report file
    public static void readServiceReport(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void avgCostType(Map<Customer, List<ServiceBooking>> bookingMap) {
        double electricAvg = bookingMap.values().stream()
                .flatMap(List::stream).filter(b -> b.getCustomer().getVehicle() instanceof ElectricVehicle)
                .mapToDouble(ServiceBooking::getCost).average().orElse(0);

        double combustionAvg = bookingMap.values().stream()
                .flatMap(List::stream).filter(b -> b.getCustomer().getVehicle() instanceof CombustionEngineVehicle).mapToDouble(ServiceBooking::getCost)
                .average().orElse(0);

        System.out.println("average cost for Electric Vehicles: "+electricAvg);
        System.out.println("average cost for Combustion Vehicles: "+combustionAvg);
    }

    public static void topCustomer(Map<Customer, List<ServiceBooking>> bookingMap) {
        Customer topSpender = bookingMap.entrySet().stream()
                .max((e1, e2) -> Double.compare(e1.getValue().stream().mapToDouble(ServiceBooking::getCost).sum(),
                        e2.getValue().stream().mapToDouble(ServiceBooking::getCost).sum())).map(Map.Entry::getKey).orElse(null);

        if (topSpender != null) {
            System.out.println("top spending customer is "+topSpender);
        }
    }


}
