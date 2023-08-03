/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Tienda {

    private HashMap<String, Double> productos = new HashMap();
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void almacenarProductos() {
        String nombreProducto, salir = "";
        double precio;
        do {
            System.out.println("Ingrese el producto a almacenar:");
            nombreProducto = leer.next().toUpperCase();
            System.out.println("Ingrese el precio del producto:");
            precio = leer.nextDouble();
            productos.put(nombreProducto, precio);
            do {
                System.out.println("¿Desea ingresar otro producto? (S/N)");
                salir = leer.next();
                if (!salir.equalsIgnoreCase("S") && !salir.equalsIgnoreCase("N")) {
                    System.out.println("Opción incorrecta.");
                }
            } while (!salir.equalsIgnoreCase("S") && !salir.equalsIgnoreCase("N"));
        } while (!salir.equalsIgnoreCase("N"));
    }

    public HashMap<String, Double> actualizarPrecio(String nombre, Double precio) {
        if (productos.containsKey(nombre)) {
            productos.put(nombre, precio);
        }
        return productos;
    }

    public boolean existeProducto(String nombre) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.containsKey(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean tiendaVacia() {
        return productos.isEmpty();
    }

    public HashMap<String, Double> eliminarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
        }
        return productos;
    }

    public void mostrarProductos() {
        productos.entrySet().forEach((aux) -> {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("Producto: " + key + " Precio: $" + value);
        });
    }

}
