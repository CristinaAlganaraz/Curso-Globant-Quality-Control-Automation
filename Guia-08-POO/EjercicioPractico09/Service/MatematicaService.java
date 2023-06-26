/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Matematica;

/**
 *
 * @author crist
 */
public class MatematicaService {

   public void devolverMayor(Matematica numeros) {

        if (numeros.getNum1() == Math.max(numeros.getNum1(), numeros.getNum2())) {
            numeros.setNumMayor(numeros.getNum1());
            numeros.setNumMenor(numeros.getNum2());
            System.out.println(numeros.getNum1() + " es el número mayor.");
        } else {
            numeros.setNumMayor(numeros.getNum2());
            numeros.setNumMenor(numeros.getNum1());
            System.out.println(numeros.getNum2() + " es el número mayor.");
        }

    }

    public static double calcularPotencia(double numMayor, double numMenor) {

        double potencia = Math.pow(Math.round(numMayor), Math.round(numMenor));

        System.out.println(Math.round(numMayor) + " elevado por " + Math.round(numMenor) + " es igual " + potencia);
        return potencia;
    }

    public static double calcularRaiz(double numMenor) {

        double raiz = Math.sqrt(Math.abs(numMenor));

        System.out.println("La raíz cuadrada de " + Math.abs(numMenor) + " es igual a " + raiz);
        return raiz;
    }

}
