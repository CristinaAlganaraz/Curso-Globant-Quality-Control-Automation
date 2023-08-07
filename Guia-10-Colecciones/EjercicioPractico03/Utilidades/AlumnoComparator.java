/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author crist
 */
public class AlumnoComparator {
    public static Comparator<Alumno> ordenarAlumnosAlfabeticamente = (Alumno a, Alumno b) -> a.getNombre().compareTo(b.getNombre());  
}
