package Entidades;

import java.util.Scanner;

public class Yate extends Barco{
    private int potenciaCV;
    private int nroCamarotes;

    public Yate() {
    }

    public Yate(int potenciaCV, int nroCamarotes, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.nroCamarotes = nroCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public void crearBarco() {
        Scanner leer = new Scanner(System.in);
        super.crearBarco();
        System.out.println("Potencia en CV:");
        setPotenciaCV(leer.nextInt());
        System.out.println("Número de camarotes:");
        setNroCamarotes(leer.nextInt());
    }   

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + nroCamarotes;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Yate{" + "Potencia en CV: " + potenciaCV + ", Número de camarotes: " + nroCamarotes + '}';
    }    
}
