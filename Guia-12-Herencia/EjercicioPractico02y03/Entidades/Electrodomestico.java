package Entidades;

import java.util.Scanner;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Precio: $" + precio + ", Color: " + color + ", Consumo energético: " + consumoEnergetico + ", Peso: " + peso + "Kg.";
    }
    
    private char comprobarConsumoEnergetico(char letra) {

        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }
    
    private String comprobarColor(String color) {

        String[] availableColours = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        for (String colour : availableColours) {
            if (colour.equalsIgnoreCase(color)) {
                return colour;
            }
        }
        return "BLANCO";
    }
    
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la siguiente información:");
        System.out.println("");
        System.out.println("Color (blanco, negro, rojo, azul o gris):");
        String colour = comprobarColor(leer.next());
        setColor(colour);
        System.out.println("Consumo eléctrico (A, B, C, D, E o F):");
        char consumoElectrico = comprobarConsumoEnergetico(leer.next().charAt(0));
        setConsumoEnergetico(consumoElectrico);
        System.out.println("Peso (kilos):");
        setPeso(leer.nextDouble());
        setPrecio(1000);
    }
    
    public double precioFinal() {
        double precioFinal = 0;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }
        return precio + precioFinal;
    }
}
