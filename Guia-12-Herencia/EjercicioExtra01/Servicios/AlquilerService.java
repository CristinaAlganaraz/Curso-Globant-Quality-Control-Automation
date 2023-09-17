package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoAMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.util.ArrayList;
import java.util.Scanner;

public class AlquilerService {

    ArrayList<Alquiler> alquileres = new ArrayList<>();
    ArrayList<Barco> barcos = instanciarBarcos();

    public void alquilarBarco() {
        if (barcos.isEmpty()) {
            System.out.println("No hay embarcaciones disponibles para alquilar.");
        } else {
            Scanner leer = new Scanner(System.in);
            Alquiler alquiler = new Alquiler();
            int index;
            do {
                mostrarEmbarcacionesDisponibles();
                System.out.println("Elija una opción:");
                index = leer.nextInt();

                if (index <= 0 || index > barcos.size()) {
                    System.out.println("Opción inválida. Debe elegir una opción del 1 a " + barcos.size() + ".");
                    System.out.println("");
                }
            } while (index <= 0 || index > barcos.size());

            alquiler = alquiler.crearAlquiler(barcos, (index - 1));
            alquileres.add(alquiler);
            System.out.println("Cantidad de días: " + alquiler.cantidadDias());
            System.out.println("Total a pagar: $" + alquiler.getPrecio());
            barcos.remove(barcos.get(index - 1));
            System.out.println("");
        }
    }

    public void devolverBarco() {
        if (alquileres.isEmpty()) {
            System.out.println("No hay alquileres pendientes de devolver.");
        } else {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese su DNI:");
            int dni = leer.nextInt();
            boolean bandera = false;
            for (int i = 0; i < alquileres.size(); i++) {
                if (alquileres.get(i).getDni() == dni) {
                    barcos.add(alquileres.get(i).getBarco());
                    alquileres.remove(alquileres.get(i));
                    System.out.println("Devolución realizada.");
                    bandera = true;
                    break;
                }
            }
            if (!bandera) {
                System.out.println("No se encontró el DNI ingresado.");
            }
        }
    }

    public void mostrarAlquileres() {
        if (alquileres.isEmpty()) {
            System.out.println("No hay alquileres para mostrar.");
        } else {
            System.out.println("Alquileres:");
            System.out.println("");
            for (int i = 0; i < alquileres.size(); i++) {
                System.out.println(alquileres.get(i).toString());
            }
        }
        System.out.println("");
    }

    public void mostrarEmbarcacionesDisponibles() {
        if (barcos.isEmpty()) {
            System.out.println("No hay embarcaciones para mostrar.");
        } else {
            System.out.println("Embarcaciones disponibles para alquilar:");
            System.out.println("");
            for (int i = 0; i < barcos.size(); i++) {
                if (barcos.get(i) instanceof Velero) {
                    System.out.println((i + 1) + "-" + ((Velero) barcos.get(i)).toString());
                }
                if (barcos.get(i) instanceof BarcoAMotor) {
                    System.out.println((i + 1) + "-" + ((BarcoAMotor) barcos.get(i)).toString());
                }
                if (barcos.get(i) instanceof Yate) {
                    System.out.println((i + 1) + "-" + ((Yate) barcos.get(i)).toString());
                }
            }
        }
        System.out.println("");
    }

    public static ArrayList<Barco> instanciarBarcos() {
        ArrayList<Barco> barcos = new ArrayList<>();
        Velero velero = new Velero(3, "ABX311", 8.6, 1998);
        BarcoAMotor barcoAMotor = new BarcoAMotor(1, "SOL334", 20.5, 2002);
        Yate yate = new Yate(3, 4, "JOO999", 15, 2010);
        barcos.add(velero);
        barcos.add(barcoAMotor);
        barcos.add(yate);
        return barcos;
    }
}
