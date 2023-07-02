/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo14;

import Entidad.Movil;
import Service.MovilService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjPOO14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MovilService movilService = new MovilService();
        Scanner leer = new Scanner(System.in);
        List<Movil> listaMoviles = new ArrayList<>();
        List listaCodigos = new ArrayList<>();
        int opcionMenu, equipoElegido;
        String delete;

        do {
            System.out.println(":::::::: SISTEMA DE REGISTRO DE EQUIPOS CELULARES ::::::::");
            System.out.println("");
            System.out.println("Menú de opciones:");
            System.out.println("");
            System.out.println("1- Cargar nuevo equipo");
            System.out.println("2- Actualizar precio de un equipo");
            System.out.println("3- Mostrar detalle de un equipo");
            System.out.println("4- Eliminar equipo de la base de datos");
            System.out.println("5- Salir del sistema");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcionMenu = leer.nextInt();

            switch (opcionMenu) {
                case 1:
                    listaMoviles.add(movilService.cargarCelular());
                    System.out.println("");
                    break;
                case 2:
                    if (listaMoviles.isEmpty() == true) {
                        System.out.println("No hay datos para mostrar.");
                        System.out.println("");
                    } else {
                        System.out.println("Listado de equipos de acuerdo a su código de producto:");
                        System.out.println("");
                        for (int i = 0; i < listaMoviles.size(); i++) {
                            System.out.println((i + 1) + "- " + Arrays.toString(listaMoviles.get(i).getCodigo()));
                        }
                        System.out.println("Elija un equipo:");
                        equipoElegido = leer.nextInt() - 1;
                        movilService.actualizarPrecio(listaMoviles.get(equipoElegido));
                        System.out.println("");
                    }
                    break;
                case 3:
                    if (listaMoviles.isEmpty() == true) {
                        System.out.println("No hay datos para mostrar.");
                        System.out.println("");
                    } else {
                        System.out.println("Listado de equipos de acuerdo a su código de producto:");
                        System.out.println("");
                        for (int i = 0; i < listaMoviles.size(); i++) {
                            System.out.println((i + 1) + "- " + Arrays.toString(listaMoviles.get(i).getCodigo()));
                        }
                        System.out.println("Elija un equipo:");
                        equipoElegido = leer.nextInt() - 1;
                        movilService.mostrarDatos(listaMoviles.get(equipoElegido));
                        System.out.println("");
                    }
                    break;
                case 4:
                    if (listaMoviles.isEmpty() == true) {
                        System.out.println("No hay datos para mostrar.");
                        System.out.println("");
                    } else {
                        System.out.println("Listado de equipos de acuerdo a su código de producto:");
                        System.out.println("");
                        for (int i = 0; i < listaMoviles.size(); i++) {
                            System.out.println((i + 1) + "- " + Arrays.toString(listaMoviles.get(i).getCodigo()));
                        }
                        leer.nextLine();
                        do {
                            System.out.println("Elija un equipo:");
                            equipoElegido = leer.nextInt() - 1;
                            if (equipoElegido > listaMoviles.size()) {
                                System.out.println("Opción inválida.");
                            }
                        } while (equipoElegido > listaMoviles.size());                        
                        leer.nextLine();
                        System.out.println("");
                        System.out.println("Advertencia: El equipo seleccionado será removido permanemente de la base de datos.");
                        do {
                            System.out.println("Ingrese 'S' para continuar o 'N' para cancelar.");
                            delete = leer.next();
                            if (!delete.equalsIgnoreCase("S") && !delete.equalsIgnoreCase("N")) {
                                System.out.println("Opción inválida.");
                            }
                        } while (!delete.equalsIgnoreCase("S") && !delete.equalsIgnoreCase("N"));
                        if (delete.equalsIgnoreCase("S")) {
                            listaMoviles.remove(equipoElegido);
                            System.out.println("Se ha eliminado el equipo de la base de datos.");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    System.out.println("");
                    break;
            }
        } while (opcionMenu != 5);

    }

}
