/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo02;

import Entidad.Circunferencia;
import Service.CircunferenciaService;

/**
 *
 * @author crist
 */
public class EjPOO02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        CircunferenciaService circunferenciaService = new CircunferenciaService();
        
        Circunferencia radio1 = circunferenciaService.crearCircunferencia();

        System.out.println("El área del la circunferencia es: "+circunferenciaService.area(radio1));
        System.out.println("El perímetro de la circunferencia es: "+circunferenciaService.perimetro(radio1));
        
    }
    
}
