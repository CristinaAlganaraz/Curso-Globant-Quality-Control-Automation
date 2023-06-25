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
public class Matematica {
    
    private double num1;
    private double num2;
    private double numMayor;
    private double numMenor;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNumMayor() {
        return numMayor;
    }

    public void setNumMayor(double numMayor) {
        this.numMayor = numMayor;
    }

    public double getNumMenor() {
        return numMenor;
    }

    public void setNumMenor(double numMenor) {
        this.numMenor = numMenor;
    }

}
