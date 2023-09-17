package Entidades;

import java.util.Scanner;

public abstract class Barco {
    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void crearBarco() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la siguiente información:");
        System.out.println("");
        System.out.println("Matrícula:");
        setMatricula(leer.next());
        System.out.println("Eslora (longitud del barco en metros):");
        setEslora(leer.nextInt());
        System.out.println("Año de fabricación:");
        setAnioFabricacion(leer.nextInt());
    }

    public double calcularModulo() {
        return eslora * 10;
    }

    @Override
    public String toString() {
        return "Barco{" + "Matrícula: " + matricula + ", Eslora: " + eslora + ", Año de fabricación: " + anioFabricacion + '}';
    }
}
