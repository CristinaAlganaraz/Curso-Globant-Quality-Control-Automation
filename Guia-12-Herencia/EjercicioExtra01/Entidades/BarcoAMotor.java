package Entidades;

import java.util.Scanner;

public class BarcoAMotor extends Barco{
    private int potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potenciaCV, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public void crearBarco() {
        Scanner leer = new Scanner(System.in);
        super.crearBarco();
        System.out.println("Potencia del motor:");
        setPotenciaCV(leer.nextInt());
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }

    @Override
    public String toString() {
        return super.toString() + ", Barco a motor{" + "Potencia en CV: " + potenciaCV + '}';
    }        
}
