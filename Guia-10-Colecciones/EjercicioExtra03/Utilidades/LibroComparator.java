/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Libro;
import java.util.Comparator;

/**
 *
 * @author crist
 */
public class LibroComparator {
    public static Comparator<Libro> ordenarTitulosAlfabeticamente = (Libro a, Libro b) -> a.getTitulo().compareTo(b.getTitulo());
}
