/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextracolecciones03;

import Servicio.Libreria;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtraColecciones03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libreria ls = new Libreria();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int opcion;

        do {
            System.out.println(":::::::::: LIBRERÍA ::::::::::");
            System.out.println("1- Cargar libro");
            System.out.println("2- Mostrar libros");
            System.out.println("3- Prestar libro");
            System.out.println("4- Devolver libro");
            System.out.println("5- Salir");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ls.agregarLibro();
                    break;
                case 2:
                    ls.mostrarLibros();
                    break;
                case 3:
                    ls.prestarLibro();
                    break;
                case 4:
                    ls.devolverLibro();
                    break;
                case 5:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5);
    }
}
