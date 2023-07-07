/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author crist
 */
public class Raices {
    
    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("x1= " + ((-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a)));
            System.out.println("x2= " + ((-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a)));
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            System.out.println("x= " + (-b / (2 * a)));
        }
    }
    
    public void calcular() {
        if(tieneRaiz()) {
            obtenerRaiz();
        } else if(tieneRaices()) {
            obtenerRaices();
        } else {
            System.out.println("No existe solución.");
        }
    }

}
