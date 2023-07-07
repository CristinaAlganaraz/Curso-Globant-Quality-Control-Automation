/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class NIFService {
    
    private Scanner leer = new Scanner (System.in);
    
    public NIF crearNif() {
        
        System.out.println("Ingrese su número de DNI:");
        long dni = leer.nextLong();
        
        String letra = calcularLetra(dni);
        
        return new NIF(dni,letra);
    }
    
    public String calcularLetra(long dni) {
        
        long resto = dni % 23;
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int posicion = (int)resto;
        return letras[posicion];  
    }    
}
