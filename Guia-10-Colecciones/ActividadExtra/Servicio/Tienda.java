/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Tienda {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Producto> productos = new ArrayList();

    public void cargarProducto() {
        String nombre, categoria, salida;
        double precio;
        int cantidad, opcion;
        do {
            System.out.println("Ingrese la siguiente información del producto:");
            System.out.println("Nombre:");
            nombre = leer.next();

            System.out.println("Categoría:");
            categoria = leer.next();

            System.out.println("Precio:");
            precio = leer.nextDouble();

            System.out.println("Cantidad:");
            cantidad = leer.nextInt();

            Producto producto = new Producto(nombre, categoria, precio, cantidad);
            agregarProducto(producto);

            do {
                System.out.println("¿Desea agregar otro producto? (S/N)");
                salida = leer.next();
                if (!salida.equalsIgnoreCase("S") && !salida.equalsIgnoreCase("N")) {
                    System.out.println("Opción incorrecta.");
                }
            } while (!salida.equalsIgnoreCase("S") && !salida.equalsIgnoreCase("N"));
        } while (!salida.equalsIgnoreCase("N"));
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public boolean estaVacia() {
        return productos.isEmpty();
    }

    public void mostrarProductos() {
        productos.forEach((producto) -> {
            System.out.println("- " + producto.getNombre().toUpperCase());
        });
    }

    public void mostrarDatosProducto(String nombreProducto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombreProducto)) {
                System.out.println(productos.get(i).toString().toUpperCase());;
            }
        }
    }

    public boolean venta(String nombreProducto, int cantidad) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombreProducto) && productos.get(i).getCantidad() > 0 && productos.get(i).getCantidad() >= cantidad) {
                productos.get(i).setCantidad(productos.get(i).getCantidad() - cantidad);
                return true;
            }
        }
        return false;
    }

    public boolean reponer(String nombreProducto, int cantidad) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombreProducto)) {
                productos.get(i).setCantidad(productos.get(i).getCantidad() + cantidad);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String nombreProducto) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNombre().equalsIgnoreCase(nombreProducto)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean existeProducto(String nombreProducto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombreProducto)) {
                return true;
            }
        }
        return false;
    }
}
