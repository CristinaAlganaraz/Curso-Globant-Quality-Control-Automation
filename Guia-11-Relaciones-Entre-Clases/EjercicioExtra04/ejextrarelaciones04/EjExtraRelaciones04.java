/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrarelaciones04;

import Entidades.Alumno;
import Entidades.Voto;
import Servicios.Simulador;
import java.util.List;

/**
 *
 * @author crist
 */
public class EjExtraRelaciones04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador sv = new Simulador();
        List<Alumno> alumnos = sv.generarAlumnos(12);

        System.out.println(">>>>>>>>>>>>>>>>>>>>> ALUMNOS:");
        System.out.println("");
        alumnos.forEach((alumno) -> {
            System.out.println("Nombre: " + alumno.getNombre() + ", DNI: " + alumno.getDni());
        });
        System.out.println("");
        if (alumnos.size() <= 3) {
            System.out.println("Cantidad insuficiente de alumnos para realizar la votación.");
        } else {
            List<Voto> votacion = sv.votacion(alumnos);
            System.out.println(">>>>>>>>>>>>>>>>>>>>> MOSTRAR VOTOS:");
            System.out.println("");
            sv.mostrarVotantesVotos(alumnos, votacion);
            System.out.println("");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>  RECUENTO DE VOTOS:");
            System.out.println("");
            sv.recuentoVotos(alumnos);
            System.out.println("");
            System.out.println(">>>>>>>>>>>>>>>>>>>>> FACILITADORES:");
            System.out.println("");
            if (alumnos.size() < 10) {
                System.out.println("Cantidad de alumnos insuficientes para designar 5 facilitadores titulares + 5 facilitadores suplentes.");
            } else {
                sv.designarFacilitadores(alumnos);
            }
        }
    }
}
