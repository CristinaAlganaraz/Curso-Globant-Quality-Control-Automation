/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import Utilidades.PaisComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PaisService {    
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private HashSet<Pais> paises = new HashSet();

    public void leerGuardarPais() {
        String nombre, salir = "";
        do {
            System.out.println("Ingrese un país:");
            nombre = leer.next().toUpperCase();
            Pais pais = new Pais(nombre);
            agregarPais(pais);
            do {
                System.out.println("¿Desea ingresar otro país? (S/N)");
                salir = leer.next();
                if (!salir.equalsIgnoreCase("S") && !salir.equalsIgnoreCase("N")) {
                    System.out.println("Opción incorrecta.");
                }
            } while (!salir.equalsIgnoreCase("S") && !salir.equalsIgnoreCase("N"));
        } while (!salir.equalsIgnoreCase("N"));
    }
    
    public void agregarPais(Pais pais) {
        paises.add(pais);
    }
    
    public HashSet<Pais> listarPaises() {
        return paises;
    }
    
    public void mostrarPaises() {
        ArrayList<Pais> arraylist = new ArrayList();
        arraylist.addAll(listarPaises());
        Collections.sort(arraylist, PaisComparator.ordenarAlfabeticamente);
        arraylist.forEach((pais) -> {
            System.out.println("-" + pais.getNombre());
        });
    }
    
    public boolean eliminarPais(String pais) {
        Iterator<Pais> iterator = listarPaises().iterator();
        while(iterator.hasNext()) {
            if(iterator.next().getNombre().equalsIgnoreCase(pais)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

}
