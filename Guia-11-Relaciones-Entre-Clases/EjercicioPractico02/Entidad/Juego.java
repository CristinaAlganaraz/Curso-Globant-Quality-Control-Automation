/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        setJugadores(jugadores);
        setRevolver(revolver);
    }

    public void ronda() {
        boolean mojado = false;
        do {
            for (Jugador jugador : jugadores) {
                System.out.println(revolver);
                System.out.print("El " + jugador.toString() + " procede a disparar y... ");
                if (jugador.disparo(revolver)) {
                    System.out.print("¡Se ha mojado! ");
                    System.out.println("Ha finalizado el juego.");
                    mojado = true;
                    break;
                } else {
                    System.out.println("¡Safó! Le toca al siguiente jugador.");
                    System.out.println("");
                }
            }
        } while (!mojado);
    }
}
