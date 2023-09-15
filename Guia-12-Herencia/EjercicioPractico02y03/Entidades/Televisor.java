package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTNT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTNT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTNT = sintonizadorTNT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTNT() {
        return sintonizadorTNT;
    }

    public void setSintonizadorTNT(boolean sintonizadorTNT) {
        this.sintonizadorTNT = sintonizadorTNT;
    }
    
    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in);
        String rsta;
        int pulgadas;
        crearElectrodomestico();
        do {
            System.out.println("Resolución (32, 47, 55 o 60):");
            pulgadas = leer.nextInt();
            if (pulgadas != 32 && pulgadas != 47 && pulgadas != 55 && pulgadas != 60) {
                System.out.println("Opción inválida.");
            } else {
                setResolucion(pulgadas);
            }
        } while (pulgadas != 32 && pulgadas != 47 && pulgadas != 55 && pulgadas != 60);

        do {
            System.out.println("Indique si tiene sintonizador TDT (S/N):");
            rsta = leer.next();
            if (rsta.equalsIgnoreCase("S")) {
                setSintonizadorTNT(true);
            } else if(rsta.equalsIgnoreCase("N")) {
                setSintonizadorTNT(false);
            } else {
                System.out.println("Opción incorrecta.");
            }
        }while(!rsta.equalsIgnoreCase("S") && !rsta.equalsIgnoreCase("N"));        
    }
    
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        
        if (resolucion > 40) {
            precioFinal *= 1.3;
        }
        
        if(sintonizadorTNT) {
            precioFinal += 500;
        }
        return precioFinal;
    }
}
