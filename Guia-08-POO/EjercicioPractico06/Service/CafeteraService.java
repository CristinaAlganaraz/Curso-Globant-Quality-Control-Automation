/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CafeteraService {

    private Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {

        System.out.println("Indique la capacidad máxima de litros de la cafetera:");
        int capacidadMaxima = leer.nextInt();

        System.out.println("Ingrese la cantidad actual de café que contiene la cafetera:");
        int cantidadActual = leer.nextInt();

        return new Cafetera(capacidadMaxima, cantidadActual);
    }

    public void llenarCafetera(Cafetera cafetera) {

        if (cafetera.getCantidadActual() == cafetera.getCapacidadMaxima()) {
            System.out.println("La cafetera ya está llena.");
        } else {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("Se llenó la cafetera. La cantidad actual de café es: " + cafetera.getCantidadActual() + "ml.");
        }

    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("Se vació la cafetera.");
    }

    public void agregarCafe(Cafetera cafetera) {

        System.out.println("Indique la cantidad de café a agregar:");
        int agregarCafe = leer.nextInt();

        if (cafetera.getCantidadActual() == cafetera.getCapacidadMaxima()) {
            System.out.println("No se puede agregar más café. La cafetera está llena.");
        } else if (agregarCafe + cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()) {
            System.out.println("¡Cuidado! ¡Se va a rebalsar la cafetera! La cantidad que pretende agregar supera a la capacidad máxima de la cafetera.");
            System.out.println("Recuerde que la cantidad máxima de la cafetera es de " + cafetera.getCapacidadMaxima() + "ml y que actualmente contiene " + cafetera.getCantidadActual() + "ml de café.");
            int diferencia = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
            System.out.println("Se agregarán solamente "+diferencia+"ml para llenarla.");
            cafetera.setCantidadActual(cafetera.getCantidadActual()+diferencia);
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + agregarCafe);
            System.out.println("Se agregó el café a la cafetera. Ahora hay " + cafetera.getCantidadActual() + "ml de café.");
        }
    }
}
