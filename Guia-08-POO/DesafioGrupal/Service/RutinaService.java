/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class RutinaService {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Rutina> rutinas = new ArrayList<>();

    public void crearRutina() {

        int id;

        System.out.println("Ingrese la siguiente información:");
        System.out.println("");

        do {
            System.out.print("ID: ");
            id = leer.nextInt();
            if (idRepetido(id)) {
                System.out.println("El ID ingresado ya se encuentra registrado.");
                System.out.print("Ingrese nuevo ");
            }
        } while (idRepetido(id) != false);

        System.out.print("Nombre: ");
        String nombre = leer.next();

        System.out.print("Duración: ");
        int duracion = leer.nextInt();

        int opcion;
        String nivelDificultad = "";
        do {
            System.out.println("Nivel dificultad: ");
            System.out.println("1- Fácil");
            System.out.println("2- Medio");
            System.out.println("3- Difícil");
            System.out.println("");
            System.out.println("Elija una opción:");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    nivelDificultad = "Fácil";
                    break;
                case 2:
                    nivelDificultad = "Medio";
                    break;
                case 3:
                    nivelDificultad = "Difícil";
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3);

        System.out.print("Descripción: ");
        String descripcion = leer.next();

        Rutina rutina = new Rutina(id, nombre, duracion, nivelDificultad, descripcion);
        rutinas.add(rutina);
    }

    public void obtenerRutinas() {
        System.out.println("Listado de rutinas:");
        System.out.println("");
        for (int i = 0; i < rutinas.size(); i++) {
            System.out.println(rutinas.get(i).getId() + "- " + rutinas.get(i).getNombre());
        }
    }

    public void actualizarRutina(int id) {
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id) {
                int opcionMenu;
                int opcionSubMenu;
                do {
                    System.out.println("Seleccione el dato que desea actualizar:");
                    System.out.println("1- Nombre");
                    System.out.println("2- Duración");
                    System.out.println("3- Nivel de dificultad");
                    System.out.println("4- Descripción");
                    System.out.println("5- Volver al menú principal");
                    System.out.println("");
                    System.out.println("Elija una opción:");
                    opcionMenu = leer.nextInt();
                    switch (opcionMenu) {
                        case 1:
                            System.out.print("Ingrese nombre: ");
                            rutinas.get(i).setNombre(leer.next());
                            break;
                        case 2:
                            System.out.print("Ingrese duración:");
                            rutinas.get(i).setDuracion(leer.nextInt());
                            break;
                        case 3:
                            do {
                                System.out.println("Ingrese nivel dificultad: ");
                                System.out.println("1- Fácil");
                                System.out.println("2- Medio");
                                System.out.println("3- Difícil");
                                System.out.println("");
                                System.out.println("Elija una opción:");
                                opcionSubMenu = leer.nextInt();
                                switch (opcionSubMenu) {
                                    case 1:
                                        rutinas.get(i).setNivelDificultad("Fácil");
                                        break;
                                    case 2:
                                        rutinas.get(i).setNivelDificultad("Medio");
                                        break;
                                    case 3:
                                        rutinas.get(i).setNivelDificultad("Difícil");
                                        break;
                                    default:
                                        System.out.println("Opción inválida.");
                                        break;
                                }
                            } while (opcionSubMenu != 1 && opcionSubMenu != 2 && opcionSubMenu != 3);
                            break;
                        case 4:
                            System.out.print("Ingrese descripción:");
                            rutinas.get(i).setDescripcion(leer.next());
                            break;
                        case 5:
                            System.out.println("Volviendo al menú princioal...");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;
                    }
                } while (opcionMenu != 5);
                break;
            }
        }
    }

    public void eliminarRutina(int id) {
        String delete;

        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id) {
                System.out.println("Advertencia: La rutina seleccionada será removida permanemente de la base de datos.");
                leer.nextLine();
                do {
                    System.out.println("Ingrese 'S' para continuar o 'N' para cancelar.");
                    delete = leer.next();
                    if (!delete.equalsIgnoreCase("S") && !delete.equalsIgnoreCase("N")) {
                        System.out.println("Opción inválida.");
                    }
                } while (!delete.equalsIgnoreCase("S") && !delete.equalsIgnoreCase("N"));
                if (delete.equalsIgnoreCase("S")) {
                    rutinas.remove(i);
                    System.out.println("Se ha eliminado la rutina de la base de datos.");
                }
                break;
            }
        }
    }

    public void buscarRutina(int id) {
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id) {
                System.out.println(rutinas.get(i).toString());
                break;
            }
        }
    }

    public boolean rutinasVacia() {
        return rutinas.isEmpty();
    }

    public boolean noEstaId(int id) {

        int contador = 0;

        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() != id) {
                contador++;
            }
        }

        return contador == rutinas.size();
    }

    public boolean idRepetido(int id) {

        boolean bandera = false;

        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id) {
                bandera = true;
                break;
            }
        }
        return bandera;
    }

}
