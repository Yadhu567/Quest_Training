package com.quest.vehicleinventorymanagement;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args)  {
        InventoryManagement inventoryManagement =new InventoryManagement();
        SalesManagement salesManagement = new SalesManagement(inventoryManagement);
        Scanner sc=new Scanner(System.in);

        System.out.println("Add Cars to the Inventory:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Car ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = doubleValidation(sc); //double validation

            System.out.print("Enter Manufacture Date: ");
            LocalDate manufactureDate = dateValidation(sc); //date validation

            System.out.print("Enter Seating Capacity: ");
            int seatingCapacity = integerValidation(sc); //integer validation
            sc.nextLine();

            Vehicle car = new Car(id, brand, model, price, manufactureDate, seatingCapacity);
            inventoryManagement.addVehicle(car);
        }

        System.out.println("Add Bikes to the Inventory:");
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter Bike ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = doubleValidation(sc); //double validation

            System.out.print("Enter Manufacture Date: ");
            LocalDate manufactureDate = dateValidation(sc); //date validation

            System.out.print("Enter Engine Capacity in cc: ");
            int engineCapacity = integerValidation(sc); // integer validation
            sc.nextLine();

            Vehicle bike = new Bike(id, brand, model, price, manufactureDate, engineCapacity);
            inventoryManagement.addVehicle(bike);
        }
        while (true) {
            System.out.println("Select an option");
            System.out.println("1.Display All Vehicles in Inventory");
            System.out.println("2.Search Vehicles by Brand");
            System.out.println("3.Purchase a Vehicle");
            System.out.println("4.Display Vehicles Purchased by Customers sorted by price");
            System.out.println("5.Serialize Sales Data");
            System.out.println("6.Deserialize Sales Data");
            System.out.println("7.Exit");

            int choice = integerValidation(sc); // integer validation
            switch (choice) {
                case 1 :
                    System.out.println("Inventory Vehicles:");
                    List<Vehicle> vechicleList= inventoryManagement.getVehicles();
                    for (Vehicle vehicle:vechicleList){
                        System.out.println(vehicle);
                    }
                    break;

                case 2 :
                    System.out.print("Enter Brand to Search: ");
                    String brand = sc.nextLine();
                    System.out.println("Vehicles from Brand " + brand + ":");
                    inventoryManagement.vehiclesByBrand(brand);
                    break;

                case 3 :
                    System.out.print("Enter Customer ID: ");
                    String customerId = sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName = sc.nextLine();
                    System.out.print("Enter Customer Email: ");
                    String customerEmail = sc.nextLine();
                    Customer customer = new Customer(customerId, customerName, customerEmail);

                    System.out.print("Enter Vehicle ID to Purchase: ");
                    String vehicleId = sc.nextLine();

                    Vehicle vehicleToPurchase = inventoryManagement.findVehicleById(vehicleId);
                    if (vehicleToPurchase == null) { //checks the vehicle is null
                        System.out.println("Vehicle not found in inventory");
                    } else {
                        try {
                            salesManagement.purchaseVehicle(customer, vehicleToPurchase);
                            System.out.println("Vehicle purchased successfully");
                        } catch (VehicleNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case 4 :
                    salesManagement.purchasesVehicleSortedByPrice();
                    break;

                case 5:
                    try {
                        salesManagement.serializeSalesData("salesData.txt");
                        System.out.println("Sales data serialized successfully.");
                    } catch (IOException e) {
                        System.out.println("Error during serialization: " + e.getMessage());
                    }
                    break;

                case 6:
                    try {
                        salesManagement.deserializeSalesData("salesData.txt");
                        System.out.println("Sales data deserialized successfully.");
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("Error during deserialization: " + e.getMessage());
                    }
                    break;

                case 7 :
                    System.out.println("--exiting--");
                    return;

                default:
                    System.out.println("Invalid choice,please try again");
                    break;
            }
        }
    }
    // integer validation
    private static int integerValidation(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input.Please enter a valid integer");
            sc.next();
        }
        return sc.nextInt();
    }
    // double validation
    private static Double doubleValidation(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input.Please enter a valid integer");
            sc.next();
        }
        return sc.nextDouble();
    }
    //Date validation
    private static  LocalDate dateValidation(Scanner sc) {
        while (true) {
            try {
                String dateInput = sc.nextLine();
                if (dateInput==null) {
                    System.out.println("Input cannot be empty.");
                    continue;
                }
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //formatting date input
                return LocalDate.parse(dateInput, formatter);
            } catch (Exception e) {
                System.out.println("Invalid date format");
            }
        }
    }

}
