package Entidades;

import Enumeraciones.EstadoCivil;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int id;
    protected EstadoCivil estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "ID: " + id + "\n" +
               "Estado civil: " + estadoCivil;
    }

}
