/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;
import Entidad.Operacion;

/**
 *
 * @author crist
 */
public class OperacionService {
    
     private Scanner leer = new Scanner(System.in);
     private Operacion operacion = new Operacion();

    public void crearOperacion() {

        System.out.println("Ingrese el primer número:");
        operacion.setNumero1(leer.nextDouble());

        System.out.println("Ingrese el segundo número:");
        operacion.setNumero2(leer.nextDouble());

    }

    public double sumar() {

        return operacion.getNumero1() + operacion.getNumero2();

    }

    public double restar() {

        return operacion.getNumero1() - operacion.getNumero2();

    }

    public double multiplicar() {

        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("Debe multiplicar por un número mayor a 0.");
            return 0;
        } else {
            return operacion.getNumero1() * operacion.getNumero2();
        }

    }

    public double dividir() {

        if (operacion.getNumero2() == 0) {
            System.out.println("No se puede dividir por 0.");
            return 0;
        } else {
            return operacion.getNumero1() / operacion.getNumero2();
        }

    }

    
}
