package com.quest.practice_vars;

import java.util.Scanner;

public class InventoryManagementSystem {
    final static int MINPRODUCT = 0; // minimum price of product
    final static int MAXPRODUCT = 100; // maximum price of product

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of products:");
            int numberOfProducts = integerValidation(sc);
            if (numberOfProducts < MINPRODUCT || numberOfProducts > MAXPRODUCT) {
                System.out.println("Invalid input. Number of products must be between " + MINPRODUCT + " and " + MAXPRODUCT);
                continue;
            }
            String[] products = new String[numberOfProducts];
            sc.nextLine();
            for (int i = 0; i < numberOfProducts; i++) {
                System.out.println("Enter the name of product " + (i + 1) + ":");
                products[i] = sc.nextLine();
            }

            int[][] inventory = new int[numberOfProducts][2];
            for (int i = 0; i < numberOfProducts; i++) {
                System.out.println("Enter number of units for " + products[i] + ":");
                inventory[i][0] = integerValidation(sc);
                System.out.println("Enter price per unit for " + products[i] + ":");
                inventory[i][1] = integerValidation(sc);
            }

            int[] quantitySold = new int[numberOfProducts];
            for (int i = 0; i < numberOfProducts; i++) {
                System.out.println("Enter number of units sold for " + products[i] + ":");
                quantitySold[i] = integerValidation(sc);
            }

            salesReport(products, inventory, quantitySold);
            inventoryShortageCheck(products, inventory, quantitySold);

            System.out.println("Enter the product to restock:");
            sc.nextLine();
            String restockProduct = sc.nextLine();
            System.out.println("Enter the quantity to restock:");
            int restockQuantity = integerValidation(sc); // to validate integer
            reStockInventory(restockProduct, restockQuantity, products, inventory);

            System.out.println("Task 4: Sales Summary Based on Price Range:");
            System.out.println("Enter minimum price:");
            int minPrice = integerValidation(sc); // to validate integer
            System.out.println("Enter maximum price:");
            int maxPrice = integerValidation(sc); // to validate integer
            if (minPrice > maxPrice) {
                System.out.println("Invalid range: Minimum price cannot be greater than maximum price.");
            } else {
                salesSummary(products, inventory, quantitySold, maxPrice, minPrice);
            }

            outOfStockProducts(products, inventory);
            return;
        }
    }
    // To validate integer
    private static int integerValidation(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            sc.next();
        }
        return sc.nextInt();
    }
    // Generate Sales Report
    private static void salesReport(String[] products, int[][] inventory, int[] quantitySold) {
        System.out.println("Sales Report:");
        double totalRevenue = 0;
        for (int i = 0; i < products.length; i++) {
            double revenue = quantitySold[i] * inventory[i][1];
            totalRevenue += revenue;
            System.out.println(products[i] + ": " + quantitySold[i] + " units sold, revenue = " + revenue);
        }
        System.out.println("Total revenue: " + totalRevenue);
    }
    //  Inventory Shortage Check
    public static void inventoryShortageCheck(String[] products, int[][] inventory, int[] quantitySold) {
        System.out.println("Inventory Shortage Check:");
        for (int i = 0; i < products.length; i++) {
            if (quantitySold[i] > inventory[i][0]) {
                System.out.println("Warning: Insufficient stock for " + products[i] + ". Sold " + quantitySold[i] + " units, but only " + inventory[i][0] + " were available.");
            }
        }
    }
    // Restock Inventory
    public static void reStockInventory(String restockProduct, int restockQuantity, String[] products, int[][] inventory) {
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(restockProduct)) {
                inventory[i][0] += restockQuantity;
                System.out.println("Updated stock for " + products[i] + ": " + inventory[i][0] + " units");
                found = true; //// flag to check product to restock found or not
                break;
            }
        }
        if (!found) {
            System.out.println("Product " + restockProduct + " not found in inventory.");
        }
    }
    //  Generate Sales Summary Based on Price Range
    private static void salesSummary(String[] products, int[][] inventory, int[] quantitySold, int maxPrice, int minPrice) {
        System.out.println("Sales Summary Based on Price Range:");
        boolean found = false;
        int totalRevenue = 0;

        for (int i = 0; i < products.length; i++) {
            if (inventory[i][1] >= minPrice && inventory[i][1] <= maxPrice) {
                int revenue = quantitySold[i] * inventory[i][1];
                totalRevenue += revenue;
                found = true; // // flag to check product with in price range found or not
                System.out.println(products[i] + " is in the price range of " + minPrice + " and " + maxPrice + ". Revenue = " + revenue);
            }
        }

        if (!found) {
            System.out.println("No product found in the price range of " + minPrice + " and " + maxPrice);
        } else {
            System.out.println("Total revenue for this range: " + totalRevenue);
        }
    }
    // Track Out-of-Stock Products
    private static void outOfStockProducts(String[] products, int[][] inventory) {
        System.out.println("Out-of-Stock Products:");
        boolean found = false; // flag to check out-of-stock product found or not

        for (int i = 0; i < products.length; i++) {
            if (inventory[i][0] == 0) {
                System.out.println("The product " + products[i] + " is out of stock.");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products are out of stock.");
        }
    }
}
