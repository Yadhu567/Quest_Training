package com.quest.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        String city="London";
        String  API_KEY="33";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + API_KEY + "&units=metric";


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weatherResponse = mapper.readValue(response.body(), WeatherResponse.class);

        System.out.println("City: " + city);
        System.out.println("Temperature: " + weatherResponse.getTemp() + "°C");
        System.out.println("Weather: " + weatherResponse.getDesc());

    }

}
