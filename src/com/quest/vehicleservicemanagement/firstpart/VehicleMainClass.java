package com.quest.vehicleservicemanagement.firstpart;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class VehicleMainClass {
    public static void main(String[] args) {
        ServiceCenter<ElectricVehicle> evServiceCentre = new ServiceCenter<>();

        ServiceCenter<CombustionEngineVehicle> ceServiceCentre = new ServiceCenter<>();

        ElectricVehicle ev1 = new ElectricVehicle("123", "BMW", "S-series", 2014, 3400, "ron", 89, 300);
        ElectricVehicle ev2 = new ElectricVehicle("245", "Audi", "M-series", 2015, 1800, "ken", 48, 460);

        evServiceCentre.addServicedVehicles(ev1);

        evServiceCentre.addServicedVehicles(ev2);

        CombustionEngineVehicle ce1 = new CombustionEngineVehicle("423", "Benz", "c-series", 2018, 6300, "robert", "petrol", 1);
        CombustionEngineVehicle ce2 = new CombustionEngineVehicle("689", "Cadillac", "p-series", 2023, 5900, "alan", "diesel", 2);

        ceServiceCentre.addServicedVehicles(ce1);
        ceServiceCentre.addServicedVehicles(ce2);

        // two predicates
        Predicate<Vehicle> pd1 = (v) -> v.getMileage() > 5000;

        Predicate<Vehicle> pd2 = (v) -> v.getYear() < 2015;

        // for getting the set of both vehicles
        Set<ElectricVehicle> electricVehicles = evServiceCentre.getAllServicedVehicle();
        Set<CombustionEngineVehicle> combustionVehicles = ceServiceCentre.getAllServicedVehicle();

        for (ElectricVehicle e : electricVehicles) {
            if (pd1.test(e)) {
                System.out.println(e);
            }
        }
        for (CombustionEngineVehicle ce : combustionVehicles) {
            if (pd1.test(ce)) {
                System.out.println(ce);
            }
        }
        for (ElectricVehicle e : electricVehicles) {
            if (pd2.test(e)) {
                System.out.println(e);
            }
        }
        for (CombustionEngineVehicle ce : combustionVehicles) {
            if (pd2.test(ce)) {
                System.out.println(ce);
            }
        }

        //consumer
        Consumer<Vehicle> cn1 = (v) -> System.out.println(v.getVin() + " " + v.getMileage());


        for (ElectricVehicle e : electricVehicles) {
            cn1.accept(e);
        }
        for (CombustionEngineVehicle ce : combustionVehicles) {
            cn1.accept(ce);
        }

        // supplier
        Supplier<ElectricVehicle> sp1 = () -> new ElectricVehicle("224", "Tata", "nexon", 20120, 4400, "ravi", 73, 240);

        ElectricVehicle randomEv = sp1.get();

        System.out.println(randomEv);


        // function
        Function<Vehicle, Double> resale = (v) -> {
            double originalPrice = 320000;
            double depreciationRate = 0.11;
            int yearsUsed = 2020 - v.getYear();
            return originalPrice - (depreciationRate * yearsUsed * originalPrice);
        };
        System.out.println("resale value of vehicle with id" + ev1.getVin() + " is: " + resale.apply(ev1));

        List<Vehicle> allVehicles = new ArrayList<>();
        allVehicles.addAll(evServiceCentre.getAllServicedVehicle());
        allVehicles.addAll(ceServiceCentre.getAllServicedVehicle());


        //stream apis
        Vehicle oldestVehicle= allVehicles.stream().min(Comparator.comparingInt(Vehicle::getYear)).get();
        System.out.println("oldest vehicle "+oldestVehicle);

        Map<String, Long> vehicleType = allVehicles.stream().collect(Collectors.groupingBy(vehicle -> vehicle instanceof ElectricVehicle ? "Electric" : "Combustion", Collectors.counting()));

        System.out.println("Vehicles by Type:");
        vehicleType.forEach((type, count) -> System.out.println(type+" = "+count));
    }

}
