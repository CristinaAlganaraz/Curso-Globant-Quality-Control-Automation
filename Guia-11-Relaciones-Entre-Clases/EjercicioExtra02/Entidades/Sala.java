/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author crist
 */
public class Sala {
    private String[][] asientos = new String[8][6];
    private String[][] asiento;

    public Sala() {
    }

    public Sala(String[][] asientos) {
        this.asientos = asientos;
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public String getAsiento(int fila, int columna) {
        return asientos[fila][columna];
    }

    public void modificarValor(int fila, int columna, String ocupado) {
        asientos[fila][columna] = ocupado;
    }

    @Override
    public String toString() {
        return "Sala{" + "Asientos: " + Arrays.toString(asientos) + '}';
    }
}
