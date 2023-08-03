/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextracolecciones01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtraColecciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int numero, suma = 0;

        do {
            System.out.println("Ingrese un número entero (para salir, ingrese -99):");
            numero = leer.nextInt();
            if (numero != -99) {
                numeros.add(numero);
            }
        } while (numero != -99);
        System.out.println("-----------------------------");
        System.out.println("Los números ingresados son:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("- " + numeros.get(i));
        }
        System.out.println("-----------------------------");
        for (int i = 0; i < numeros.size(); i++) {
            suma = suma + numeros.get(i);
        }
        System.out.println("La suma de todos los números ingresados es " + suma + " y su media es " + (suma / numeros.size()) + ".");
    }

}
