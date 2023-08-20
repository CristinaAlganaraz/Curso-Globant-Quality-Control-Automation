/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrelaciones03;

import Servicio.Baraja;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjRelaciones03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Baraja baraja = new Baraja();
        baraja.armarBaraja();
        int opcion;

        do {
            System.out.println(":::::::: BARAJA DE CARTAS ESPAÑOLAS ::::::::");
            System.out.println("");
            System.out.println("1- Barajar");
            System.out.println("2- Siguiente carta");
            System.out.println("3- Mostrar cantidad de cartas disponibles");
            System.out.println("4- Dar cartas");
            System.out.println("5- Mostrar cartas del montón");
            System.out.println("6- Mostrar baraja");
            System.out.println("7- Salir");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    if (baraja.cartasDisponibles() == 0) {
                        System.out.println("No hay cartas para barajar.");
                    } else {
                        baraja.barajar();
                        System.out.println("Se ha barajado el mazo de cartas.");
                    }
                    break;
                case 2:
                    if (baraja.cartasDisponibles() == 0) {
                        System.out.println("No hay más cartas.");
                    } else {
                        baraja.siguienteCarta();
                    }
                    break;
                case 3:
                    if (baraja.cartasDisponibles() == 0) {
                        System.out.println("No hay más cartas disponibles.");
                    } else {
                        System.out.println("Quedan " + baraja.cartasDisponibles() + " cartas disponibles.");
                    }
                    break;
                case 4:
                    if (baraja.cartasDisponibles() == 0) {
                        System.out.println("No hay más cartas para dar.");
                    } else {
                        System.out.println("Ingrese el número de cartas a dar:");
                        int cantidad = leer.nextInt();
                        baraja.darCartas(cantidad);
                    }
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 7);
    }
}
