package com.alura.challenge.models;

public class Conversor {

    private ApiService apiService;

    // Constructor. Cada vez que se llamen en main, se pasa la instancia del apiService
    public Conversor(ApiService apiService) {
        this.apiService = apiService;
    }

    public double convertirAUsd(double cantidad, String monedaOrigen, String monedaDestino) {
        if(cantidad <= 0){
            System.out.println("La cantidad debe ser mayor que 0");
        }
        // monedaOrigen y monedaDestino aquí son parámetros nuevos
        double tasaOrigen = apiService.obtenerTasaAUSD(monedaOrigen); // Usa el parámetro
        double tasaDestino = apiService.obtenerTasaAUSD(monedaDestino); //Usa el parámetro
        if(tasaOrigen == 0 || tasaDestino == 0) {
            System.out.println("No se pudo obtener tasa)");
        }

        return (cantidad / tasaOrigen) * tasaDestino;
    }
}
