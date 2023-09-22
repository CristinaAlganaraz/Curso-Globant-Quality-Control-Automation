package ejexcepciones03y04;

import Entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjExcepciones03y04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DivisionNumero divNum = new DivisionNumero();

        try {
            System.out.println("Ingrese el dividendo:");
            String num1 = leer.next();
            int n1 = Integer.parseInt(num1);
            System.out.println("Ingrese el divisor:");
            String num2 = leer.next();
            int n2 = Integer.parseInt(num2);
            divNum.division(n1, n2);
        } catch (NumberFormatException e) {
            System.out.println("Se espera un número y se recibió un caracter.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------");
        try {
            System.out.println("Ingrese el dividendo:");
            int num1 = leer.nextInt();
            System.out.println("Ingrese el divisor:");
            int num2 = leer.nextInt();
            divNum.division(num1, num2);
        } catch (InputMismatchException e) {
            System.out.println("El tipo de dato ingresado es incorrecto, debe ingresar un número entero.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
