package com.alura.challenge.models;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {
    private String BASE_URL = "https://v6.exchangerate-api.com/v6/b85f5a4936d94b0efc9ed875/latest/USD";



    public double obtenerTasaAUSD(String monedaOrigen){
        try{
            // Hacer petición HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(BASE_URL))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // JSON
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject rates = json.getAsJsonObject("conversion_rates");

            // Obtener tasa para la monedaOrigen (ej: "MXM → 0.05)
            return rates.get(monedaOrigen).getAsDouble();
        } catch (Exception e) {
            System.err.println("Error en ApiService: " + e.getMessage());
            return 0; // Si falla, retorna 0 (manejaremos el error después)
        }
    }
}
