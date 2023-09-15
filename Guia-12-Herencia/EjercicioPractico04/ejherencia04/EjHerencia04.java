/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejherencia04;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author crist
 */
public class EjHerencia04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(18,12);
        
        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());
        System.out.println("");
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
    }
    
}
