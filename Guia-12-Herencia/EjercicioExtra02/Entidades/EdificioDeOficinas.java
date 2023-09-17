package Entidades;

import java.util.Scanner;

public class EdificioDeOficinas extends Edificio{
    
    private int numeroDeOficinas;
    private int cantidadPersonasPorOficina;
    private int numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroDeOficinas, int cantidadPersonasPorOficina, int numeroDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getCantidadPersonasPorOficina() {
        return cantidadPersonasPorOficina;
    }

    public void setCantidadPersonasPorOficina(int cantidadPersonasPorOficina) {
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public double calcularSuperficie() {
        return (ancho * largo) * numeroDePisos;
    }

    @Override
    public double calcularVolumen() {
        return largo * ancho * alto;
    }

    public void cantidadPersonas() {
        System.out.println("Cantidad de personas que entrarían en un piso: " + (getCantidadPersonasPorOficina() * getNumeroDeOficinas()));
        System.out.println("Cantidad de personas que entrarían en todo el edificio: " + ((getCantidadPersonasPorOficina() * getNumeroDeOficinas())) * getNumeroDePisos());
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "Número de oficinas: " + numeroDeOficinas + ", Cantidad de personas por oficina: " + cantidadPersonasPorOficina + ", Número de pisos: " + numeroDePisos + ", Ancho: " + ancho + " mts." + ", Alto: " + alto + " mts." + ", Largo: " + largo + " mts." + '}';
    }

}
