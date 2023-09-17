package Entidades;

import Enumeraciones.Departamento;
import Enumeraciones.EstadoCivil;

public class Profesor extends Empleado{
    private Departamento departamento;

    public Profesor() {
    }

    public Profesor(Departamento departamento, int anioIngreso, int numeroDespacho, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(anioIngreso, numeroDespacho, nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
