package com.quest.oops.WeatherMonitoringSystem;

public class WeatherManagement implements WeatherDetails {
    private CityWeatherData[] cities;  // to store weather data for multiple cities
    private int cityCount; // Tracks the number of cities added
    public WeatherManagement(int size) {
        this.cities = new CityWeatherData[size];
        this.cityCount = 0; // Initialize city count to 0
    }
    public void addCityWeatherData(CityWeatherData city) {
        if (cityCount < cities.length) {
            cities[cityCount++] = city;
            System.out.println("Weather data of city added sucessfully!");
        }else{
            System.out.println("Maximum number of cities reached. Cannot add more cities.");
        }
    }
    public void displayCityWeatherData() {
        if (cityCount == 0) {
            System.out.println("No cities to display weather data.");
            return;
        }
        for(CityWeatherData city : cities) {
            System.out.println(city);
        }
    }
    @Override
    public void maxTempCity() {
        if (cities.length == 0) {
            System.out.println("No cities available to display temperature.");
            return;
        }
        CityWeatherData maxCity = cities[0]; // to store with the highest temperature
        for (CityWeatherData city : cities) {
            if (city != null && city.getCurrentTemperature() > maxCity.getCurrentTemperature()) {
                maxCity = city;
            }
        }
        System.out.println("City with the highest temperature: " + maxCity);
    }



    @Override
    public void minTempCity() {
        if (cities.length == 0) {
            System.out.println("No cities available. to display temperature.");
            return;
        }
        CityWeatherData minCity = cities[0]; // to store with the lowest temperature
        for (CityWeatherData city : cities) {
            if (city != null && city.getCurrentTemperature() < minCity.getCurrentTemperature()) {
                minCity = city;
            }
        }
        System.out.println("City with the lowest temperature: " + minCity);
    }


    @Override
    public void maxHumCity() {
        if (cities.length == 0) {
            System.out.println("No cities available to display humidity.");
            return;
        }

        System.out.println("Cities with humidity > 80%:");
        boolean found = false; // Flag to check if any cities are found
        for (CityWeatherData city : cities) {
            if (city != null && city.getCurrentHumidity() > 80) {
                System.out.println(city);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cities found with humidity 80%.");
        }
    }

    @Override
    public void cityByWeatherConditon() {
        if (cityCount == 0) {
            System.out.println("No cities available to display weather data.");
            return;
        }
        System.out.println("Cities grouped by weather condition:");
        System.out.println("Cities with sunny weather:");
        boolean foundSunny = false;  // Flag to check if any cities with sunny weather found
        boolean foundRainy = false;  // Flag to check if any cities with rainy weather found
        boolean foundCloudy = false;  // Flag to check if any cities with cloudy weather found
        for (CityWeatherData city : cities) {
            if (city != null) {
                if (city.getWeatherCondition().equals("Sunny")) {
                    System.out.println(city);
                    foundSunny = true;
                } else if (city.getWeatherCondition().equals("Rainy")) {
                    System.out.println(city);
                    foundRainy = true;
                } else if (city.getWeatherCondition().equals("Cloudy")) {
                    System.out.println(city);
                    foundCloudy = true;
                }
            }
        }
        // if no cities is found
        if (!foundSunny) {
            System.out.println("No cities with sunny weather.");
        }
        if (!foundRainy) {
            System.out.println("No cities with rainy weather.");
        }
        if (!foundCloudy) {
            System.out.println("No cities with cloudy weather.");
        }
    }
    @Override
    public void averageTemp() {
        if (cities.length == 0) {
            System.out.println("No cities available to display temperature.");
            return;
        }
        double totalTemp = 0; // to store total temperature
        int count = 0;  // to store city count
        for (CityWeatherData city : cities) {
            if (city != null) {
                totalTemp += city.getCurrentTemperature();
                count++;
            }
        }
        System.out.println("Average Temperature: " + (totalTemp / count) + "°C");
    }


    @Override
    public void tempWarning() {
        System.out.println("Temperature Warnings:");
        boolean flag = false; // flag to check if  cities is found
        for (CityWeatherData city : cities) {
            if (city != null && city.getCurrentTemperature() > 40) {
                System.out.println("Heatwave Alert City: " + city);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No heatwave alerts.");
        }
    }

    @Override
    public void humWarning() {
        System.out.println("Humidity Warnings:");
        boolean flag = false; // flag to check if  cities is found
        for (CityWeatherData city : cities) {
            if (city != null && city.getCurrentHumidity() < 20) {
                System.out.println("Low Humidity Warning: " + city);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No low humidity warnings.");
        }
    }
}
