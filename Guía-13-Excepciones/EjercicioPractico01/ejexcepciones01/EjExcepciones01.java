package ejexcepciones01;

import Entidades.Persona;
import Excepciones.PersonaException;
import Servicios.PersonaService;

public class EjExcepciones01 {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p1 = null;
        Persona p2 = new Persona(-1);
        Persona p3 = new Persona(12);
        Persona p4 = new Persona(54);

        try {
            System.out.println("Persona 1:");
            ps.esMayorDeEdad(p1);
        } catch (PersonaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------");
        try {
            System.out.println("Persona 2:");
            ps.esMayorDeEdad(p2);
        } catch (PersonaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------");
        try {
            System.out.println("Persona 3:");
            ps.esMayorDeEdad(p3);
        } catch (PersonaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------");
        try {
            System.out.println("Persona 4:");
            ps.esMayorDeEdad(p4);
        } catch (PersonaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
