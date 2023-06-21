/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo04;

import Service.RectanguloService;

/**
 *
 * @author crist
 */
public class EjPOO04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RectanguloService rectanguloService = new RectanguloService();
        rectanguloService.crearRectangulo();

        System.out.println("---------------------------------------------------------------------");
        System.out.println("");

        System.out.println("La superficie del rectángulo es: " + rectanguloService.calcularSuperficie());
        System.out.println("El perímetro del rectángulo es: " + rectanguloService.calcularPerimetro());

        System.out.println("");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("");

        rectanguloService.dibujarRectangulo();
        
    }
    
}
