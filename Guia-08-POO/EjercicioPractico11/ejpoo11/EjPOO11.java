/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjPOO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el día (DD):");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes (MM):");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el año (AAAA):");
        int anio = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);

        System.out.println("----------------------------");
        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("----------------------------");

        int diferencia = calcularAnios(fecha);

        if (diferencia < 0) {
            System.out.println("Cantidad de años entre la fecha actual y la ingresada: " + (-diferencia));
        } else {
            System.out.println("Cantidad de años entre la fecha actual y la ingresada: " + diferencia);
        }
    }

    public static int calcularAnios(Date fecha) {

        Date fechaActual = new Date();

        Date fechaActualAnioFechaIngresada = new Date(fecha.getYear(), fechaActual.getMonth(), fechaActual.getDate());

        int anios = fechaActual.getYear() - fecha.getYear();

        if (fechaActualAnioFechaIngresada.before(fecha) == true) {
            anios--;
            return anios;
        }
        return anios;
    }
}


