package ejextraherencia01;

import Servicios.AlquilerService;
import java.util.Scanner;

public class EjExtraHerencia01 {

    public static void main(String[] args) {
        AlquilerService as = new AlquilerService();
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(":::::::: SISTEMA DE ALQUILER DE EMBARCACIONES ::::::::");
            System.out.println("");
            System.out.println("Menú de opciones:");
            System.out.println("");
            System.out.println("1- Mostrar embarcaciones disponibles para alquilar");
            System.out.println("2- Mostrar alquileres");
            System.out.println("3- Alquilar embarcación");
            System.out.println("4- Devolver embarcación");
            System.out.println("5- Salir del sistema");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    as.mostrarEmbarcacionesDisponibles();
                    break;
                case 2:
                    as.mostrarAlquileres();
                    break;
                case 3:
                    as.alquilarBarco();
                    break;
                case 4:
                    as.devolverBarco();
                    break;
                case 5:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5);
    }
}
