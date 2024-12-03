package com.quest.oops.WeatherMonitoringSystem;

public class CityWeatherData {
    private String cityName;
    private int currentTemperature;
    private int currentHumidity;
    private String weatherCondition;
    public CityWeatherData(String cityName, int currentTemperature, int currentHumidity, String weatherCondition) {
        setCityName(cityName);
        setCurrentTemperature(currentTemperature);
        setCurrentHumidity(currentHumidity);
        setWeatherCondition(weatherCondition);
    }
    //getters and setters method
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCurrentTemperature() {
        return currentTemperature;
    }
    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
    public int getCurrentHumidity() {
        return currentHumidity;
    }
    public void setCurrentHumidity(int currentHumidity) {
        this.currentHumidity = currentHumidity;
    }
    public String getWeatherCondition() {
        return weatherCondition;
    }
    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }
    // overriding the toString method
    @Override
    public String toString() {
        return "City{" +
                "cityName='" + getCityName() + '\'' +
                ", currentTemperature=" + getCurrentTemperature() +
                ", currentHumidity=" + getCurrentHumidity() +
                ", weatherCondition='" + getWeatherCondition() + '\'' +
                '}';
    }

}
