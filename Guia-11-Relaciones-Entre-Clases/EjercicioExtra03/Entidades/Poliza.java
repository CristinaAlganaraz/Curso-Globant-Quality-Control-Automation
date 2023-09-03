/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.FormaPago;
import Enumeraciones.TipoCobertura;
import java.util.Date;

/**
 *
 * @author crist
 */
public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private long numeroPoliza;
    private Date fechaInicio;
    private Date fechaFin;
    private Cuota cuotas;
    private TipoCobertura tipoCobertura;
    private FormaPago formaDePago;
    private double montoTotalAsegurado;
    private boolean incluyeGranizo;
    private double montoMaximoGranizo;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, long numeroPoliza, Date fechaInicio, Date fechaFin, Cuota cuotas, TipoCobertura tipoCobertura, FormaPago formaDePago, double montoTotalAsegurado, boolean incluyeGranizo, double montoMaximoGranizo) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.tipoCobertura = tipoCobertura;
        this.formaDePago = formaDePago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(long numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
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

    public Cuota getCuotas() {
        return cuotas;
    }

    public void setCuotas(Cuota cuotas) {
        this.cuotas = cuotas;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public FormaPago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaPago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cuotas=" + cuotas + ", tipoCobertura=" + tipoCobertura + ", formaDePago=" + formaDePago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", incluyeGranizo=" + incluyeGranizo + ", montoMaximoGranizo=" + montoMaximoGranizo + '}';
    }
}
