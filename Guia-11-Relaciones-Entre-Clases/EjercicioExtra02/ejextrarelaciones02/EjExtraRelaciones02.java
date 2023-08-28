/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrarelaciones02;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.Sala;
import Servicios.CineService;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class EjExtraRelaciones02 {

    public static int rango(int min, int max) {
        int rango = (max - min) + 1;
        return (int) (Math.random() * rango) + min;
    }

    public static void main(String[] args) {
        ArrayList<Espectador> espectadores = new ArrayList();

        for (int i = 0; i < 200; i++) {
            espectadores.add(new Espectador("Espectador " + (i + 1), rango(11, 45), (double) rango(700, 900)));
        }

        Pelicula pelicula = new Pelicula("Tango feroz", 180, 18, "Marcelo Piñeyro");
        CineService cs = new CineService();
        Sala sala = cs.crearSala();
        Cine cine = new Cine(pelicula, sala, 800);
        System.out.println(":::::::::::::: CINE ::::::::::::::");
        System.out.println(cine.toString());
        System.out.println("");
        cs.designarAsiento(cine, espectadores);
        System.out.println("");
    }
}
