/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrelaciones02;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjRelaciones02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Revolver revolver = new Revolver();
        Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("::::::: JUEGO RULETA RUSA DE AGUA :::::::");
        System.out.println("");
        System.out.println("Ingrese la cantidad de jugadores (entre 1 a 6, si el número no se encuentra dentro de ese rango por defecto será 6):");
        int cantidad = leer.nextInt();

        if(cantidad < 1 || cantidad > 6) {
            cantidad = 6;            
        }
        
        for (int i = 0; i < cantidad; i++) {
            Jugador jugador= new Jugador();
            jugador.setId(i + 1);
            jugador.setNombre(jugador.getId());
            jugador.setMojado(true);
            jugadores.add(jugador);
        }     
        System.out.println("");
        revolver.llenarRevolver();
        System.out.println("");
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();      
    }    
}
