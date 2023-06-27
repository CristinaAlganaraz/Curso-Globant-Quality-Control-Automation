/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PersonaService {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Persona crearPersona() {

        String sexo;

        System.out.println("Nombre:");
        String nombre = leer.next();

        System.out.println("Edad:");
        int edad = leer.nextInt();

        leer.nextLine();

        do {
            System.out.println("Género (H, M u O):");
            sexo = leer.nextLine();

            if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
                System.out.println("Opción invalida.");
            }

        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));

        System.out.println("Peso:");
        double peso = leer.nextDouble();

        System.out.println("Altura:");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public int calcularIMC(Persona persona) {

        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean esMayorDeEdad(Persona persona) {

        return persona.getEdad() >= 18;

    }

}
