/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo13;

import Service.CursoService;

/**
 *
 * @author crist
 */
public class EjPOO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        CursoService cursoService = new CursoService();        
        cursoService.crearCurso();
        cursoService.calcularGananciaSemanal();        
    }
    
}
