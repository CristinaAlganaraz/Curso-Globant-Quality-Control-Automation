/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;


/**
 *
 * @author crist
 */
public class CadenaService {
    
   
    public void mostrarVocales(Cadena cadena) {

        int contador = 0;
        String frase = cadena.getCadena();

        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U'
                    || frase.charAt(i) == 'Á' || frase.charAt(i) == 'É' || frase.charAt(i) == 'Í' || frase.charAt(i) == 'Ó' || frase.charAt(i) == 'Ú'
                    || frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'
                    || frase.charAt(i) == 'á' || frase.charAt(i) == 'é' || frase.charAt(i) == 'í' || frase.charAt(i) == 'ó' || frase.charAt(i) == 'ú') {
                contador++;
            }
        }

        System.out.println("La palabra/frase ingresada contiene " + contador + " vocal/es.");
    }

    public String invertirFrase(Cadena cadena) {

        String aux = cadena.getCadena();
        String fraseFinal = "";

        for (int i = aux.length() - 1; i >= 0; i--) {
            fraseFinal = fraseFinal + (aux.charAt(i));
        }

        return fraseFinal;

    }
    
    public void vecesRepetido(char letra, Cadena cadena) {

        int contador = 0;

        for (int i = 0; i < cadena.getCadena().length(); i++) {
            if (cadena.getCadena().charAt(i) == letra) {
                contador++;
            }
        }
        
        if (contador > 0) {
            System.out.println("Cantidad de veces que se repite el caracter '"+letra+"' en la palabra/frase: "+contador);
        } else {
            System.out.println("El caracter '"+letra+"' no se encuentra en la palabra/frase ingresada.");
        }

    }
    
    public void compararLongitud (Cadena cadena1, Cadena cadena2) {
              
        if (cadena1.getCadena().length() < cadena2.getCadena().length()) {
            System.out.println("La segunda palabra/frase tiene más cantidad de caracteres que la primera palabra/frase.");
        } else if (cadena1.getCadena().length() > cadena2.getCadena().length()) {
            System.out.println("La primera palabra/frase tiene más cantidad de caracteres que la segunda palabra/frase.");
        } else if (cadena1.getCadena().length() == cadena2.getCadena().length()) {
            System.out.println("Ambas palabras/frases tienen la misma cantidad de caracteres.");
        }
        
    }
    
    public void unirFrases(Cadena cadena1, Cadena cadena2) {
        
        String fraseConcatenada = cadena1.getCadena().concat(cadena2.getCadena());
        
        System.out.println("La primera palabra/frase concatenada a la segunda se ve así: "+fraseConcatenada);
        
    }
    
    public String reemplazar(Cadena cadena) {

        String aux = cadena.getCadena();
        String fraseFinal = "";

        for (int i = 0; i < aux.length(); i++) {

            switch (aux.charAt(i)) {
                case 'a':
                    fraseFinal = fraseFinal + '@';
                    break;
                case 'á':
                    fraseFinal = fraseFinal + '@';
                    break;
                case 'A':
                    fraseFinal = fraseFinal + '@';
                    break;
                case 'Á':
                    fraseFinal = fraseFinal + '@';
                    break;
                default:
                    fraseFinal = fraseFinal + (aux.charAt(i));
            }
        }
        return fraseFinal;
    }
    
    public boolean contiene(String letra, Cadena cadena) {

        boolean contiene = false;

        for (int i = 0; i < cadena.getCadena().length(); i++) {
            if (String.valueOf(cadena.getCadena().charAt(i)).equalsIgnoreCase(letra)) {
                contiene = true;
            }
        }

        if (contiene) {
            return true;
        } else {
            return false;
        }

    }
}
