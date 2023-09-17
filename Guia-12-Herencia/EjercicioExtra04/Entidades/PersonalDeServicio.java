package Entidades;

import Enumeraciones.EstadoCivil;
import Enumeraciones.Seccion;

public class PersonalDeServicio extends Empleado{
    private Seccion seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(Seccion seccion, int anioIngreso, int numeroDespacho, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(anioIngreso, numeroDespacho, nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
}
