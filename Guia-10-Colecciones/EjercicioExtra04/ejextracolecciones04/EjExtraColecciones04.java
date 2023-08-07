/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextracolecciones04;

import Servicio.CodigosPostalesService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjExtraColecciones04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CodigosPostalesService cps = new CodigosPostalesService();
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(":::::::::: CÓDIGOS POSTALES SERVICE ::::::::::");
            System.out.println("1- Cargar código postal");
            System.out.println("2- Mostrar códigos postales y ciudades");
            System.out.println("3- Buscar ciudad por código postal");
            System.out.println("4- Modificar ciudad");
            System.out.println("5- Eliminar ciudad");
            System.out.println("6- Salir del sistema");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cps.cargarCodigoPostalCiudad();
                    break;
                case 2:
                    cps.mostrarCodigoPostalCiudad();
                    break;
                case 3:
                    cps.buscarCiudadPorCodigoPostal();
                    break;
                case 4:
                    cps.modificarCiudad();
                    break;
                case 5:
                    cps.eliminarCodigoPostalCiudad();
                    break;
                case 6:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 6);
    }

}
