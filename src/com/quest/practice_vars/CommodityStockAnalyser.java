package com.quest.practice_vars;

public class CommodityStockAnalyser extends StockAnalyser {
    public String commodityType;
    public CommodityStockAnalyser(String stockName, String stockSymbol, int[] prices, String commodityType) {
        super(stockName,stockSymbol,prices); //calls the parent class method
        this.commodityType = commodityType;
    }
    @Override
    public int findMaxPrice() {
        int max=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>max){
                max=prices[i];
            }
        }
        return max;
    }

    @Override
    public int findMinPrice() {
        int min=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<min){
                min=prices[i];
            }
        }
        return min;
    }

    @Override
    public double calculateAveragePrice() {
        int sum=0;
        for(int i=0;i<prices.length;i++){
            sum+=prices[i];
        }
        return (double) sum /prices.length;
    }

    @Override
    public int[] findLongestIncreasingTrend() {
        int maxLen = 0;
        int currLen = 1;
        int start = 0;
        int end = 0;
        int tempStart = 0; // start index of current subsequence
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                currLen++;
                if (currLen > maxLen) {
                    maxLen = currLen;
                    start = tempStart;
                    end = i;
                }
            } else {
                currLen = 1;
                tempStart = i;
            }
        }

        return new int[]{start + 1, end + 1, maxLen};
    }


    @Override
    public void displayAnalysis() {
        System.out.println("Analysis for commodity Stock:");
        System.out.println("Stock Name: " + stockName);
        System.out.println("Stock Symbol: " + stockSymbol);
        System.out.println("Sector: " + commodityType);
        System.out.println("Highest Price: " + findMaxPrice());
        System.out.println("Lowest Price: " + findMinPrice());
        System.out.println("Average Price: " + calculateAveragePrice());
        int[] trend=findLongestIncreasingTrend(); // to store start day,end day, length of days
        System.out.println("Longest Increasing Trend: Start Day " + trend[0] + ", End Day " + trend[1] + ", Length: " + trend[2] + " days");

    }
}
