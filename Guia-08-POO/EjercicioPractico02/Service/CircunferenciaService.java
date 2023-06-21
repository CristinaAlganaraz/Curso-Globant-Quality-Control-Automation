/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CircunferenciaService {

    private Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        System.out.println("Ingrese el radio de la circunferencia:");
        double radio = leer.nextDouble();

        return new Circunferencia(radio);

    }

    public double area(Circunferencia circunferencia) {

        return Math.PI * Math.pow(circunferencia.getRadio(), 2);

    }

    public double perimetro(Circunferencia circunferencia) {

        return 2 * Math.PI * circunferencia.getRadio();

    }
    
}
