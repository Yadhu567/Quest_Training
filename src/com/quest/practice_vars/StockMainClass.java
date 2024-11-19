package com.quest.practice_vars;
import java.util.Scanner;
public class StockMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // equity stock
        System.out.println("Enter the details of equity stock");
        System.out.println("enter stock name");
        String equityName = sc.nextLine();
        System.out.println("enter stock symbol");
        String equitySymbol = sc.nextLine();
        System.out.println("enter sector");
        String equitySector = sc.nextLine();
        System.out.println("enter number of days");
        int equityDays = integerValidation(sc); // for validating integer
        int[] equityPrices = new int[equityDays];
        System.out.println("enter stock prices");
        for (int i = 0; i < equityDays; i++) {
            System.out.println("enter stock price for day " + (i+1));
            equityPrices[i] = integerValidation(sc); // for validating integer
        }
        sc.nextLine();
        // commodity stock
        System.out.println("Enter the details of equity stock");
        System.out.println("enter stock name");
        String commodityName = sc.nextLine();
        System.out.println("enter stock symbol");
        String commoditySymbol = sc.nextLine();
        System.out.println("enter sector");
        String commodityType = sc.nextLine();
        System.out.println("enter number of  days");
        int commodityDays = integerValidation(sc); // for validating integer
        int[] commodityPrices = new int[commodityDays];
        System.out.println("enter stock prices");
        for (int i = 0; i < commodityDays; i++) {
            System.out.println("enter stock price for day " + (i+1));
            commodityPrices[i] = integerValidation(sc); // for validating integer
        }
        EquityStockAnalyser equityStock=new EquityStockAnalyser(equityName,equitySymbol,equityPrices,equitySector);
        CommodityStockAnalyser commodityStock=new CommodityStockAnalyser(commodityName,commoditySymbol,commodityPrices,commodityType);
        equityStock.displayAnalysis();
        System.out.println();
        commodityStock.displayAnalysis();

        System.out.println("comparison results");
        double equityAvg= equityStock.calculateAveragePrice(); // to store the  equity stock average
        double commodityAvg= commodityStock.calculateAveragePrice(); //to store the  commodity stock average
        if (equityAvg>commodityAvg) {
            System.out.println("Stock with Highest Average Price: Equity Stock - " + equityName + " with Average Price: " + equityAvg);
        } else{
            System.out.println("Stock with Highest Average Price: Commodity Stock - " + commodityName + " with Average Price: " + commodityAvg);
        }
        int[] equityTrend= equityStock.findLongestIncreasingTrend(); // to store the Longest increasing trend of equity stock
        int[] commodityTrend= commodityStock.findLongestIncreasingTrend(); // to store the Longest increasing trend of commodity stock
        if(equityTrend[2]>commodityTrend[2]) {
            System.out.println("Stock with Longest Increasing Trend: Equity Stock - " + equityName + " with a trend length of " + equityTrend[2] + " days.");
        } else if (equityTrend[2]<commodityTrend[2]) {
            System.out.println("Stock with Longest Increasing Trend: Commodity Stock - " + commodityName + " with a trend length of " + commodityTrend[2] + " days.");
        }
        else{
            System.out.println("Both stocks have the same longest increasing trend length of " + equityTrend[2] + " days.");
        }
    }
    // for integer validation
    private static int integerValidation(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            sc.next();
        }
        return sc.nextInt();
    }
}
