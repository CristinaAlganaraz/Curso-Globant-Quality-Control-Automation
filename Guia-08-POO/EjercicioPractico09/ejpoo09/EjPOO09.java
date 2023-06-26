/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo09;

import Entidad.Matematica;
import Service.MatematicaService;

/**
 *
 * @author crist
 */
public class EjPOO09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MatematicaService matematicaService = new MatematicaService();
        Matematica numeros = new Matematica();
        
        double num1 = generarNumAleatorio(-100,100);
        numeros.setNum1(num1);
        double num2 = generarNumAleatorio(-100,100);
        numeros.setNum2(num2);

        System.out.println("Los números generados son: " + numeros.getNum1() + " y " + numeros.getNum2() + ".");
        System.out.println("");

        matematicaService.devolverMayor(numeros);
        matematicaService.calcularPotencia(numeros.getNumMayor(), numeros.getNumMenor());
        matematicaService.calcularRaiz(numeros.getNumMenor());
    }
    
    public static double generarNumAleatorio(double min, double max) {

        double num = (double) (Math.random() * (max - min)) + min;

        return num;

    }

}
