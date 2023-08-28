/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrarelaciones01;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.Adopcion;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class EjExtraRelaciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Perro> perros = new ArrayList();
        perros.add(new Perro("Diogenes", "Pitbull", 3, "Mediano", false));
        perros.add(new Perro("Ulises", "Doberman", 7, "Grande", false));
        perros.add(new Perro("Mirko", "Caniche", 2, "Chico", false));
        perros.add(new Perro("Luna", "Cocker Spaniel", 4, "Mediano", false));

        ArrayList<Persona> personas = new ArrayList();
        personas.add(new Persona("Cristina", "Algañaraz", 38, 33445566, null));
        personas.add(new Persona("Leonor", "Rosado", 17, 56789904, null));
        personas.add(new Persona("Patricio", "Pérez", 42, 16788923, null));
        personas.add(new Persona("Miguel", "Barrientos", 57, 11277345, null));

        Adopcion adopcionService = new Adopcion();

        adopcionService.adoptarPerro(perros, personas);

        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).toString());
        }
    }
}
