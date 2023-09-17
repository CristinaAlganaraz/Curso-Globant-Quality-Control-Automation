package Servicios;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalDeServicio;
import Entidades.Profesor;
import Enumeraciones.Curso;
import Enumeraciones.Departamento;
import Enumeraciones.EstadoCivil;
import Enumeraciones.Seccion;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGestionFacultad {

    Scanner leer = new Scanner(System.in);

    public void cambiarEstadoCivil(int id, ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            if (persona.getId() == id) {
                System.out.println("1- Soltero/a");
                System.out.println("2- Casado/a");
                System.out.println("3- Divorciado/a");
                System.out.println("");
                System.out.println("Elija una opción: ");
                System.out.println("");
                int opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        if (persona.getEstadoCivil().equals(EstadoCivil.SINGLE)) {
                            System.out.println("El estado civil seleccionado es el mismo que ya tiene asignado la persona.");
                        } else {
                            persona.setEstadoCivil(EstadoCivil.SINGLE);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    case 2:
                        if (persona.getEstadoCivil().equals(EstadoCivil.MARRIED)) {
                            System.out.println("El estado civil seleccionado es el mismo que ya tiene asignado la persona.");
                        } else {
                            persona.setEstadoCivil(EstadoCivil.MARRIED);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    case 3:
                        if (persona.getEstadoCivil().equals(EstadoCivil.DIVORCED)) {
                            System.out.println("El estado civil seleccionado es el mismo que ya tiene asignado la persona.");
                        } else {
                            persona.setEstadoCivil(EstadoCivil.DIVORCED);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                        break;
                }
            }
        }
    }

    public void reasignarDespacho(int id, ArrayList<Persona> personas) {
        boolean bandera = false;
        for (Persona persona : personas) {
            if (persona instanceof Empleado && persona.getId() == id) {
                System.out.println("Ingrese nuevo número de despacho:");
                int numeroDespacho = leer.nextInt();
                if ((numeroDespacho < 1 || numeroDespacho > 15) || ((Empleado) persona).getNumeroDespacho() == numeroDespacho) {
                    if (numeroDespacho < 1 || numeroDespacho > 15) {
                        System.out.println("El número de despacho debe ser entre 1 a 15.");
                    } else {
                        System.out.println("El número de despacho no debe ser el mismo al ya asignado.");
                    }
                } else {
                    ((Empleado) persona).setNumeroDespacho(numeroDespacho);
                    System.out.println("Se han actualizado los datos.");
                    break;
                }
                bandera = true;
            }
        }

        if (!bandera) {
            System.out.println("La persona a la que desea reasignar de despacho no es un empleado.");
        }
    }

    public void matricularNuevoCurso(int id, ArrayList<Persona> personas) {
        boolean bandera = false;
        for (Persona persona : personas) {
            if (persona instanceof Estudiante && persona.getId() == id) {
                System.out.println("1- Literatura");
                System.out.println("2- Álgebra");
                System.out.println("3- Programación");
                System.out.println("4- Comunicación");
                System.out.println("5- Biología");
                System.out.println("");
                System.out.println("Elija una opción: ");
                System.out.println("");
                int opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        if (((Estudiante) persona).getCurso().contains(Curso.LITERATURA)) {
                            System.out.println("El/La estudiante ya se encuentra matriculado en el curso seleccionado.");
                        } else {
                            ((Estudiante) persona).getCurso().add(Curso.LITERATURA);
                            System.out.println("Se ha matriculado correctamente al curso.");
                        }
                        break;
                    case 2:
                        if (((Estudiante) persona).getCurso().contains(Curso.ALGEBRA)) {
                            System.out.println("El/La estudiante ya se encuentra matriculado en el curso seleccionado.");
                        } else {
                            ((Estudiante) persona).getCurso().add(Curso.ALGEBRA);
                            System.out.println("Se ha matriculado correctamente al curso.");
                        }
                        break;
                    case 3:
                        if (((Estudiante) persona).getCurso().contains(Curso.PROGRAMACION)) {
                            System.out.println("El/La estudiante ya se encuentra matriculado en el curso seleccionado.");
                        } else {
                            ((Estudiante) persona).getCurso().add(Curso.PROGRAMACION);
                            System.out.println("Se ha matriculado correctamente al curso.");
                        }
                        break;
                    case 4:
                        if (((Estudiante) persona).getCurso().contains(Curso.COMUNICACION)) {
                            System.out.println("El/La estudiante ya se encuentra matriculado en el curso seleccionado.");
                        } else {
                            ((Estudiante) persona).getCurso().add(Curso.COMUNICACION);
                            System.out.println("Se ha matriculado correctamente al curso.");
                        }
                        break;
                    case 5:
                        if (((Estudiante) persona).getCurso().contains(Curso.BIOLOGIA)) {
                            System.out.println("El/La estudiante ya se encuentra matriculado en el curso seleccionado.");
                        } else {
                            ((Estudiante) persona).getCurso().add(Curso.BIOLOGIA);
                            System.out.println("Se ha matriculado correctamente al curso.");
                        }
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                        break;
                }
                bandera = true;
            }
        }

        if (!bandera) {
            System.out.println("La persona a la que desea matricular a un nuevo curso no es estudiante.");
        }
    }

    public void cambiarDepartamento(int id, ArrayList<Persona> personas) {
        boolean bandera = false;
        for (Persona persona : personas) {
            if (persona instanceof Profesor && persona.getId() == id) {
                System.out.println("1- Ingeniería");
                System.out.println("2- Letras");
                System.out.println("3- Filosofía");
                System.out.println("4- Arquitectura");
                System.out.println("5- Derecho");
                System.out.println("");
                System.out.println("Elija una opción: ");
                System.out.println("");
                int opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        if (((Profesor) persona).getDepartamento().equals(Departamento.INGENIERIA)) {
                            System.out.println("El/La profesor/a ya se encuentra en el departamento seleccionado.");
                        } else {
                            ((Profesor) persona).setDepartamento(Departamento.INGENIERIA);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    case 2:
                        if (((Profesor) persona).getDepartamento().equals(Departamento.LETRAS)) {
                            System.out.println("El/La profesor/a ya se encuentra en el departamento seleccionado.");
                        } else {
                            ((Profesor) persona).setDepartamento(Departamento.LETRAS);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    case 3:
                        if (((Profesor) persona).getDepartamento().equals(Departamento.FILOSOFIA)) {
                            System.out.println("El/La profesor/a ya se encuentra en el departamento seleccionado.");
                        } else {
                            ((Profesor) persona).setDepartamento(Departamento.FILOSOFIA);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    case 4:
                        if (((Profesor) persona).getDepartamento().equals(Departamento.ARQUITECTURA)) {
                            System.out.println("El/La profesor/a ya se encuentra en el departamento seleccionado.");
                        } else {
                            ((Profesor) persona).setDepartamento(Departamento.ARQUITECTURA);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    case 5:
                        if (((Profesor) persona).getDepartamento().equals(Departamento.DERECHO)) {
                            System.out.println("El/La profesor/a ya se encuentra en el departamento seleccionado.");
                        } else {
                            ((Profesor) persona).setDepartamento(Departamento.DERECHO);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                        break;
                }
                bandera = true;
            }
        }

        if (!bandera) {
            System.out.println("La persona que desea cambiar de departamento no es profesor.");
        }
    }

    public void trasladarDeSeccion(int id, ArrayList<Persona> personas) {
        boolean bandera = false;
        for (Persona persona : personas) {
            if (persona instanceof PersonalDeServicio && persona.getId() == id) {
                System.out.println("1- Biblioteca");
                System.out.println("2- Decanato");
                System.out.println("3- Secretaría");
                System.out.println("4- Limpieza");
                System.out.println("5- Administración");
                System.out.println("");
                System.out.println("Elija una opción: ");
                System.out.println("");
                int opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        if (((PersonalDeServicio) persona).getSeccion().equals(Seccion.BIBLIOTECA)) {
                            System.out.println("El/La personal de servicio ya se encuentra en la sección seleccionada.");
                        } else {
                            ((PersonalDeServicio) persona).setSeccion(Seccion.BIBLIOTECA);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    case 2:
                        if (((PersonalDeServicio) persona).getSeccion().equals(Seccion.DECANATO)) {
                            System.out.println("El/La personal de servicio ya se encuentra en la sección seleccionada.");
                        } else {
                            ((PersonalDeServicio) persona).setSeccion(Seccion.DECANATO);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    case 3:
                        if (((PersonalDeServicio) persona).getSeccion().equals(Seccion.SECRETARIA)) {
                            System.out.println("El/La personal de servicio ya se encuentra en la sección seleccionada.");
                        } else {
                            ((PersonalDeServicio) persona).setSeccion(Seccion.SECRETARIA);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    case 4:
                        if (((PersonalDeServicio) persona).getSeccion().equals(Seccion.LIMPIEZA)) {
                            System.out.println("El/La personal de servicio ya se encuentra en la sección seleccionada.");
                        } else {
                            ((PersonalDeServicio) persona).setSeccion(Seccion.LIMPIEZA);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    case 5:
                        if (((PersonalDeServicio) persona).getSeccion().equals(Seccion.ADMINISTRACION)) {
                            System.out.println("El/La personal de servicio ya se encuentra en la sección seleccionada.");
                        } else {
                            ((PersonalDeServicio) persona).setSeccion(Seccion.ADMINISTRACION);
                            System.out.println("Se han actualizado los datos.");
                        }
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                        break;
                }
                bandera = true;
            }
        }

        if (!bandera) {
            System.out.println("La persona que desea trasladar de sección no es personal de servicio.");
        }
    }

    public void mostrarDatosEstudiantes(ArrayList<Persona> personas) {
        System.out.println("Estudiantes:");
        System.out.println("");
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                System.out.println(persona.toString());
                System.out.println("Cursos en los que está matriculado: " + ((Estudiante) persona).getCurso());
                System.out.println("------------------------------------------------");
            }
        }
    }

    public void mostrarDatosProfesores(ArrayList<Persona> personas) {
        System.out.println("Profesores:");
        System.out.println("");
        for (Persona persona : personas) {
            if (persona instanceof Profesor) {
                System.out.println(persona.toString());
                System.out.println("Año de ingreso: " + ((Profesor) persona).getAnioIngreso());
                System.out.println("Número de despacho: " + ((Profesor) persona).getNumeroDespacho());
                System.out.println("Departamento: " + ((Profesor) persona).getDepartamento());
                System.out.println("------------------------------------------------");
            }
        }
    }

    public void mostrarDatosPersonalDeServicio(ArrayList<Persona> personas) {
        System.out.println("Personal de servicio:");
        System.out.println("");
        for (Persona persona : personas) {
            if (persona instanceof PersonalDeServicio) {
                System.out.println(persona.toString());
                System.out.println("Año de ingreso: " + ((PersonalDeServicio) persona).getAnioIngreso());
                System.out.println("Número de despacho: " + ((PersonalDeServicio) persona).getNumeroDespacho());
                System.out.println("Sección: " + ((PersonalDeServicio) persona).getSeccion());
                System.out.println("------------------------------------------------");
            }
        }
    }

    public boolean existeID(int id, ArrayList<Persona> personas) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}
