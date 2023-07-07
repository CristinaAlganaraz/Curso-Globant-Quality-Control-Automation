/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Mes {
    
    private String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto = mes[5];

    public Mes() {
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public void adivinarMesSecreto() {

        Scanner leer = new Scanner(System.in);
        String mesIngresado;

        System.out.println("Adivine el mes secreto. Introduzca un mes en minúsculas:");

        do {
            mesIngresado = leer.next();

            if (!mesIngresado.equals(mesSecreto)) {
                System.out.println("Ups, no acertaste. Intenta de nuevo:");
            }

            if (mesIngresado.equals(mesSecreto)) {
                System.out.println("Felicitaciones, acertaste.");
            }
        } while (!mesIngresado.equals(mesSecreto));
    }

}
