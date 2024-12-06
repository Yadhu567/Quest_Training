package com.quest.practice_questions;

public abstract class StockAnalyser {
    public String stockName;
    public String stockSymbol;
    int[] prices;
    public StockAnalyser(String stockName, String stockSymbol, int[] prices) {
        this.stockName = stockName;
        this.stockSymbol = stockSymbol;
        this.prices=prices;
    }
    public abstract int findMaxPrice();
    public abstract int findMinPrice();
    public abstract double calculateAveragePrice();
    public abstract int[] findLongestIncreasingTrend();
    public abstract void displayAnalysis();
}