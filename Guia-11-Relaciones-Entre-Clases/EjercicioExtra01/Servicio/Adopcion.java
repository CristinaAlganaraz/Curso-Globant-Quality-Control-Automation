/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Adopcion {
ArrayList<Perro> perros = new ArrayList();
    ArrayList<Persona> personas = new ArrayList();
    
    public void adoptarPerro(ArrayList<Perro> perros, ArrayList<Persona> personas) {
        Scanner leer = new Scanner(System.in);
        String perro, opcion;
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).getNombre() + ", ¿cuál perrito deseas adoptar? Elegí un nombre del listado:");
            mostrarPerros(perros);
            do {
                perro = leer.next();
                if (existePerro(perros, perro)) {
                    if (estaAdoptado(perros, perro)) {
                        System.out.println("El perrito ya fue dado en adopción. Elija otro nombre:");
                    } else {
                        entregarMascota(perros, perro, personas.get(i));
                        System.out.println("Felicitaciones, ¡adoptaste un perrito!");
                    }
                } else {
                    System.out.println("Lo sentimos, no encontramos el nombre indicado. Ingrese nuevamente el nombre:");
                }
            } while (personas.get(i).getPerro() == null || !existePerro(perros, perro));
            System.out.println("");
        }
    }

    public void mostrarPerros(ArrayList<Perro> perros) {
        for (int i = 0; i < perros.size(); i++) {
            System.out.println("-" + perros.get(i).getNombre());
        }
    }

    public boolean estaAdoptado(ArrayList<Perro> perros, String nombre) {
        boolean flag = false;
        for (int i = 0; i < perros.size(); i++) {
            if (perros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                if (perros.get(i).isAdoptado() == true) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public boolean existePerro(ArrayList<Perro> perros, String nombre) {
        boolean flag = false;
        for (int i = 0; i < perros.size(); i++) {
            if (perros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void entregarMascota(ArrayList<Perro> perros, String nombre, Persona persona) {
        for (int i = 0; i < perros.size(); i++) {
            if (perros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                perros.get(i).setAdoptado(true);
                persona.setPerro(perros.get(i));
            }
        }
    }
}
