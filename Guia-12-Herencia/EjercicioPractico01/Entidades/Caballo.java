package Entidades;

import Interfaces.AccionCaballo;

public class Caballo extends Animal implements AccionCaballo {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        System.out.println("Soy un caballo y me alimento de " + alimento + ".");
    }

    @Override
    public void relinchar() {
        System.out.println("Hiiiii, hiiiii...");
    }
}
