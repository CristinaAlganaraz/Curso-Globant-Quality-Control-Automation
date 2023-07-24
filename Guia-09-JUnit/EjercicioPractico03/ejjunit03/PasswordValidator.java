/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejjunit03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author crist
 */
public class PasswordValidator {
    
//^ represents starting character of the string.
//(?=.*[0-9]) represents a digit must occur at least once.
//(?=.*[a-z]) represents a lower case alphabet must occur at least once.
//(?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
//(?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
//(?=\\S+$) white spaces don’t allowed in the entire string.
//.{8, 20} represents at least 8 characters and at most 20 characters.
//$ represents the end of the string
    
    public static boolean validPassword(String password) {
        //Agrego expresiones que deben cumplir el password
        String validPassword = "^(?=.*[0-9])"
                               + "(?=.*[a-z])(?=.*[A-Z])"
                               + "(?=.*[@#$%^&+=])"
                               + "(?=\\S+$).{8,20}$";
        //Compilo esas expresiones
        Pattern patternCompile = Pattern.compile(validPassword);
        //Si el password está vacío devuelvo falso
        if(password == null) {
            return false;
        }
        //Verifica si el password dado cumple con las expresiones
        Matcher passwordMatches = patternCompile.matcher(password);
        //Si cumple devuelve true
        return passwordMatches.matches();        
    }    
}
