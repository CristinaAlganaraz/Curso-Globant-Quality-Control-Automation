/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class VehiculoService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Vehiculo crearVehiculo() {

        String tipo;

        System.out.println("Marca:");
        String marca = leer.next();

        System.out.println("Modelo:");
        String modelo = leer.next();

        System.out.println("Año:");
        int anio = leer.nextInt();

        leer.nextLine();

        do {
            System.out.println("Indicar el tipo de vehículo (automóvil, motocicleta o bicicleta):");
            tipo = leer.nextLine();
            tipo = tipo.toUpperCase();

            if (!tipo.equalsIgnoreCase("AUTOMOVIL") && !tipo.equalsIgnoreCase("MOTOCICLETA") && !tipo.equalsIgnoreCase("BICICLETA")) {
                System.out.println("Opción inválida.");
            }
        } while (!tipo.equalsIgnoreCase("AUTOMOVIL") && !tipo.equalsIgnoreCase("MOTOCICLETA") && !tipo.equalsIgnoreCase("BICICLETA"));

        return new Vehiculo(tipo, marca, modelo, anio);
    }

    public int moverVehiculo(Vehiculo vehiculo, int segundos) {

        switch (vehiculo.getTipo()) {
            case "AUTOMOVIL":
                return 3 * segundos;
            case "MOTOCICLETA":
                return 2 * segundos;
            case "BICICLETA":
                return 1 * segundos;
            default:
                return 0;
        }
    }

    public int frenarVehiculo(Vehiculo vehiculo) {

        if ("BICICLETA".equals(vehiculo.getTipo())) {
            return 0;
        } else {
            return 2;
        }

    }

}
