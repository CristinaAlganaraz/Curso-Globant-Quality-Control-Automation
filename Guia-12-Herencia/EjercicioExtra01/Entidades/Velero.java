package Entidades;

import java.util.Scanner;

public class Velero extends Barco{
    private int nroMastiles;

    public Velero() {
    }

    public Velero(int nroMastiles, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public void crearBarco() {
        Scanner leer = new Scanner(System.in);
        super.crearBarco();
        System.out.println("Número de mástiles:");
        setNroMastiles(leer.nextInt());
    }   

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + nroMastiles; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Velero{" + "Número de mástiles: " + nroMastiles + '}';
    }      
}
