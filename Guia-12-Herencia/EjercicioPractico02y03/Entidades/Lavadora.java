package Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
  private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("Carga (kilos):");
        setCarga(leer.nextInt());
    }
    
  @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        
        if(carga > 30) {
            precioFinal += 500;
        }
        return precioFinal;
    }  
}
