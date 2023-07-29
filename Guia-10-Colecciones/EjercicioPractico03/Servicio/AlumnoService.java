/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class AlumnoService {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList();

    public void crearAlumno() {
        String nombre, opcion = "";
        int nota;
        do {
            System.out.println("Ingrese nombre del/la alumno/a:");
            nombre = leer.next();
            List<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                do {
                    System.out.println("Ingrese la nota " + (i + 1) + " (del 1 al 10) del/la alumno/a " + nombre + ": ");
                    nota = leer.nextInt();
                    if (nota < 1 || nota > 10) {
                        System.out.println("Nota inválida. Recuerde que la nota debe ser entre 1 y 10.");
                    } else {
                        notas.add(nota);
                    }
                } while (nota < 2 || nota > 10);
            }
            Alumno alumno = new Alumno(nombre, notas);
            agregarAlumno(alumno);
            do {
                System.out.println("¿Desea agregar otro/a alumno/a? (S/N)");
                opcion = leer.next();
                if (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
                    System.out.println("Opción incorrecta.");
                }
            } while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N"));
        } while (!opcion.equalsIgnoreCase("N"));
    }
    
    public void mostrarAlumnos() {
        System.out.println("Alumnos:");
        for (int i = 0; i < listarAlumnos().size(); i++) {
            System.out.println((i+1) + "- " + listarAlumnos().get(i).getNombre().toUpperCase());            
        }
    }
    
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
    
    public List<Alumno> listarAlumnos() {
        Collections.sort(alumnos, new OrdenarPorNombre());
        return alumnos;
    }
    
    public void mostrarNotas(String nombre) {
        System.out.println("Notas:");
        for (int i = 0; i < listarAlumnos().size(); i++) {
            if (listarAlumnos().get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(listarAlumnos().get(i).getNotas());
                break;
            }            
        }        
    }
    
    public boolean buscarAlumno(String nombre) {
        for (int i = 0; i < listarAlumnos().size(); i++) {
            if (listarAlumnos().get(i).getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public int notaFinal(String nombre) {
        
        int suma = 0;
        
        for (int i = 0; i < listarAlumnos().size(); i++) {
            if (listarAlumnos().get(i).getNombre().equalsIgnoreCase(nombre)) {
                suma = listarAlumnos().get(i).getNotas().get(0) + listarAlumnos().get(i).getNotas().get(1) + listarAlumnos().get(i).getNotas().get(2);
                break;
            }            
        }
        return suma / 3;
    }
    
    class OrdenarPorNombre implements Comparator<Alumno> {
    @Override
    public int compare(Alumno a, Alumno b) {
        return a.getNombre().toUpperCase().compareTo(b.getNombre().toUpperCase());
    }
}
    
}

