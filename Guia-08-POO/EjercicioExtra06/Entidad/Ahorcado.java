/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author crist
 */
public class Ahorcado {
    
    private String[] palabraABuscar;
    private String[] mostrarAvance;
    private int cantidadLetrasEncontradas;
    private int cantidadJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraABuscar, String[] mostrarAvance, int cantidadLetrasEncontradas, int cantidadJugadasMaximas) {
        this.palabraABuscar = palabraABuscar;
        this.mostrarAvance = mostrarAvance;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public String[] getMostrarAvance() {
        return mostrarAvance;
    }

    public void setMostrarAvance(String[] mostrarAvance) {
        this.mostrarAvance = mostrarAvance;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }  
   
}