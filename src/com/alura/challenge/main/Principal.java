package com.alura.challenge.main;
import com.alura.challenge.models.ApiService;
import com.alura.challenge.models.Conversor;
import com.alura.challenge.models.Menu;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ApiService apiService = new ApiService();
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor(apiService);
        Menu menu = new Menu();
        menu.mostrarMenu();

        /*
        System.out.println("Pruba de ApiService");
        System.out.println("Ingrese código de moneda (ej: MXN, EUR): ");
        String moneda = scanner.nextLine().toUpperCase();

        double tasa = apiService.obtenerTasaAUSD(moneda);
        System.out.println(moneda + " = "+ tasa); // FUNCIONA

        */

    }
}
