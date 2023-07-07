/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PuntosService {

    private Scanner leer = new Scanner(System.in);
    private Puntos puntos = new Puntos();

    public Puntos crearPuntos() {

        System.out.println("Indique la coordenada X del primer punto:");
        int x1 = leer.nextInt();

        System.out.println("Indique la coordenada Y del primer punto:");
        int y1 = leer.nextInt();

        System.out.println("Indique la coordenada X del segundo punto:");
        int x2 = leer.nextInt();

        System.out.println("Indique la coordenada Y del segundo punto:");
        int y2 = leer.nextInt();

        return new Puntos(x1, y1, x2, y2);
    }

    public double calcularDevolverDistancia(Puntos puntos) {
        double distancia = Math.sqrt(Math.pow((puntos.getX2() - puntos.getX1()), 2) + Math.pow(puntos.getY2() - puntos.getY1(), 2));
        return distancia;
    }

}
