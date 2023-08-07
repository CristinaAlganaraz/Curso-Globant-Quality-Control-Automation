/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextracolecciones02;

import Servicio.CantanteFamosoService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtraColecciones02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        CantanteFamosoService cfs = new CantanteFamosoService();
        int opcion;

        do {
            System.out.println(":::::::: MENÚ ::::::::");
            System.out.println("");
            System.out.println("1- Cargar cantante");
            System.out.println("2- Mostrar cantantes y su disco más vendido");
            System.out.println("3- Eliminar cantante");
            System.out.println("4- Salir");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cfs.cargarCantanteFamoso();
                    break;
                case 2:
                    cfs.mostrarCantantes();
                    break;
                case 3:
                    cfs.eliminarCantante();
                    break;
                case 4:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        } while (opcion != 4);
    }

}
