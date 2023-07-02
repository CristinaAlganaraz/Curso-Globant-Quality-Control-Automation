/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author crist
 */
public class Movil {
    
    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, String modelo, int memoriaRam, int almacenamiento, double precio, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Detalle del equipo:" + '\n'
                + "" + '\n'
                + "Marca: " + marca + '\n'
                + "Modelo: " + modelo + '\n'
                + "Memoria RAM: " + memoriaRam + " GB" + '\n'
                + "Capacidad de almacenamiento: " + almacenamiento + " GB" + '\n'
                + "Precio: " + precio + '\n';
    }    
    
}
