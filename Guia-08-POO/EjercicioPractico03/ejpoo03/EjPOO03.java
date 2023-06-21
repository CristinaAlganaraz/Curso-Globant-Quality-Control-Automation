/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo03;

import Service.OperacionService;

/**
 *
 * @author crist
 */
public class EjPOO03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        OperacionService operacionService = new OperacionService();

        operacionService.crearOperacion();

        System.out.println("El resultado de sumar ambos números es: " + operacionService.sumar());
        System.out.println("El resultado de restar ambos números es: " + operacionService.restar());
        System.out.println("El resultado de multiplicar ambos números es: " + operacionService.multiplicar());
        System.out.println("El resultado de dividir ambos números es: " + operacionService.dividir());

    }
    
}
