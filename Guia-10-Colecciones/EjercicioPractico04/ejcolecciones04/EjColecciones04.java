/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones04;

import Servicio.PeliculaService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjColecciones04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PeliculaService ps = new PeliculaService();
        int opcion;

        do {
            System.out.println("::::::::: MENÚ PELÍCULAS :::::::::");
            System.out.println("");
            System.out.println("1- Cargar película");
            System.out.println("2- Mostrar películas por título");
            System.out.println("3- Mostrar películas por director");
            System.out.println("4- Mostrar películas películas de acuerdo a su duración (de menor a mayor)");
            System.out.println("5- Mostrar películas películas de acuerdo a su duración (de mayor a menor)");
            System.out.println("6- Mostrar películas con una duración mayor a 1 hora");
            System.out.println("7- Salir");

            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ps.cargarPelicula();
                    break;
                case 2:
                    if (ps.noHayPeliculas()) {
                        System.out.println("No hay películas para mostrar.");
                    } else {
                        System.out.println("Películas por título:");
                        ps.listarPeliculasPorTitulo();
                        ps.mostrarPeliculas();
                    }
                    break;
                case 3:
                    if (ps.noHayPeliculas()) {
                        System.out.println("No hay películas para mostrar.");
                    } else {
                        System.out.println("Películas por director:");
                        ps.listarPeliculasPorDirector();
                        ps.mostrarPeliculas();
                    }
                    break;
                case 4:
                    if (ps.noHayPeliculas()) {
                        System.out.println("No hay películas para mostrar.");
                    } else {
                        System.out.println("Películas de acuerdo a su duración (de menor a mayor):");
                        ps.listarPeliculasPorDuracionAscendente();
                        ps.mostrarPeliculas();
                    }
                    break;
                case 5:
                    if (ps.noHayPeliculas()) {
                        System.out.println("No hay películas para mostrar.");
                    } else {
                        System.out.println("Películas de acuerdo a su duración (de mayor a menor):");
                        ps.listarPeliculasPorDuracionDescendente();
                        ps.mostrarPeliculas();
                    }
                    break;
                case 6:
                    if (ps.noHayPeliculas()) {
                        System.out.println("No hay películas para mostrar.");
                    } else {
                        System.out.println("Películas con una duración mayor a 1 hora:");
                        ps.mostrarPeliculasDuracionMayorDeUnaHora();
                    }
                    break;
                case 7:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 7);
    }

}
