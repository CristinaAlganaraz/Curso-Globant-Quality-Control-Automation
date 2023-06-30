/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo10;

import Service.ArregloService;
import java.util.Arrays;

/**
 *
 * @author crist
 */
public class EjPOO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArregloService arregloService = new ArregloService();

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];       

        //Inicializa el arreglo A y lo muestra en pantalla
        System.out.println("Arreglo A antes:");
        arregloService.inicializarArreglo(arregloA);
        System.out.println(Arrays.toString(arregloA));
        System.out.println("");
        
        //Muestra en pantalla el arreglo B vacío:
        System.out.println("Arreglo B antes:");
        System.out.println(Arrays.toString(arregloB));
        System.out.println("");
   
        //Ordena el arreglo A de menor a mayor y lo muestra en pantalla
        System.out.println("Arreglo A después:");
        arregloService.ordenarArregloMenorMayor(arregloA);
        System.out.println(Arrays.toString(arregloA));
        System.out.println("");

        //Copia los primeros 10 números del arreglo A al arreglo B, rellena los otros 10 espacios con 0.5 y lo muestra en pantalla
        System.out.println("Arreglo B después:");
        arregloB = arregloService.copiarNumeros(arregloA, arregloB);
        arregloService.rellenarArreglo(arregloB);
        System.out.println(Arrays.toString(arregloB));
        System.out.println("");
    }
    
}
