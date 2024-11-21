package com.quest.oops.WeatherMonitoringSystem;
import java.util.Scanner;
public class Mainclass {
    public static final int MAX_TEMP=150;
    public static final int MIN_TEMP=-80;
    public static final int MAX_HUM=100;
    public static final int MIN_HUM=20;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number of cities: ");
        int maxCities = integerValidation(sc); // Validate the maximum cities input
        WeatherManagement weatherObject = new WeatherManagement(maxCities);
        while(true) {
            System.out.println("Weather Monitoring System");
            System.out.println("1. Add Weather Data of City 2. Display Weather Data of All Cities " +
            "3. Weather Data of City with Highest Temperature 4. Weather Data of City with Lowest Temperature"+
            "5. Weather Data of Cities with Humidity greater than 80% 6. List of Weather Data of Cities bases on weather conditions"+
            "7. Average Temperature 8. Temperature Warnings 9. Humidity Warnings 10. Exit \n Choose an option:");
            int choice=integerValidation(sc); // Validate the menu choice
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("Enter city name:");
                    String cityName = sc.nextLine();
                    System.out.print("Enter current temperature in °C: ");
                    int temperature = tempValidation(sc); // Validate temperature input
                    System.out.print("Enter current humidity in %: ");
                    int humidity = humValidation(sc); // Validate humidity input
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter weather condition in Sunny, Rainy, Cloudy : ");
                    String weatherCondition = sc.nextLine();
                    CityWeatherData city = new CityWeatherData(cityName, temperature, humidity, weatherCondition);
                    weatherObject.addCityWeatherData(city);
                    break;
                case 2:
                    weatherObject.displayCityWeatherData();
                    break;

                case 3:
                    weatherObject.maxTempCity();
                    break;

                case 4:
                    weatherObject.minTempCity();
                    break;

                case 5:
                    weatherObject.maxHumCity();
                    break;
                case 6:
                    weatherObject.cityByWeatherConditon();
                    break;
                case 7:
                    weatherObject.averageTemp();
                    break;

                case 8:
                   weatherObject.tempWarning();
                    break;

                case 9:
                    weatherObject.humWarning();
                    break;

                case 10 :
                    System.out.println("exiting");
                    return; // Exit the condition

                default:
                    System.out.println("Invalid choice");

            }
        }
    }
    private static int integerValidation(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            sc.next();
        }
        return sc.nextInt();
    }
    // Method to validate temperature
    public static int tempValidation(Scanner sc) {
        int temp;
        while (true) {
            temp = integerValidation(sc);
            if (temp >= MIN_TEMP && temp <= MAX_TEMP) {
                return temp;
            } else {
                System.out.println("Invalid value, Please enter a value between "+MIN_TEMP+" and "+MAX_TEMP);
            }
        }
    }

    // Method to validate humidity
    public static int humValidation(Scanner sc) {
        int hum;
        while (true) {
            hum = integerValidation(sc);
            if (hum >= MIN_HUM && hum <= MAX_HUM) {
                return hum;
            } else {
                System.out.println("Invalid value, Please enter a value between "+MIN_HUM+" and "+MAX_HUM);
            }
        }
    }
}

