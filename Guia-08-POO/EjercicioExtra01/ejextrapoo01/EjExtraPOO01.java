/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrapoo01;

import Entidad.Cancion;

/**
 *
 * @author crist
 */
public class EjExtraPOO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Se instancia el objeto y se muestra en pantalla los atributos con cadenas vacías
        Cancion cancion1 = new Cancion();
        System.out.println("CANCIÓN 1:");
        System.out.println("Título: " + cancion1.getTitulo());
        System.out.println("Autor: " + cancion1.getAutor());
        
        //A través del método setter se modifica los atributos título y autor de la cancion1 y se muestra por pantalla con el método getter
        cancion1.setTitulo("Noctiluca");
        cancion1.setAutor("Jorge Drexler");

        System.out.println("Título: " + cancion1.getTitulo());
        System.out.println("Autor: " + cancion1.getAutor());
        System.out.println("");
        
        //Se intancia el objeto por parámetros y se muestra por pantalla los atributos con el método getter
        Cancion cancion2 = new Cancion("Dos galaxias", "Santiago Motorizado");
        System.out.println("CANCIÓN 2:");
        System.out.println("Título: " + cancion2.getTitulo());
        System.out.println("Autor: " + cancion2.getAutor());
    }
    
}
