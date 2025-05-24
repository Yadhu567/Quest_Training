package com.quest.http;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CryptoCurrency {

    @JsonProperty("id")
    private String id;
    @JsonProperty("current_price")
    private double current_price;

    public CryptoCurrency() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setCurrentPrice(double currentPrice){
        this.current_price=currentPrice;
    }

    public double getCurrentPrice() {
        return current_price;
    }

    @Override
    public String toString() {
        return "CryptoCurrency{" +
                "id=" + getId() +
                ", currentPrice='" + getCurrentPrice() + '\'' +
                '}';
    }
}
