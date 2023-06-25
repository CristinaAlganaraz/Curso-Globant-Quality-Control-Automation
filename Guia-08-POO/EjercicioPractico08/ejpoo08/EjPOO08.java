/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo08;

import Entidad.Cadena;
import Service.CadenaService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjPOO08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cadena cadena1 = new Cadena();
        Cadena cadena2 = new Cadena();
        CadenaService cadenaService = new CadenaService();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        //Construccion de objetos
        System.out.println("Ingrese una palabra o frase:");
        String frase1 = leer.next();
        
        cadena1.setCadena(frase1);
        cadena1.setLongitud(frase1.length());
        
        System.out.println("Ingrese otra palabra o frase:");
        String frase2 = leer.next();
        cadena2.setCadena(frase2);
        cadena2.setLongitud(frase2.length());

        System.out.println("-------------------------");        
        //Método que contabiliza la cantidad de vocales que hay en la cadena
        System.out.println("Frase/Palabra 1:");
        cadenaService.mostrarVocales(cadena1);
        System.out.println("Frase/Palabra 2:");
        cadenaService.mostrarVocales(cadena2);
        
        System.out.println("-------------------------");
        //Método que invierte la cadena
        System.out.println("La palabra/frase 1 invertida se ve así: " + cadenaService.invertirFrase(cadena1));
        System.out.println("La palabra/frase 2 invertida se ve así: " + cadenaService.invertirFrase(cadena2));
        
        System.out.println("-------------------------");
        //Método que busca cuántas veces se repite un caracter dentro de la cadena
        System.out.println("Ingrese un caracter:");
        char caracter = leer.next().charAt(0);
        System.out.println("Frase/Palabra 1: ");
        cadenaService.vecesRepetido(caracter, cadena1);
        System.out.println("Frase/Palabra 2: ");
        cadenaService.vecesRepetido(caracter, cadena2);
        
        System.out.println("-------------------------");
        //Método que compara la longitud entre dos cadenas
        cadenaService.compararLongitud(cadena1, cadena2);
        
        System.out.println("-------------------------");
        //Método que concatena dos cadenas
        cadenaService.unirFrases(cadena1,cadena2);
        
        System.out.println("-------------------------");  
        //Método que reemplaza un caracter por otro dentro de la cadena
        System.out.println("Palabra/Frase 1: ");
        System.out.println("La primera palabra/frase luego de reemplazar todas las letras 'a' con el caracter '@' se ve así: " + cadenaService.reemplazar(cadena1));
        System.out.println("Palabra/Frase 2:");
        System.out.println("La segunda palabra/frase luego de reemplazar todas las letras 'a' con el caracter '@' se ve así: " + cadenaService.reemplazar(cadena2));
        
        System.out.println("-------------------------");
        //Método donde busca un caracter dentro de la cadena y devuelve verdadero o falso
        System.out.println("Ingrese una letra para saber si alguna de las palabras/frases ingresadas la contiene:");
        String letra = leer.next();
        System.out.print("Palabra/Frase 1: ");
        System.out.println(cadenaService.contiene(letra, cadena1));
        System.out.print("Palabra/Frase 2: ");
        System.out.println(cadenaService.contiene(letra, cadena2));
    }
    
}
