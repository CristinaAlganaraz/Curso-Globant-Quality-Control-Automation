/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo07;

import Entidad.Persona;
import Service.PersonaService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class EjPOO07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaService personaService = new PersonaService();
        List<Persona> list = new ArrayList<>();
        int contadorDebajoPesoIdeal = 0;
        int contadorPesoIdeal = 0;
        int contadorSobrepeso = 0;
        int contadorMayorDeEdad = 0;
        int contadorMenorDeEdad = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Completar los datos de la persona " + (i + 1) + ":");
            list.add(personaService.crearPersona());
            personaService.calcularIMC(list.get(i));
            personaService.esMayorDeEdad(list.get(i));
            if (personaService.calcularIMC(list.get(i)) == -1) {
                System.out.print("La persona se encuentra por debajo de su peso ideal ");
                contadorDebajoPesoIdeal++;
            }
            if (personaService.calcularIMC(list.get(i)) == 0) {
                System.out.print("La persona tiene su peso ideal ");
                contadorPesoIdeal++;
            }
            if (personaService.calcularIMC(list.get(i)) == 1) {
                System.out.print("La persona tiene sobre peso ");
                contadorSobrepeso++;
            }
            if (personaService.esMayorDeEdad(list.get(i)) == true) {
                System.out.println("y es mayor de edad.");
                contadorMayorDeEdad++;
            } else {
                System.out.println("y es menor de edad.");
                contadorMenorDeEdad++;
            }
            System.out.println("");
        }

        if (contadorDebajoPesoIdeal > 0) {
            System.out.println("El " + contadorDebajoPesoIdeal * 100 / 4 + "%" + " de las personas están por debajo de su peso ideal.");
        }

        if (contadorPesoIdeal > 0) {
            System.out.println("El " + contadorPesoIdeal * 100 / 4 + "%" + " de las personas están en su peso ideal.");
        }

        if (contadorSobrepeso > 0) {
            System.out.println("El " + contadorSobrepeso * 100 / 4 + "%" + " de las personas tienen sobrepeso.");
        }

        if (contadorMayorDeEdad > 0) {
            System.out.println("El " + contadorMayorDeEdad * 100 / 4 + "%" + " de las personas son mayor de edad.");
        }

        if (contadorMenorDeEdad > 0) {
            System.out.println("El " + contadorMenorDeEdad * 100 / 4 + "%" + " de las personas son menor de edad. ");
        }

    }

}
