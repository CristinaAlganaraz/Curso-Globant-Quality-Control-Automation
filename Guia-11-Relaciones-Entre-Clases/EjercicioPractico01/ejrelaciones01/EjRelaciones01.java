/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrelaciones01;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author crist
 */
public class EjRelaciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Perro> perros = new ArrayList();
        perros.add(new Perro("Diógenes", "Pitbull", 3, "Mediano"));
        perros.add(new Perro("Ulises", "Doberman", 7, "Grande"));
        perros.add(new Perro("Mirko", "Caniche", 2, "Chico"));
        perros.add(new Perro("Luna", "Cocker Spaniel", 4, "Mediano"));
        Collections.shuffle(perros);
        
        ArrayList<Persona> personas = new ArrayList();
        personas.add(new Persona("Cristina", "Algañaraz", 38, 33445566, null));
        personas.add(new Persona("Leonor", "Rosado", 17, 56789904, null));
        personas.add(new Persona("Patricio", "Pérez", 42, 16788923, null));
        personas.add(new Persona("Miguel", "Barrientos", 57, 11277345, null));
        Collections.shuffle(personas);
        
        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).setPerro(perros.get(i));
            System.out.println(personas.get(i).toString());
        }        
    }
}
