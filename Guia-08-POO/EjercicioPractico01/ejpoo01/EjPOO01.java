/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo01;

import Entidad.Libro;
import Service.LibroService;

/**
 *
 * @author crist
 */
public class EjPOO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LibroService libroService = new LibroService();

        Libro libro = libroService.crearLibro();

        System.out.println("--------------------------------------------");

        libroService.mostrarDatos(libro);
        
    }
    
}
