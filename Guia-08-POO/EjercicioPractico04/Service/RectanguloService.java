/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class RectanguloService {

    private Scanner leer = new Scanner(System.in);
    private Rectangulo rectangulo = new Rectangulo();

    public void crearRectangulo() {

        do {
            System.out.println("Ingrese un número > 0 para definir la base del rectángulo:");
            rectangulo.setBase(leer.nextDouble());
            if (rectangulo.getBase() < 0) {
                System.out.println("Dato inválido.");
            }
        } while (rectangulo.getBase() < 0);

        do {
            System.out.println("Ingrese un número > 0 para definir la altura del rectángulo:");
            rectangulo.setAltura(leer.nextDouble());
            if (rectangulo.getAltura() < 0) {
                System.out.println("Dato inválido.");
            }
        } while (rectangulo.getAltura() < 0);

    }

    public double calcularSuperficie() {

        return rectangulo.getBase() * rectangulo.getAltura();

    }

    public double calcularPerimetro() {

        return (rectangulo.getBase() + rectangulo.getAltura()) * 2;

    }

    public void dibujarRectangulo() {

        int filas = (int) rectangulo.getBase();
        int columnas = (int) rectangulo.getAltura();

        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                if (i == 0 || i == columnas - 1 || j == 0 || j == filas - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
