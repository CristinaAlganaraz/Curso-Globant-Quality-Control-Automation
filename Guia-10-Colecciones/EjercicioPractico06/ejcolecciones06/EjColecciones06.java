/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcolecciones06;

import Servicio.Tienda;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class EjColecciones06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda ts = new Tienda();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int opcion;
        String nombre;

        do {
            System.out.println("::::::::: TIENDA DE PRODUCTOS :::::::::");
            System.out.println("");
            System.out.println("1- Agregar producto");
            System.out.println("2- Actualizar precio");
            System.out.println("3- Eliminar producto");
            System.out.println("4- Mostrar productos");
            System.out.println("5- Salir del sistema");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ts.almacenarProductos();
                    break;
                case 2:
                    if (ts.tiendaVacia()) {
                        System.out.println("No hay productos disponibles.");
                    } else {
                        System.out.println("Ingrese el nombre del producto que desea actualizar el precio:");
                        nombre = leer.next().toUpperCase();
                        if (ts.existeProducto(nombre)) {
                            System.out.println("Ingrese el nuevo precio:");
                            double precio = leer.nextDouble();
                            ts.actualizarPrecio(nombre,precio);
                        } else {
                            System.out.println("No existe el producto ingresado.");
                        }
                    }
                    break;
                case 3:
                    if (ts.tiendaVacia()) {
                        System.out.println("No hay productos disponibles.");
                    } else {
                        System.out.println("Ingrese el nombre del producto que desea eliminar:");
                        nombre = leer.next().toUpperCase();
                        if (ts.existeProducto(nombre)) {
                            ts.eliminarProducto(nombre);
                            System.out.println("Se ha eliminado el producto.");
                        } else {
                            System.out.println("No existe el producto ingresado.");
                        }
                    }
                    break;
                case 4:
                    if (ts.tiendaVacia()) {
                        System.out.println("No hay productos disponibles.");
                    } else {
                        System.out.println("Productos disponibles:");
                        ts.mostrarProductos();
                    }
                    break;
                case 5:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción no disponible.");
                    break;
            }

        } while (opcion != 5);

    }

}
