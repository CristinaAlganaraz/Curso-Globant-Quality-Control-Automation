/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import Utilidades.LibroComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Libreria {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private final HashSet<Libro> libros = new HashSet();

    public void agregarLibro() {
        System.out.println("Ingrese la siguiente información del libro:");
        System.out.println("Título:");
        String titulo = leer.next();
        System.out.println("Autor:");
        String autor = leer.next();
        System.out.println("Cantidad de ejemplares:");
        int ejemplares = leer.nextInt();
        libros.add(new Libro(titulo, autor, ejemplares));
        System.out.println("Se ha agregado el libro a la librería.");
    }
    
    public boolean existeLibro(String titulo) {
        boolean existe = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                existe = true;
            }
        }
        return existe;
    }

    public void mostrarLibros() {
        ArrayList<Libro> arraylist = new ArrayList();
        arraylist.addAll(libros);
        Collections.sort(arraylist, LibroComparator.ordenarTitulosAlfabeticamente);
        if (arraylist.isEmpty()) {
            System.out.println("No hay libros para mostrar.");
        } else {
            arraylist.forEach((libro) -> {
                System.out.println("-" + libro.toString().toUpperCase());
            });
        }
    }

    public void prestarLibro() {
        boolean hayEjemplares = false;
        if (libros.isEmpty()) {
            System.out.println("No hay libros para prestar.");
        } else {
            System.out.println("Ingrese el título del libro a prestar:");
            String titulo = leer.next();
            if (existeLibro(titulo)) {
                for (Libro libro : libros) {
                    if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                        if (libro.getNumeroEjemplaresPrestados() < libro.getNumeroEjemplares()) {
                            libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados() + 1);
                            hayEjemplares = true;
                        }
                    }
                }
                if (!hayEjemplares) {
                    System.out.println("No hay más ejemplares para prestar.");
                } else {
                    System.out.println("Se ha prestado el libro con éxito.");
                }
            } else {
                System.out.println("No se encontró el título ingresado.");
            }
        }
    }

    public void devolverLibro() {
        boolean hayEjemplares = false;
        if (libros.isEmpty()) {
            System.out.println("No hay libros para devolver.");
        } else {
            System.out.println("Ingrese el título del libro a devolver:");
            String titulo = leer.next();
            if (existeLibro(titulo)) {
                for (Libro libro : libros) {
                    if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                        if (libro.getNumeroEjemplaresPrestados() > 0) {
                            libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados() - 1);
                            hayEjemplares = true;
                        }
                    }
                }
                if (!hayEjemplares) {
                    System.out.println("No hay más ejemplares para devolver.");
                } else {
                    System.out.println("Se ha devuelto el libro con éxito.");
                }
            } else {
                System.out.println("No se encontró el título ingresado.");
            }
        }
    }
}
