/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cafetera;
import Entidad.Taza;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class TazaService {

    private Scanner leer = new Scanner(System.in);
    private Cafetera cafetera = new Cafetera();

    public Taza crearTaza() {

        System.out.println("Indique el tamaño de la taza vacía:");
        int tamanio = leer.nextInt();

        return new Taza(tamanio);
    }

    public void servirTaza(Taza taza, Cafetera cafetera) {
        
        if (cafetera.getCantidadActual() == 0) {
            System.out.println("Lo siento. No hay más café.");
        } else if (taza.getTamanio() > cafetera.getCantidadActual()) {
            System.out.println("El café no alcanza para llenar la taza. Se servirán "+cafetera.getCantidadActual()+"ml.");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("Sírvase su taza de café.");
            cafetera.setCantidadActual(cafetera.getCantidadActual()-taza.getTamanio());
        }

    }

}
