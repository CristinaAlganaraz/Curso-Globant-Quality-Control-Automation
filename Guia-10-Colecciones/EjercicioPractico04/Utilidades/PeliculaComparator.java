/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author crist
 */
public class PeliculaComparator {

    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula a, Pelicula b) {
            return a.getTitulo().compareTo(b.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula a, Pelicula b) {
            return a.getDirector().compareTo(b.getDirector());
        }
    };

}
