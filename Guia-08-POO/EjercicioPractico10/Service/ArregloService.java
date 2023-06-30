/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Arrays;

/**
 *
 * @author crist
 */
public class ArregloService {
    
    public void inicializarArreglo(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (double) (Math.round(Math.random() * 99));
        }
    }
       
    public void ordenarArregloMenorMayor(double[] arreglo) {
            Arrays.sort(arreglo);
    }

    public double[] copiarNumeros(double[] arregloA, double[] arregloB) {
        arregloB = Arrays.copyOfRange(arregloA, 0, arregloB.length);
        
        return arregloB;
    }

    public void rellenarArreglo(double[] arreglo) {
        Arrays.fill(arreglo, 10, 20, 0.5);
    }   
    
}
    


  

