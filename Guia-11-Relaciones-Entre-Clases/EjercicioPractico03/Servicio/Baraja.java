/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Carta;
import Enumeracion.Palo;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author crist
 */
public class Baraja {

    ArrayList<Carta> baraja = new ArrayList<>();
    ArrayList<Carta> monton = new ArrayList<>();

    public ArrayList<Carta> armarBaraja() {
        for (Palo palo : Palo.values()) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    baraja.add(new Carta(numero, palo));
                }
            }
        }
        return baraja;
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void siguienteCarta() {
        if (baraja.isEmpty()) {
        } else {
            System.out.println(baraja.get(0));
            monton.add(baraja.get(0));
            baraja.remove(0);
        }
    }

    public int cartasDisponibles() {
        return baraja.size();
    }

    public void darCartas(int cantidad) {
        if (cantidad > baraja.size()) {
            System.out.println("No hay esa cantidad de cartas disponibles en la baraja.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                Carta carta = baraja.remove(0);
                monton.add(carta);
                System.out.println(carta);
            }
        }
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("Todavía no hay cartas en el montón.");
        } else {
            System.out.println("Cartas en el montón:");
            monton.forEach((carta) -> {
                System.out.println(carta);
            });
        }
    }

    public void mostrarBaraja() {
        if (baraja.isEmpty()) {
            System.out.println("No quedan cartas en la baraja.");
        } else {
            System.out.println("Cartas en la baraja:");
            baraja.forEach((carta) -> {
                System.out.println(carta);
            });
        }
    }

}
