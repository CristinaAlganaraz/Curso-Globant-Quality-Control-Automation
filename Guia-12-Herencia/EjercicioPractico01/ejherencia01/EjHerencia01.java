package ejherencia01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class EjHerencia01 {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Homero", "carne", 7, "Rottweiler");
        perro1.alimentar();
        System.out.println("----------------------------");
        Animal perro2 = new Perro("Sócrates", "croquetas", 3, "Schanauzer");
        perro2.alimentar();
        System.out.println("----------------------------");
        Animal gato1 = new Gato("Blanquita", "whiskas", 5, "Siamés");
        gato1.alimentar();
        System.out.println("----------------------------");
        Animal caballo1 = new Caballo("Spirit", "pasto", 15, "Árabe");
        caballo1.alimentar();
        System.out.println("----------------------------");
        Perro perrito = new Perro();
        perrito.ladrar();
        perrito.setAlimento("albóndigas");
        perrito.alimentar();
        Gato gatito = new Gato();
        gatito.ronronear();
        gatito.setAlimento("atún");
        gatito.alimentar();
        Caballo caballito = new Caballo();
        caballito.relinchar();
        caballito.setAlimento("alfalfa");
        caballito.alimentar();
    }
}
