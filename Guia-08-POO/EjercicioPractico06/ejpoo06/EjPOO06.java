/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo06;

import Entidad.Cafetera;
import Entidad.Taza;
import Service.CafeteraService;
import Service.TazaService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjPOO06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CafeteraService cafeteraService = new CafeteraService();
        TazaService tazaService = new TazaService();

        System.out.println("Bienevenido/a al programa de Nespresso.");
        System.out.println("Para continuar, por favor complete la siguiente información:");

        Cafetera cafetera = cafeteraService.crearCafetera();
        Taza taza = tazaService.crearTaza();

        int opcion;

        do {
            System.out.println("");
            System.out.println("MENÚ DE OPCIONES:");
            System.out.println("");
            System.out.println("1- Llenar cafetera");
            System.out.println("2- Servir taza");
            System.out.println("3- Agregar café a la cafetera");
            System.out.println("4- Vaciar cafetera");
            System.out.println("5- Salir");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cafeteraService.llenarCafetera(cafetera);
                    break;
                case 2:
                    tazaService.servirTaza(taza,cafetera);
                    break;
                case 3:
                    cafeteraService.agregarCafe(cafetera);
                    break;
                case 4:
                    cafeteraService.vaciarCafetera(cafetera);
                    break;
                case 5:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

    }
    
}
