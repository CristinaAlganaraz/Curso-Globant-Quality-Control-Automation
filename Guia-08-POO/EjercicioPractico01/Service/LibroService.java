/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class LibroService {
    
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

     public Libro crearLibro() {        
        
        System.out.println("Ingrese ISBN:");
        String isbn = leer.next();
        
        System.out.println("Ingrese título:");
        String titulo= leer.next();
        
        System.out.println("Ingrese autor:");
        String autor = leer.next();
        
        System.out.println("Ingrese número de páginas:");
        int nroPags = leer.nextInt();
        
        return new Libro(isbn,titulo,autor,nroPags);
    }
    
    public void mostrarDatos(Libro libro) {

        System.out.println("El ISBN del libro es: "+libro.getIsbn());
        System.out.println("El título del libro es: "+libro.getTitulo());
        System.out.println("El autor del libro es: "+libro.getAutor());
        System.out.println("El número de páginas es: "+libro.getNroPags());
        
    }
    
}
