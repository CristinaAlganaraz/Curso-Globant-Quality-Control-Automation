package ejexcepciones05;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class EjExcepciones05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int numSecreto = random.nextInt(500) + 1, num = 0, intentos = 3, contador = 0;
        //System.out.println(numSecreto);
        System.out.println("::::::::::::::: ADIVINE EL NÚMERO SECRETO :::::::::::::::");
        System.out.println("");

        do {
            try {
                contador++;
                intentos--;
                System.out.println("Ingrese un número:");
                num = leer.nextInt();

                if (num == numSecreto) {
                    System.out.print("Felicitaciones, ¡adivinaste el número! ");
                    System.out.println("Cantidad de intentos: " + contador);
                } else if (num > numSecreto) {
                    System.out.print("El número ingresado es mayor que el número secreto. ");
                } else if (num < numSecreto) {
                    System.out.print("El número ingresado es menor que el número secreto. ");
                }

            } catch (InputMismatchException e) {
                System.out.print("El tipo de dato ingresado es incorrecto, debe ingresar un número entero. ");
                leer.nextLine();
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error.");
            } finally {
                if (intentos == 0 && num != numSecreto) {
                    System.out.println("");
                    System.out.print("¡Se terminaron los intentos! ");
                    System.out.println("El número secreto era: " + numSecreto);
                } else if (num != numSecreto) {
                    System.out.println("Intentos restantes: " + intentos);
                    System.out.println("---------------------------------");
                }
            }
        } while (intentos != 0 && num != numSecreto);
    }
}
