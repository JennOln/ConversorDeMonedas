package com.alura.challenge.models;
import java.util.Scanner;

public class Menu {
    //Se instancia ApiService, conversor y Scanner
    ApiService apiService = new ApiService();
    Conversor conversor = new Conversor(apiService);
    Scanner scanner = new Scanner(System.in); //

    String textoMenu = """
            ===CONVERSOR DE MONEDAS ===
            1. DOLAR ⮕ MXN
            2. MXN   ⮕ DOLAR
            3. DOLAR ⮕ CAD
            4. CAD   ⮕ DOLAR
            5. DOLAR ⮕ NZD
            6. NZD   ⮕ DOLAR
            7. SALIR
            Elija una opción (1-7):
            """;

    public void mostrarMenu() {
        while(true){
            System.out.println(textoMenu);
            int opcion = scanner.nextInt();
            System.out.println("Ingresa la cantidad que deseas convertir: ");
            int cantidad = scanner.nextInt();

            if (opcion == 7) break;

            switch (opcion) {
                case 1: System.out.println(cantidad + " USD a MXM es = " + (conversor.convertirAUsd(cantidad,"USD", "MXN"))); break;
                case 2: System.out.println(cantidad + " MXN a USD es = " + (conversor.convertirAUsd(cantidad, "MXN", "USD"))); break;
                case 3: System.out.println(cantidad + " USD a CAD es = " + (conversor.convertirAUsd(cantidad, "USD", "CAD"))); break;
                case 4: System.out.println(cantidad + " CAD a USD es = " + (conversor.convertirAUsd(cantidad, "CAD", "USD"))); break;
                case 5: System.out.println(cantidad + " USD a NZD es = " + (conversor.convertirAUsd(cantidad, "USD", "NZD"))); break;
                case 6: System.out.println(cantidad + " NZD a USD es = " + (conversor.convertirAUsd(cantidad, "NZD", "USD"))); break;
                default:
                    System.out.println("❌ Opción inválida");
            }
        }
    }
}
