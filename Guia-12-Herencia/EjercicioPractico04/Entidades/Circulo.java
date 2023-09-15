package Entidades;

import Interfaces.CalculosFormas;

public class Circulo implements CalculosFormas {

    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return PI * (radio * 2);
    }

}
