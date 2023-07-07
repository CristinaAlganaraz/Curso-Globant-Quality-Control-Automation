/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrapoo04;

import Entidad.NIF;
import Service.NIFService;

/**
 *
 * @author crist
 */
public class EjExtraPOO04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        NIFService nifService = new NIFService();
        NIF nif = new NIF();
        
        nif = nifService.crearNif();
        System.out.println(nif.toString());
    }
    
}
