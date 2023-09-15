package Entidades;

import Interfaces.AccionPerro;

public class Perro extends Animal implements AccionPerro {

    public Perro() {
    }

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        System.out.println("Soy un perro y me alimento de " + alimento + ".");
    }

    @Override
    public void ladrar() {
        System.out.println("Guau, guau...");
    }
}
