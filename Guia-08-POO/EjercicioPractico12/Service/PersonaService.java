/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PersonaService {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private Persona persona = new Persona();

    public void crearPersona() {

        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(leer.next());

        System.out.println("Ingrese la fecha de nacimiento:");
        System.out.print("Día (DD): ");
        int dia = leer.nextInt();
        System.out.print("Mes (MM): ");
        int mes = leer.nextInt();
        System.out.print("Año (AAAA): ");
        int anio = leer.nextInt();
  
        Date fechaDeNacimiento = new Date(anio - 1900, mes - 1, dia);

        persona.setFechaDeNacimiento(fechaDeNacimiento);
    }

    public void calcularEdad() {

        Date fechaActual = new Date();
       
        Date fechaActualAnioFechaIngresada = new Date(persona.getFechaDeNacimiento().getYear(),fechaActual.getMonth(),fechaActual.getDate());
        
        int edad = fechaActual.getYear() - persona.getFechaDeNacimiento().getYear();
          
        if (fechaActualAnioFechaIngresada.before(persona.getFechaDeNacimiento()) == true) {
            edad--;
            persona.setEdad(edad);            
        }
        persona.setEdad(edad);
    }


    public boolean menorQue(long edad) {
        return edad < persona.getEdad();
    }

    public void mostrarPersona() {

        Date fechaActual = new Date();

        if (persona.getFechaDeNacimiento().after(fechaActual)) {
            System.out.println("La persona aún no ha nacido pero se llamará " + persona.getNombre() + ".");
        } else {
            System.out.println("El nombre de la persona ingresada es " + persona.getNombre() + ", nació el " + persona.getFechaDeNacimiento() + " y tiene " + persona.getEdad() + " año/s.");
        }
    }
}
