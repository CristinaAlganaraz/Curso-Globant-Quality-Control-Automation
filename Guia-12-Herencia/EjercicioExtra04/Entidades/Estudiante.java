package Entidades;

import Enumeraciones.Curso;
import Enumeraciones.EstadoCivil;
import java.util.ArrayList;

public class Estudiante extends Persona{
    private ArrayList<Curso> curso;

    public Estudiante() {
    }

    public Estudiante(ArrayList<Curso> curso, String nombre, String apellido, int id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.curso = curso;
    }

    public ArrayList<Curso> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<Curso> curso) {
        this.curso = curso;
    }
}
