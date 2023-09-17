package Entidades;

import Enumeraciones.EstadoCivil;

public class Empleado extends Persona{
    private int anioIngreso;
    private int numeroDespacho;

    public Empleado() {
    }

    public Empleado(int anioIngreso, int numeroDespacho, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.numeroDespacho = numeroDespacho;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
}
