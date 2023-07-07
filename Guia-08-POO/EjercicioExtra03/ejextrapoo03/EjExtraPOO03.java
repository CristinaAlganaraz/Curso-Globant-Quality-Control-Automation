/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrapoo03;

import Entidad.Raices;

/**
 *
 * @author crist
 */
public class EjExtraPOO03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Raices raices1 = new Raices(1,4,4);        
        raices1.calcular();   
        System.out.println("");
        Raices raices2 = new Raices(3,-5,2);
        raices2.calcular();
        System.out.println("");
        Raices raices3 = new Raices(1,1,1);
        raices3.calcular();
    }    
}
