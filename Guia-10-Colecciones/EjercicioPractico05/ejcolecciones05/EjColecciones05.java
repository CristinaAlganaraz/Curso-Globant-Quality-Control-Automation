/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones05;

import Servicio.PaisService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjColecciones05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        PaisService ps = new PaisService();
        ps.leerGuardarPais();
        ps.mostrarPaises();
        System.out.println("Ingrese el país que desea eliminar:");
        String pais = leer.next();
        if (ps.eliminarPais(pais)) {
            System.out.println("Se ha eliminado el país.");
            ps.mostrarPaises();
        } else {
            System.out.println("No se encontró el país.");
        }
    }

}
