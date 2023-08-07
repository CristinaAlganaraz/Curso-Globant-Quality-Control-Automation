/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CantanteFamoso;
import Utilidades.CantanteFamosoComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CantanteFamosoService {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private HashSet<CantanteFamoso> cantantes = new HashSet();

    public void cargarCantanteFamoso() {
        String nombre, discoMasVendido, salir = "";
        do {
            System.out.println("Ingrese el nombre del/la cantante:");
            nombre = leer.next();
            System.out.println("Ingrese el nombre de su disco más vendido:");
            discoMasVendido = leer.next();
            CantanteFamoso cantante = new CantanteFamoso(nombre, discoMasVendido);
            agregarCantante(cantante);
            do {
                System.out.println("¿Desea ingresar otro/a cantante? (S/N)");
                salir = leer.next();
                if (!salir.equalsIgnoreCase("S") && !salir.equalsIgnoreCase("N")) {
                    System.out.println("Opción incorrecta.");
                }
            } while (!salir.equalsIgnoreCase("S") && !salir.equalsIgnoreCase("N"));
        } while (!salir.equalsIgnoreCase("N"));
    }

    public void agregarCantante(CantanteFamoso cantante) {
        cantantes.add(cantante);
    }

    public HashSet<CantanteFamoso> listarCantantes() {
        return cantantes;
    }

    public void mostrarCantantes() {
        ArrayList<CantanteFamoso> arraylist = new ArrayList();
        arraylist.addAll(cantantes);
        Collections.sort(arraylist, CantanteFamosoComparator.ordenarCantantesAlfabeticamente);
        if (arraylist.isEmpty()) {
            System.out.println("No hay datos para mostrar.");
        } else {
            arraylist.forEach((cantante) -> {
                System.out.println("- " + cantante.toString().toUpperCase());
            });
        }
    }

    public boolean existeCantante(String nombre) {
        boolean existe = false;
        for (CantanteFamoso cantante : cantantes) {
            if (cantante.getNombre().equalsIgnoreCase(nombre)) {
                existe = true;
            }
        }
        return existe;
    }

    public void eliminarCantante() {
        String nombre;
        if (cantantes.isEmpty()) {
            System.out.println("No hay datos para mostrar.");
        } else {
            System.out.println("Ingrese el nombre del/la cantante que desea eliminar:");
            nombre = leer.next();
            if (existeCantante(nombre)) {
                Iterator<CantanteFamoso> iterator = cantantes.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().getNombre().equalsIgnoreCase(nombre)) {
                        iterator.remove();
                    }
                }
                System.out.println("Se ha eliminado el/la cantante.");
            } else {
                System.out.println("No se encontró el/la cantante ingresado.");
            }
        }
    }
}
