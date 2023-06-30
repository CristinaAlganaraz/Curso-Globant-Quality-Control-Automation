/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo12;

import Entidad.Persona;
import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjPOO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        PersonaService personaService = new PersonaService();

        personaService.crearPersona();
        personaService.calcularEdad();
        System.out.println("");
        personaService.mostrarPersona();
        System.out.println("");
        Persona persona2 = new Persona("José", 15);
        System.out.println("Persona 2: " + persona2.getNombre() + ", " + persona2.getEdad() + " años.");
        System.out.println("");
        if (personaService.menorQue(persona2.getEdad()) == true) {
            System.out.println(persona2.getNombre() + " es menor que la persona ingresada anteriormente.");
        } else {
            System.out.println(persona2.getNombre() + " es mayor que la persona ingresada anteriormente.");
        }
    }
}
