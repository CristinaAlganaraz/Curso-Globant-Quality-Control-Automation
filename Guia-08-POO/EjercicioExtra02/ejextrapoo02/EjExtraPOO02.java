/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrapoo02;

import Entidad.Puntos;
import Service.PuntosService;

/**
 *
 * @author crist
 */
public class EjExtraPOO02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Puntos puntos = new Puntos();
        PuntosService puntosService = new PuntosService();
        
        puntos = puntosService.crearPuntos();
        System.out.println("La distancia que existe entre los dos puntos es:");
        System.out.println( puntosService.calcularDevolverDistancia(puntos));
    }
    
}
