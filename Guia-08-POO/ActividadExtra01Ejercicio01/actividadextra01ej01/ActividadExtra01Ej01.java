/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra01ej01;

import Entidad.Vehiculo;
import Service.VehiculoService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ActividadExtra01Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        VehiculoService vehiculoService = new VehiculoService();
        List<Vehiculo> lista = new ArrayList<>();
        int segundos;
        int avanceNeto1, avanceNeto2, avanceNeto3;

        for (int i = 0; i < 3; i++) {
            System.out.println("Completar los datos del vehículo " + (i + 1) + ":");
            lista.add(vehiculoService.crearVehiculo());
            System.out.println("");
            System.out.println("El vehículo " + (i + 1) + " avanzó:");
            System.out.println(vehiculoService.moverVehiculo(lista.get(i), 5) + " metros en 5 segundos.");
            System.out.println(vehiculoService.moverVehiculo(lista.get(i), 10) + " metros en 10 segundos.");
            System.out.println(vehiculoService.moverVehiculo(lista.get(i), 60) + " metros en 1 minuto.");
            System.out.println("");
        }

        avanceNeto1 = vehiculoService.moverVehiculo(lista.get(0), 60 * 5) + vehiculoService.frenarVehiculo(lista.get(0));
        avanceNeto2 = vehiculoService.moverVehiculo(lista.get(1), 60 * 5) + vehiculoService.frenarVehiculo(lista.get(1));
        avanceNeto3 = vehiculoService.moverVehiculo(lista.get(2), 60 * 5) + vehiculoService.frenarVehiculo(lista.get(2));

        System.out.println("El vehiculo 1 avanzó "+avanceNeto1+" metros luego de frenar tras moverse durante 5 minutos.");
        System.out.println("El vehiculo 2 avanzó "+avanceNeto2+" metros luego de frenar tras moverse durante 5 minutos.");
        System.out.println("El vehiculo 3 avanzó "+avanceNeto3+" metros luego de frenar tras moverse durante 5 minutos.");
        System.out.println("");
        
        masLejos(avanceNeto1,avanceNeto2,avanceNeto3);

    }
    
    public static void masLejos(int avance1, int avance2, int avance3) {

        int masLejos = Math.max(avance1, Math.max(avance2, avance3));

        if (masLejos == avance1) {
            System.out.println("El vehiculo 1 fue el que logró llegar más lejos.");

        } else if (masLejos == avance2) {
            System.out.println("El vehiculo 2 fue el que logró llegar más lejos.");
        } else {
            System.out.println("El vehiculo 3 fue el que logró llegar más lejos.");
        }
    }

}
