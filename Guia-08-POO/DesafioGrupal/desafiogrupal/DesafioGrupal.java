/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogrupal;

import Service.ClienteService;
import Service.RutinaService;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class DesafioGrupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClienteService clienteService = new ClienteService();
        RutinaService rutinaService = new RutinaService();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int opcion, id;
        
        do {
            System.out.println(":::::::::::: MENÚ PRINCIPAL ::::::::::::");
            System.out.println("");
            System.out.println("1- Registrar cliente");
            System.out.println("2- Listar clientes");
            System.out.println("3- Actualizar cliente");
            System.out.println("4- Buscar cliente");
            System.out.println("5- Eliminar cliente");
            System.out.println("6- Registrar rutina");
            System.out.println("7- Listar rutinas");
            System.out.println("8- Actualizar rutina");
            System.out.println("9- Buscar rutina");
            System.out.println("10- Eliminar rutina");
            System.out.println("11- Salir del sistema");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    clienteService.registrarCliente();
                    System.out.println("");
                    break;
                case 2:
                    if (clienteService.clientesVacia()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        clienteService.obtenerClientes();
                    }
                    System.out.println("");
                    break;
                case 3:
                    if (clienteService.clientesVacia()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        System.out.println("Ingrese el ID del usuario que desea actualizar datos:");
                        id = leer.nextInt();
                        if (clienteService.noEstaId(id)) {
                            System.out.println("El ID ingresado no está registrado.");
                        } else {
                            clienteService.actualizarCliente(id);
                        }
                    }
                    System.out.println("");
                    break;
                case 4:
                    if (clienteService.clientesVacia()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        System.out.println("Ingrese el ID del cliente que desea buscar:");
                        id = leer.nextInt();
                        if (clienteService.noEstaId(id)) {
                            System.out.println("El ID ingresado no está registrado.");
                        } else {
                            clienteService.buscarCliente(id);
                        }
                    }
                    System.out.println("");
                    break;
                case 5:
                    if (clienteService.clientesVacia()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        System.out.println("Ingrese el ID del usuario que desea eliminar de la base de datos:");
                        id = leer.nextInt();
                        if (clienteService.noEstaId(id)) {
                            System.out.println("El ID ingresado no está registrado.");
                        } else {
                            clienteService.eliminarCliente(id);
                        }
                    }
                    System.out.println("");
                    break;
                case 6:
                    rutinaService.crearRutina();
                    System.out.println("");
                    break;
                case 7:
                    if (rutinaService.rutinasVacia()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        rutinaService.obtenerRutinas();
                    }
                    System.out.println("");
                    break;
                case 8:
                    if (rutinaService.rutinasVacia()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        System.out.println("Ingrese el ID de la rutina que desea actualizar:");
                        id = leer.nextInt();
                        if (rutinaService.noEstaId(id)) {
                            System.out.println("El ID ingresado no está registrado.");
                        } else {
                            rutinaService.actualizarRutina(id);
                        }
                    }
                    System.out.println("");
                    break;
                case 9:
                    if (rutinaService.rutinasVacia()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        System.out.println("Ingrese el ID de la rutina que desea buscar:");
                        id = leer.nextInt();
                        if (rutinaService.noEstaId(id)) {
                            System.out.println("El ID ingresado no está registrado.");
                        } else {
                            rutinaService.buscarRutina(id);
                        }
                    }
                    System.out.println("");
                    break;
                case 10:
                    if (rutinaService.rutinasVacia()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        System.out.println("Ingrese el ID de la rutina que desea eliminar de la base de datos:");
                        id = leer.nextInt();
                        if (rutinaService.noEstaId(id)) {
                            System.out.println("El ID ingresado no está registrado.");
                        } else {
                            rutinaService.eliminarRutina(id);
                        }
                    }
                    System.out.println("");
                    break;
                case 11:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    System.out.println("");
                    break;
            }
        } while (opcion != 11);
    }
}
