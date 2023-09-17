package ejextraherencia04;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalDeServicio;
import Entidades.Profesor;
import Enumeraciones.Curso;
import Enumeraciones.Departamento;
import Enumeraciones.EstadoCivil;
import Enumeraciones.Seccion;
import Servicios.SistemaGestionFacultad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EjExtraHerencia04 {
    
    public static void main(String[] args) {
        ArrayList<Persona> personas = instanciarPersonas();
        Scanner leer = new Scanner(System.in);
        SistemaGestionFacultad service = new SistemaGestionFacultad();
        int opcion, id;
        do {
            System.out.println("::::::::::::: SISTEMA GESTIÓN FACULTAD :::::::::::::");
            System.out.println("");
            System.out.println("Menú de opciones:");
            System.out.println("");
            System.out.println("1- Cambiar estado civil de una persona");
            System.out.println("2- Reasignar despacho a un empleado");
            System.out.println("3- Matricular estudiante a un nuevo curso");
            System.out.println("4- Cambiar de departamento a un profesor");
            System.out.println("5- Trasladar de sección a un empleado del personal de servicio");
            System.out.println("6- Mostrar información de estudiantes");
            System.out.println("7- Mostrar información de profesores");
            System.out.println("8- Mostrar información de personal de servicio");
            System.out.println("9- Salir del sistema");
            System.out.println("");
            System.out.println("Elija una opción:");
            System.out.println("");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el ID de la persona que desea cambiar el estado civil:");
                    id = leer.nextInt();
                    if (!service.existeID(id, personas)) {
                        System.out.println("No se ha encontrado el ID ingresado en la base de datos.");
                    } else {
                        service.cambiarEstadoCivil(id, personas);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el ID del/la empleado/a que desea reasignarle el despacho:");
                    id = leer.nextInt();
                    if (!service.existeID(id, personas)) {
                        System.out.println("No se ha encontrado el ID ingresado en la base de datos.");
                    } else {
                        service.reasignarDespacho(id, personas);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el ID del/la estudiante que desea matricular a un nuevo curso:");
                    id = leer.nextInt();
                    if (!service.existeID(id, personas)) {
                        System.out.println("No se ha encontrado el ID ingresado en la base de datos.");
                    } else {
                        service.matricularNuevoCurso(id, personas);
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el ID del/la profesor/a que desea cambiar de departamento:");
                    id = leer.nextInt();
                    if (!service.existeID(id, personas)) {
                        System.out.println("No se ha encontrado el ID ingresado en la base de datos.");
                    } else {
                        service.cambiarDepartamento(id, personas);
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el ID del personal de servicio que desea trasladar de sección:");
                    id = leer.nextInt();
                    if (!service.existeID(id, personas)) {
                        System.out.println("No se ha encontrado el ID ingresado en la base de datos.");
                    } else {
                        service.trasladarDeSeccion(id, personas);
                    }
                    break;
                case 6:
                    service.mostrarDatosEstudiantes(personas);
                    break;
                case 7:
                    service.mostrarDatosProfesores(personas);
                    break;
                case 8:
                    service.mostrarDatosPersonalDeServicio(personas);
                    break;
                case 9:
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;                
            }
        } while (opcion != 9);
    }
    
    public static ArrayList<Persona> instanciarPersonas() {
        List<Integer> id = generarIDS(10);
        ArrayList<Persona> personas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            List<String> nombres = Arrays.asList("Cristina", "Jorge", "Natalia", "Eugenia", "Ivan", "Sebastián", "Esteban", "Pedro", "Sofía", "Candela", "Nahuel", "José", "Víctor", "Carla", "Ludmila");
            List<String> apellidos = Arrays.asList("Rodriguez", "Pérez", "Gómez", "Sánchez", "Barría", "Castillo", "López", "Contreras", "Rojas", "Díaz", "Ferrero", "Mansilla", "Oyarzo", "Giráoz");
            List<Persona> tipoPersonas = new ArrayList<>();
            Estudiante estudiante = new Estudiante();
            Profesor profesor = new Profesor();
            PersonalDeServicio personalDeServicio = new PersonalDeServicio();
            tipoPersonas.add(estudiante);
            tipoPersonas.add(profesor);
            tipoPersonas.add(personalDeServicio);
            Persona persona = tipoPersonas.get(random.nextInt(tipoPersonas.size()));
            persona.setNombre(nombres.get(random.nextInt(nombres.size())));
            persona.setApellido(apellidos.get(random.nextInt(apellidos.size())));
            persona.setId(id.get(i));
            EstadoCivil estadoCivil = EstadoCivil.values()[new Random().nextInt(EstadoCivil.values().length)];
            persona.setEstadoCivil(estadoCivil);
            personas.add(persona);
        }

        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                ArrayList<Curso> cursos = new ArrayList<>();
                Curso curso = Curso.values()[new Random().nextInt(Curso.values().length)];
                cursos.add(curso);
                ((Estudiante) persona).setCurso(cursos);
            }
            if (persona instanceof Empleado) {
                int anioIngreso = (int) ((Math.random() * (2023 - 1995)) + 1995);
                ((Empleado) persona).setAnioIngreso(anioIngreso);
                int nroDespacho = (int) ((Math.random() * (15 - 1)) + 1);
                ((Empleado) persona).setNumeroDespacho(nroDespacho);
                if (persona instanceof Profesor) {
                    Departamento departamento = Departamento.values()[new Random().nextInt(Departamento.values().length)];
                    ((Profesor) persona).setDepartamento(departamento);
                }
                if (persona instanceof PersonalDeServicio) {
                    Seccion seccion = Seccion.values()[new Random().nextInt(Seccion.values().length)];
                    ((PersonalDeServicio) persona).setSeccion(seccion);
                }
            }
        }

        return personas;
    }

    public static ArrayList<Integer> generarIDS(int cantidad) {
        ArrayList<Integer> ids = new ArrayList<>();
        Random random = new Random();
        int id;

        for (int i = 0; i < cantidad; i++) {
            do {
                id = (int) ((Math.random() * (59999999 - 10999999)) + 10999999);
            } while (ids.contains(id));
            ids.add(id);
        }
        return ids;
    }
}
