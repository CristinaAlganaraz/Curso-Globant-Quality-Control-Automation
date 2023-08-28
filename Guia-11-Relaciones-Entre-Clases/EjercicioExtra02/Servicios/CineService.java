/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author crist
 */
public class CineService {

    private final String[][] asientos = new String[8][6];
    private final Random random = new Random();

    public Sala crearSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                asientos[i][j] = String.valueOf(asientos.length - i) + (char) (j + 'A') + " ";
            }
        }
        Sala sala = new Sala(asientos);
        return sala;
    }

    public void mostrarSala(Cine cine) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[" + cine.getSala().getAsiento(i, j) + "]");
            }
            System.out.println("");
        }
    }

    public void designarAsiento(Cine cine, ArrayList<Espectador> espectadores) {
        int fila, columna, cont = 0;
        boolean hayLugar = false;
        String ocupado, disponible;
        for (int i = 0; i < espectadores.size(); i++) {
            System.out.println(espectadores.get(i).toString());
            if (espectadores.get(i).getEdad() >= cine.getPelicula().getEdadMinima()) {
                if (espectadores.get(i).getDineroDisponible() >= cine.getPrecioEntrada()) {
                    do {
                        fila = random.nextInt(8);
                        columna = random.nextInt(6);
                        String asiento = cine.getSala().getAsiento(fila, columna);
                        disponible = String.valueOf(asiento.charAt(asiento.length() - 1));
                        asiento = asiento.substring(0, asiento.length() - 1);
                        if (disponible.equalsIgnoreCase("X")) {
                            System.out.println("El asiento " + asiento + " está ocupado.");
                        } else {
                            System.out.println("Asiento designado: " + asiento);
                            ocupado = asiento + "X";
                            cine.getSala().modificarValor(fila, columna, ocupado);
                            cont++;
                            hayLugar = true;
                            System.out.println("");
                            mostrarSala(cine);
                            break;
                        }
                    } while (!hayLugar);
                    hayLugar = false;
                    if (cont == 48) {
                        System.out.println("");
                        System.out.println("Sin disponibilidad de asientos.");
                        break;
                    } else {
                        System.out.println("Asientos disponibles: " + (48 - cont));
                    }
                } else {
                    System.out.println("Dinero insuficiente.");
                }
            } else {
                System.out.println("Edad insuficiente.");
            }
            System.out.println("-----------------------------------------------------------------------------");
        }
    }
}
