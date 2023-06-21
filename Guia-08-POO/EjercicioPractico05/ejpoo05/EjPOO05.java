/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo05;

import Entidad.Cuenta;
import Service.CuentaService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjPOO05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        CuentaService cuentaService = new CuentaService();

        Cuenta cuenta = cuentaService.crearCuenta();
        
        System.out.println("");

        int opcion;

        do {

            System.out.println("MENÚ DE OPCIONES:");
            System.out.println("1- Ingresar dinero");
            System.out.println("2- Retirar dinero");
            System.out.println("3- Extracción rápida");
            System.out.println("4- Consultar saldo");
            System.out.println("5- Consultar datos");
            System.out.println("6- Salir");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cuentaService.ingresarDinero(cuenta);
                    System.out.println("");
                    break;
                case 2:
                    cuentaService.retirarDinero(cuenta);
                    System.out.println("");
                    break;
                case 3:
                    cuentaService.extraccionRapida(cuenta);
                    System.out.println("");
                    break;
                case 4:
                    cuentaService.consultarSaldo(cuenta);
                    System.out.println("");
                    break;
                case 5:
                    cuentaService.consultarDatos(cuenta);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    System.out.println("");
            }

        } while (opcion != 6);

    }

}
