package ejherencia02y03;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

public class EjHerencia02y03 {

    public static void main(String[] args) {
        //Ejercicio 02
        System.out.println("Lavadora:");
        System.out.println("");
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        System.out.println(lavadora.toString());
        System.out.println("Precio final: $" + lavadora.precioFinal());
        System.out.println("--------------------------");
        System.out.println("Televisor:");
        System.out.println("");
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        System.out.println(televisor.toString());
        System.out.println("Precio final: $" + televisor.precioFinal());
        //Ejercicio 03
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        double precioTotalL = 0, precioTotalT = 0;

        Lavadora lavadora1 = new Lavadora(35, 2300.5, "BLANCO", 'B', 121.5);
        Lavadora lavadora2 = new Lavadora(23, 1200, "AZUL", 'C', 12.6);
        Televisor televisor1 = new Televisor(55, true, 3000, "AZUL", 'A', 13);
        Televisor televisor2 = new Televisor(33, false, 1000, "ROJO", 'D', 5);

        electrodomesticos.add(televisor2);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(televisor1);

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                System.out.println("LAVADORA");
                System.out.println("Precio anterior:");
                System.out.println(electrodomestico.toString() + ", Carga: " + ((Lavadora) electrodomestico).getCarga());
                double precioFinal = ((Lavadora) electrodomestico).precioFinal();
                electrodomestico.setPrecio(precioFinal);
                System.out.println("Precio final:");
                System.out.println(electrodomestico.toString() + ", Carga: " + ((Lavadora) electrodomestico).getCarga());
                precioTotalL = precioTotalL + precioFinal;
            }
            if (electrodomestico instanceof Televisor) {
                System.out.println("TELEVISOR");
                System.out.println("Precio anterior:");
                System.out.println(electrodomestico.toString() + ", Resolución: " + ((Televisor) electrodomestico).getResolucion() + ", Sintonizador TDT: " + ((Televisor) electrodomestico).isSintonizadorTNT());
                double precioFinal = ((Televisor) electrodomestico).precioFinal();
                electrodomestico.setPrecio(precioFinal);
                System.out.println("Precio final:");
                System.out.println(electrodomestico.toString() + ", Resolución: " + ((Televisor) electrodomestico).getResolucion() + ", Sintonizador TDT: " + ((Televisor) electrodomestico).isSintonizadorTNT());
                precioTotalT = precioTotalT + precioFinal;
            }
            System.out.println("-------------------");
        }
        System.out.println("");
        System.out.println("Precio total lavadoras: $" + precioTotalL);
        System.out.println("Precio total televisores: $" + precioTotalT);
        System.out.println("Precio total electrodomésticos: $" + (precioTotalL + precioTotalT));
    }

}
