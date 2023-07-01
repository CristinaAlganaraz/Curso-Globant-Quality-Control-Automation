/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CursoService {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private Curso curso = new Curso();

    public String[] cargarAlumnos() {

        String[] alumnos = new String[5];

        for (int i = 0; i < alumnos.length; i++) {

            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            alumnos[i] = leer.next();
        }

        return alumnos;
    }

    public Curso crearCurso() {

        String turno;
        int dias;
        double horas;

        System.out.println("Ingrese el nombre del curso:");
        curso.setNombreCurso(leer.next());

        leer.nextLine();

        do {
            System.out.println("Indique la cantidad de horas que trabaja por día:");
            horas = leer.nextDouble();
            if (horas > 24) {
                System.out.println("La cantidad de horas trabajadas por día no puede superar las 24 hs.");
            }
        } while (horas > 24);

        curso.setCantidadHorasPorDia(horas);

        leer.nextLine();

        do {
            System.out.println("Ingrese la cantidad de días que trabaja por semana:");
            dias = leer.nextInt();
            if (dias > 7) {
                System.out.println("La cantidad de días trabajados por semana no puede ser mayor a 7.");
            }
        } while (dias > 7);

        curso.setCantidadDiasPorSemana(dias);

        leer.nextLine();

        do {
            System.out.println("Indique el turno de dictado de clases (mañana o tarde):");
            turno = leer.next();
            if (!turno.equalsIgnoreCase("MAÑANA") && !turno.equalsIgnoreCase("TARDE")) {
                System.out.println("Opción inválida.");
            }
        } while (!turno.equalsIgnoreCase("MAÑANA") && !turno.equalsIgnoreCase("TARDE"));

        curso.setTurno(turno);

        System.out.println("Especifique el valor por hora:");
        curso.setPrecioPorHora(leer.nextDouble());

        curso.setAlumnos(cargarAlumnos());

        return curso;

    }

    public void calcularGananciaSemanal() {
        double gananciaSemanal = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length * curso.getCantidadDiasPorSemana();
        System.out.println("-----------------------------");
        System.out.println("Detalle de liquidación:");
        System.out.println("");
        System.out.println("Nombre del curso: " + curso.getNombreCurso());
        System.out.println("Cantidad de horas trabajadas diarias: " + curso.getCantidadHorasPorDia());
        System.out.println("Cantidad de días trabajados semanalmente: " + curso.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso.getTurno().toUpperCase());
        System.out.println("Precio por hora: $" + curso.getPrecioPorHora());
        System.out.println("Cantidad de alumnos: " + curso.getAlumnos().length);
        System.out.println("Nombres de los alumnos: ");
        System.out.println(Arrays.toString(curso.getAlumnos()));
        System.out.println("");
        System.out.println("La ganancia semanal es de un total de $" + gananciaSemanal);
    }

}
