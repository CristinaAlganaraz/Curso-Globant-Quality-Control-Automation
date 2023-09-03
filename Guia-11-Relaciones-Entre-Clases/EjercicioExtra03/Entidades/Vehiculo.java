/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.ColorVehiculo;
import Enumeraciones.TipoVehiculo;

/**
 *
 * @author crist
 */
public class Vehiculo {    
    private String marca;
    private String modelo;
    private int anio;
    private long numeroMotor;
    private long chasis;
    private ColorVehiculo color;
    private TipoVehiculo tipo;
    private Poliza poliza;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, long numeroMotor, long chasis, ColorVehiculo color, TipoVehiculo tipo, Poliza poliza) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.poliza = poliza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public long getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(long numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public long getChasis() {
        return chasis;
    }

    public void setChasis(long chasis) {
        this.chasis = chasis;
    }

    public ColorVehiculo getColor() {
        return color;
    }

    public void setColor(ColorVehiculo color) {
        this.color = color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + ", poliza=" + poliza + '}';
    }      
}
