/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrajunit02;

/**
 *
 * @author crist
 */
public class PalindromeChecker {
    
    public static boolean isPalindrome(String string) {        
        //Inicializar una cadena vacía para ir guardando la frase revertida
        String reversedString = "";
        
        boolean check = false;
        
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString = reversedString + string.charAt(i);            
        }        
        //Retorna true si las cadenas son iguales
        return string.equals(reversedString);       
    }
    
}
