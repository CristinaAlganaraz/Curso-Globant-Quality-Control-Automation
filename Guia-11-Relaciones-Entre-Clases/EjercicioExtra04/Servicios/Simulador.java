/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import Entidades.Voto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author crist
 */
public class Simulador {

    private List<String> generarNombresCompletos(int cantidad) {
        List<String> nombres = Arrays.asList("Cristina", "Jorge", "Natalia", "Eugenia", "Ivan", "Sebastián", "Esteban", "Pedro", "Sofía", "Candela", "Nahuel", "José", "Víctor", "Carla", "Ludmila");
        List<String> apellidos = Arrays.asList("Rodriguez", "Pérez", "Gómez", "Sánchez", "Barría", "Castillo", "López", "Contreras", "Rojas", "Díaz", "Ferrero", "Mansilla", "Oyarzo", "Giráoz");
        List<String> alumnos = new ArrayList<>();
        Random random = new Random();
        String nombreCompleto;

        for (int i = 0; i < cantidad; i++) {
            nombreCompleto = nombres.get(random.nextInt(nombres.size())) + " " + apellidos.get(random.nextInt(apellidos.size()));
            alumnos.add(nombreCompleto);
        }
        return alumnos;
    }

    private List<String> generarDNIS(int cantidad) {
        List<String> dnis = new ArrayList<>();
        Random random = new Random();
        String dni;

        for (int i = 0; i < cantidad; i++) {
            do {
                dni = String.format("%08d", random.nextInt(99_999_999));
            } while (verificarDNI(dni, dnis));
            dnis.add(dni);
        }
        return dnis;
    }

    public List<Alumno> generarAlumnos(int cantidad) {
        List<String> nombreCompleto = generarNombresCompletos(cantidad);
        List<String> dni = generarDNIS(cantidad);
        List<Alumno> alumnos = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            Alumno alumno = new Alumno();
            alumno.setNombre(nombreCompleto.get(i));
            alumno.setDni(Integer.parseInt(String.valueOf(dni.get(i))));
            alumnos.add(alumno);
        }
        return alumnos;
    }

    private boolean verificarDNI(String dni, List<String> dnis) {
        return dnis.contains(dni);
    }

    public List<Voto> votacion(List<Alumno> alumnos) {
        Random random = new Random();
        List<Voto> votosTotales = new ArrayList<>();
        for (Alumno alumno : alumnos) {
            Voto voto = new Voto();
            voto.setAlumnoVotante(alumno);
            Set<Alumno> alumnosVotados = new HashSet<>();
            while (alumnosVotados.size() < 3) {
                Alumno alumnoVotado = alumnos.get(random.nextInt(alumnos.size()));
                if (alumnoVotado != alumno && !alumnosVotados.contains(alumnoVotado)) {
                    alumnosVotados.add(alumnoVotado);
                    voto.setAlumnosVotados(alumnosVotados);
                    alumnoVotado.setVotos(alumnoVotado.getVotos() + 1);
                }
            }
            votosTotales.add(voto);
        }
        return votosTotales;
    }

    public void mostrarVotantesVotos(List<Alumno> alumnos, List<Voto> votos) {
        int contador = 0;

        for (Alumno alumno : alumnos) {
            System.out.println("El/La alumno/a " + alumno.getNombre() + ":");
            for (int i = 0; i < votos.size(); i++) {
                if (votos.get(i).getAlumnoVotante() == alumno) {
                    System.out.println("Voto a: " + votos.get(i).getAlumnosVotados());
                }
            }
            System.out.println("Y recibió: " + alumno.getVotos() + " voto/s.");
            System.out.println("");
        }

    }

    public void recuentoVotos(List<Alumno> alumnos) {
        int contador = 0;
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombre() + ", Votos recibidos: " + alumno.getVotos());
            contador = contador + alumno.getVotos();
        }
        System.out.println("");
        System.out.println("Total de votos: " + contador);
        System.out.println("");
        alumnos.sort(Comparator.comparingInt(Alumno::getVotos).reversed());
        System.out.println("Votos ordenados de mayor a menor:");
        System.out.println("");
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombre() + ", Votos recibidos: " + alumno.getVotos());
            contador = contador + alumno.getVotos();
        }
    }

    public void designarFacilitadores(List<Alumno> alumnos) {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                if (i == 0) {
                    System.out.println("Facilitadores titulares:");
                    System.out.println("");
                }
                System.out.println(alumnos.get(i).getNombre() + "(" + alumnos.get(i).getVotos() + ")");
            } else {
                if (i == 5) {
                    System.out.println("");
                    System.out.println("Facilitadores suplentes:");
                    System.out.println("");
                }
                System.out.println(alumnos.get(i).getNombre() + "(" + alumnos.get(i).getVotos() + ")");
            }
        }
    }
}
