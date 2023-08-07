/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadcoleccionesextra01;

import Servicio.Tienda;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ActividadColeccionesExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String nombre, salida;
        int cantidad, opcion;

        do {
            System.out.println(":::::::: MENÚ TIENDA :::::::: ");
            System.out.println("");
            System.out.println("1- Cargar pruducto");
            System.out.println("2- Comprar producto");
            System.out.println("3- Reponer producto");
            System.out.println("4- Mostrar productos");
            System.out.println("5- Mostrar datos de un producto");
            System.out.println("6- Eliminar producto");
            System.out.println("7- Salir");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    tienda.cargarProducto();
                    break;
                case 2:
                    if (tienda.estaVacia()) {
                        System.out.println("No hay productos disponibles.");
                    } else {
                        System.out.println("Ingrese el nombre del producto que desea comprar:");
                        nombre = leer.next();
                        if (tienda.existeProducto(nombre)) {
                            System.out.println("Ingrese la cantidad a comprar:");
                            cantidad = leer.nextInt();
                            if (tienda.venta(nombre, cantidad)) {
                                System.out.println("Compra realizada.");
                            } else {
                                System.out.println("La cantidad que desea comprar es mayor a la existente.");
                            }
                        } else {
                            System.out.println("No se encontró el producto ingresado.");
                        }
                    }
                    break;
                case 3:
                    if (tienda.estaVacia()) {
                        System.out.println("No hay productos disponibles.");
                    } else {
                        System.out.println("Ingrese el nombre del producto que desea reponer:");
                        nombre = leer.next();
                        if (tienda.existeProducto(nombre)) {
                            System.out.println("Ingrese la cantidad a reponer:");
                            cantidad = leer.nextInt();
                            if (tienda.reponer(nombre, cantidad)) {
                                System.out.println("Reposición realizada.");
                            }
                        } else {
                            System.out.println("No se encontró el producto ingresado.");
                        }
                    }
                    break;
                case 4:
                    if (tienda.estaVacia()) {
                        System.out.println("No hay productos disponibles.");
                    } else {
                        tienda.mostrarProductos();
                    }
                    break;
                case 5:
                    if (tienda.estaVacia()) {
                        System.out.println("No hay productos disponibles.");
                    } else {
                        System.out.println("Ingrese el nombre del producto que desea ver el detalle:");
                        nombre = leer.next();
                        if (tienda.existeProducto(nombre)) {
                            tienda.mostrarDatosProducto(nombre);
                        } else {
                            System.out.println("No se encontró el producto ingresado.");
                        }
                    }
                    break;
                case 6:
                    if (tienda.estaVacia()) {
                        System.out.println("No hay productos disponibles.");
                    } else {
                        System.out.println("Ingrese el nombre del producto que desea eliminar:");
                        nombre = leer.next();
                        if (tienda.existeProducto(nombre)) {
                            if (tienda.eliminar(nombre)) {
                                System.out.println("Se ha eliminado el producto.");
                            }
                        } else {
                            System.out.println("No se encontró el producto ingresado.");
                        }
                    }
                    break;
                case 7:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 7);
    }
}
