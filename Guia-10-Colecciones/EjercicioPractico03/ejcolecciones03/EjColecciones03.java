/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones03;

import Servicio.AlumnoService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjColecciones03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService alumnoService = new AlumnoService();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");       
        alumnoService.crearAlumno();
        alumnoService.mostrarAlumnos();
        System.out.println("Ingrese el nombre del/la alumno/a que desea conocer la nota final:");
        String nombre = leer.next();
        if (alumnoService.buscarAlumno(nombre)) {
            alumnoService.mostrarNotas(nombre);
            System.out.println("La nota final de " + nombre + " es: " + alumnoService.notaFinal(nombre));
        } else {
            System.out.println("No se encontró al/la alumno/a.");
        }
    }

}
