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
public class Persona {

    private String nombre;
    private long edad;
    private Date fechaDeNacimiento;

    public Persona() {
    }

    public Persona(long edad) {
        this.edad = edad;
    }

    public Persona(String nombre, long edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona(String nombre, long edad, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

}
