/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra02ej01;

import Service.AlquilerService;
import Service.PeliculaService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ActividadExtra02Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PeliculaService ps = new PeliculaService();
        AlquilerService as = new AlquilerService();
        int opcion;

        do {
            System.out.println(":::::: SERVICIO DE ALQUILER DE PELÍCULAS ::::::");
            System.out.println("");
            System.out.println("Menú de opciones:");
            System.out.println("");
            System.out.println("1- Cargar película");
            System.out.println("2- Buscar película por título");
            System.out.println("3- Buscar película por género");
            System.out.println("4- Listar películas disponibles para alquilar");
            System.out.println("5- Cargar alquiler");
            System.out.println("6- Listar películas alquiladas");
            System.out.println("7- Buscar alquiler por fecha");
            System.out.println("8- Salir del sistema");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ps.cargarPelicula();
                    as.listaPeliculas(ps.listarPeliculas());
                    break;
                case 2:
                    if (ps.noHayPeliculas()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        ps.buscarPeliculasPorTitulo();
                    }
                    break;
                case 3:
                    if (ps.noHayPeliculas()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        ps.buscarPeliculasPorGenero();
                    }
                    break;
                case 4:
                    if (ps.noHayPeliculas()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        as.peliculasDisponiblesParaAlquilar();
                    }
                    break;
                case 5:
                    as.crearAlquiler();
                    break;
                case 6:
                    if (as.noHayAlquileres()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        as.mostrarPeliculasAlquiladas();
                    }
                    break;
                case 7:
                    if (as.noHayAlquileres()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        as.buscarAlquileresPorFecha();
                    }
                    break;
                case 8:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 8);
    }
}
