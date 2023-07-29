/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones01y02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjColecciones01y02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String opcion = "", raza;
        boolean flag = false;

        do {
            System.out.println("Ingrese raza del perro:");
            perros.add(leer.next());
            do {
                System.out.println("¿Desea agregar otra raza? (S/N)");
                opcion = leer.next();
                if (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
                    System.out.println("Opción incorrecta.");
                }
            } while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N"));
        } while (!opcion.equalsIgnoreCase("N"));
        System.out.println("-----------------------------------------");
        System.out.println("Las razas ingresadas son:");
        for (int i = 0; i < perros.size(); i++) {
            System.out.println((i + 1) + "- " + perros.get(i));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese la raza de perro a eliminar:");
        raza = leer.next();
        Iterator<String> iterator = perros.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(raza)) {
                iterator.remove();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No se encontró la raza.");
        }
        System.out.println("-----------------------------------------");
        Collections.sort(perros);
        System.out.println("Lista de razas ordenada:");
        for (int i = 0; i < perros.size(); i++) {
            System.out.println((i + 1) + "- " + perros.get(i));
        }
    }

}
