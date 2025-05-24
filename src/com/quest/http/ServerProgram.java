package com.quest.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ServerProgram {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url="https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=3&page=1&sparkline=false";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        List<CryptoCurrency> cryptoList = mapper.readValue(response.body(), new TypeReference<>() {
        });

        for (CryptoCurrency crypto : cryptoList) {
            System.out.println(crypto);
        }

    }
}
