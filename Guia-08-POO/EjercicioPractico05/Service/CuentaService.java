/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CuentaService {
    
    private Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta () {
        
        System.out.println("Ingrese número de cuenta:");
        int numeroCuenta = leer.nextInt();
        
        System.out.println("Ingrese su número de documento:");
        long dni = leer.nextLong();
        
        System.out.println("Ingrese su saldo actual:");
        double saldoActual = leer.nextDouble();
        
        return new Cuenta(numeroCuenta,dni,saldoActual);
        
    }
    
    public void ingresarDinero(Cuenta cuenta) {

        System.out.println("Ingrese la cantidad de dinero a depositar:");
        double ingreso = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
        
    }

    public void retirarDinero(Cuenta cuenta) {

        System.out.println("Ingrese la cantidad de dinero a retirar:");
        double retiro = leer.nextDouble();
        
        if (cuenta.getSaldoActual() < retiro) {            
            System.out.println("Saldo insuficiente para realizar la operación.");
            cuenta.getSaldoActual();
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Transacción realizada.");
        }

    }

    public void extraccionRapida(Cuenta cuenta) {

        System.out.println("Esta operación sólo permite extraer el 20% de su saldo.");
        System.out.println("Ingrese la cantidad de dinero a retirar:");
        double extraccionRapida = leer.nextDouble();

        if (extraccionRapida > (cuenta.getSaldoActual()) * 0.2) {

            System.out.println("El importe ingresado supera el 20% permitido.");
            cuenta.getSaldoActual();
        } else {
            cuenta.setSaldoActual( cuenta.getSaldoActual() - extraccionRapida);
            System.out.println("Transacción realizada.");
        }

    }
    
    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("Su saldo actual es de $"+cuenta.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta cuenta) {
        System.out.println("Cuenta N°: "+cuenta.getNumeroCuenta());
        System.out.println("DNI N°: "+cuenta.getDni());
        System.out.println("Saldo actual: $"+cuenta.getSaldoActual());
    }


}
