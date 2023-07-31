/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PeliculaService {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Pelicula> peliculas = new ArrayList();

    public void cargarPelicula() {
        String titulo, genero, opcion = "";
        int anio, duracion;
        do {
            System.out.println("Ingrese los siguientes datos:");
            System.out.println("Título:");
            titulo = leer.next().toUpperCase();
            System.out.println("Género:");
            genero = leer.next();
            System.out.println("Año:");
            anio = leer.nextInt();
            System.out.println("Duracion (minutos):");
            duracion = leer.nextInt();
            Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion);
            agregarPelicula(pelicula);
            do {
                System.out.println("¿Desea cargar otra película? (S/N)");
                opcion = leer.next();
                if (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
                    System.out.println("Opción incorrecta.");
                }
            } while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N"));
        } while (!opcion.equalsIgnoreCase("N"));
    }

    public boolean noHayPeliculas() {
        return listarPeliculas().isEmpty();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public List<Pelicula> listarPeliculas() {
        return peliculas;
    }

    public void buscarPeliculasPorTitulo() {
        String buscarTitulo;
        int aux = 0;
        System.out.println("Ingrese el título de la película:");
        buscarTitulo = leer.next();

        for (int i = 0; i < listarPeliculas().size(); i++) {
            if (listarPeliculas().get(i).getTitulo().equalsIgnoreCase(buscarTitulo)) {
                System.out.println("Se ha encontrado la película:");
                mostrarDatosPelicula(listarPeliculas().get(i));
                aux++;
                break;
            }
        }
        if (aux == 0) {
            System.out.println("No se ha encontrado la película.");
        }
    }

    public void mostrarDatosPelicula(Pelicula pelicula) {
        System.out.println("-----------------------------");
        System.out.println(pelicula.toString().toUpperCase());
        System.out.println("-----------------------------");
    }
    
    public void buscarPeliculasPorGenero() {
        String buscarGenero = "";
        int contador = 0;

        System.out.println("Ingrese el género que desea buscar:");
        buscarGenero = leer.next();
        for (int i = 0; i < listarPeliculas().size(); i++) {
            if (listarPeliculas().get(i).getGenero().equalsIgnoreCase(buscarGenero)) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("Se ha/han encontrado " + contador + " película/s del género " + buscarGenero.toLowerCase() + ":");
            for (int i = 0; i < listarPeliculas().size(); i++) {
                if (listarPeliculas().get(i).getGenero().equalsIgnoreCase(buscarGenero)) {
                    System.out.println("- " + listarPeliculas().get(i).getTitulo().toUpperCase());
                }
            }
        } else {
            System.out.println("No se ha/han encontrado película/s del género " + buscarGenero.toLowerCase() + ".");
        }
    }

}
