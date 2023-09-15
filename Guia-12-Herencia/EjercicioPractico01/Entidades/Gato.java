package Entidades;

import Interfaces.AccionGato;

public class Gato extends Animal implements AccionGato {

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        System.out.println("Soy un gato y me alimento de " + alimento + ".");
    }

    @Override
    public void ronronear() {
        System.out.println("Prrrrr...");
    }
}
