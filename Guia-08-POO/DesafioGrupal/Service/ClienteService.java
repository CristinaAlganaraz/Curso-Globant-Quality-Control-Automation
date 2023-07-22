/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ClienteService {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Cliente> clientes = new ArrayList<>();

    public void registrarCliente() {
        
        int id;

        System.out.println("Ingrese la siguiente información:");
        System.out.println("");
        
        do{
        System.out.print("ID: ");
        id = leer.nextInt();
        if(idRepetido(id)) {
            System.out.println("El ID ingresado ya se encuentra registrado.");
            System.out.print("Ingrese nuevo ");
        } 
        }while(idRepetido(id) != false);

        System.out.print("Nombre: ");
        String nombre = leer.next();

        System.out.print("Edad: ");
        int edad = leer.nextInt();

        System.out.print("Altura: ");
        double altura = leer.nextDouble();

        System.out.print("Peso: ");
        double peso = leer.nextDouble();

        System.out.print("Objetivo: ");
        String objetivo = leer.next();
        
        Cliente cliente = new Cliente(id,nombre,edad,altura,peso,objetivo);
        clientes.add(cliente);
    }

    public void obtenerClientes() {
        System.out.println("Listado de clientes:");
        System.out.println("");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).getId() + "- " + clientes.get(i).getNombre());
        }
    }

    public void actualizarCliente(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                int opcion;
                do {
                    System.out.println("Seleccione el dato que desea actualizar:");
                    System.out.println("1- Nombre");
                    System.out.println("2- Edad");
                    System.out.println("3- Altura");
                    System.out.println("4- Peso");
                    System.out.println("5- Objetivo");
                    System.out.println("6- Volver al menú anterior");
                    System.out.println("");
                    System.out.println("Elija una opción:");
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese nombre: ");
                            clientes.get(i).setNombre(leer.next());
                            break;
                        case 2:
                            System.out.print("Ingrese edad: ");
                            clientes.get(i).setEdad(leer.nextInt());
                            break;
                        case 3:
                            System.out.print("Ingrese altura: ");
                            clientes.get(i).setAltura(leer.nextDouble());
                            break;
                        case 4:
                            System.out.print("Ingrese peso: ");
                            clientes.get(i).setPeso(leer.nextDouble());
                            break;
                        case 5:
                            System.out.print("Ingrese objetivo: ");
                            clientes.get(i).setObjetivo(leer.next());
                            break;
                        case 6:
                            System.out.println("Volviendo al menú principal...");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                } while (opcion != 6);
            }
            break;
        }
    }

    public void eliminarCliente(int id) {
        String delete;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                System.out.println("Advertencia: El cliente seleccionado será removido permanemente de la base de datos.");
                leer.nextLine();
                do {
                    System.out.println("Ingrese 'S' para continuar o 'N' para cancelar.");
                    delete = leer.next();
                    if (!delete.equalsIgnoreCase("S") && !delete.equalsIgnoreCase("N")) {
                        System.out.println("Opción inválida.");
                    }
                } while (!delete.equalsIgnoreCase("S") && !delete.equalsIgnoreCase("N"));
                if (delete.equalsIgnoreCase("S")) {
                    clientes.remove(i);
                    System.out.println("Se ha eliminado el cliente de la base de datos.");
                }
                break;
            }
        }
    }

    public void buscarCliente(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                System.out.println(clientes.get(i).toString());
                break;
            }
        }
    }

    public boolean clientesVacia() {
        return clientes.isEmpty();
    }
    
    public boolean noEstaId(int id) {

        int contador = 0;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() != id) {
                contador++;
            }
        }

        return contador == clientes.size();
    }
    
    public boolean idRepetido(int id) {

        boolean bandera = false;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                bandera = true;
                break;
            }
        }

        return bandera;
    }

    
}
