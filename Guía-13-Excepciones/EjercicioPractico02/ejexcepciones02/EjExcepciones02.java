package ejexcepciones02;

import Entidades.Madre;
import Excepciones.MadreException;
import Servicios.MadreService;

public class EjExcepciones02 {

    public static void main(String[] args) {
        Madre madre = new Madre();
        String[] hijos = new String[2];
        hijos[0] = "Carlos";
        hijos[1] = "Pedro";

        madre.setHijos(hijos);

        MadreService ms = new MadreService();

        try {
            System.out.println("Ejemplo 1:");
            ms.buscarHijo(madre, 8);
        } catch (MadreException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------");
        try {
            System.out.println("Ejemplo 2:");
            ms.buscarHijo(madre, -1);
        } catch (MadreException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------");
        try {
            System.out.println("Ejemplo 3:");
            ms.buscarHijo(madre, 1);
        } catch (MadreException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
