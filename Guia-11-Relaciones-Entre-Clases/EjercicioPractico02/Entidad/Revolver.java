/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author crist
 */
public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "Posición Actual: " + posicionActual + ", Posición Agua: " + posicionAgua + '}';
    }

    public void llenarRevolver() {
        Random random = new Random();
        setPosicionActual(random.nextInt(6) + 1);
        setPosicionAgua(random.nextInt(6) + 1);
        System.out.println("Se ha cargado la pistola.");
    }

    public boolean mojar() {
        return getPosicionAgua() == getPosicionActual();
    }

    public void siguenteChorro() {
        setPosicionActual((getPosicionActual() % 6) + 1);
    }
}
