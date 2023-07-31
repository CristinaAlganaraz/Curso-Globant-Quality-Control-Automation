/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author crist
 */
public class Alquiler {
    
    private String titulo;
    private Date fechaInicio;
    private Date fechaFin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(String titulo, Date fechaInicio, Date fechaFin, double precio) {
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Detalle del alquiler:" + '\n'
                + "Película alquilada: " + titulo + '\n'
                + "Fecha inicio: " + fechaInicio + '\n'
                + "Fecha final: " + fechaFin + '\n'
                + "Precio: $" + precio + '\n';
    }

}
