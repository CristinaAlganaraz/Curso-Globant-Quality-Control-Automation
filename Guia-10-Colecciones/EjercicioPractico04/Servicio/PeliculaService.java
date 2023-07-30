/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        String titulo, director, opcion = "";
        int duracion;
        do {
            System.out.println("Ingrese los siguientes datos:");
            System.out.println("Título:");
            titulo = leer.next();
            System.out.println("Director:");
            director = leer.next();
            System.out.println("Duracion:");
            duracion = leer.nextInt();
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
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

    public List<Pelicula> listarPeliculasPorTitulo() {
        Collections.sort(listarPeliculas(), new OrdenarPorTitulo());
        return listarPeliculas();
    }

    public List<Pelicula> listarPeliculasPorDirector() {
        Collections.sort(listarPeliculas(), new OrdenarPorDirector());
        return listarPeliculas();
    }

    public List<Pelicula> listarPeliculasPorDuracionAscendente() {
        listarPeliculas().sort(Comparator.comparingInt(Pelicula::getDuracion));
        return listarPeliculas();
    }

    public List<Pelicula> listarPeliculasPorDuracionDescendente() {
        listarPeliculas().sort(Comparator.comparingInt(Pelicula::getDuracion).reversed());
        return listarPeliculas();
    }

    public void mostrarPeliculas() {
        for (int i = 0; i < listarPeliculas().size(); i++) {
            System.out.println("- " + listarPeliculas().get(i).toString());
        }
    }

    public void mostrarPeliculasDuracionMayorDeUnaHora() {
        Collections.sort(listarPeliculas(), new OrdenarPorTitulo());
        for (int i = 0; i < listarPeliculas().size(); i++) {
            if (listarPeliculas().get(i).getDuracion() > 1) {
                System.out.println("- " + listarPeliculas().get(i).toString());
            }
        }
    }

    class OrdenarPorTitulo implements Comparator<Pelicula> {

        @Override
        public int compare(Pelicula a, Pelicula b) {
            return a.getTitulo().toUpperCase().compareTo(b.getTitulo().toUpperCase());
        }
    }

    class OrdenarPorDirector implements Comparator<Pelicula> {

        @Override
        public int compare(Pelicula a, Pelicula b) {
            return a.getDirector().toUpperCase().compareTo(b.getDirector().toUpperCase());
        }
    }

}
