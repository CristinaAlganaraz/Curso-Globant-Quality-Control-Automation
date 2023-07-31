/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Alquiler;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author crist
 */
public class AlquilerService {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Alquiler> alquileres = new ArrayList();
    private ArrayList<String> titulos = new ArrayList();

    public void crearAlquiler() {
        int diaI, mesI, anioI, diaF, mesF, anioF;
        System.out.println("Ingrese el título de la película que desea alquilar:");
        String titulo = leer.next();

        if (verificarExistenciaPelicula(titulo) && !verificarDisponible(titulo)) {
            System.out.println("Indique fecha de inicio del alquiler (DD/MM/AAAA):");
            System.out.println("Día:");
            diaI = leer.nextInt();
            System.out.println("Mes:");
            mesI = leer.nextInt();
            System.out.println("Año:");
            anioI = leer.nextInt();
            Date fechaInicio = new Date(anioI - 1900, mesI - 1, diaI);

            System.out.println("Indique fecha de fin del alquiler (DD/MM/AAAA):");
            System.out.println("Día:");
            diaF = leer.nextInt();
            System.out.println("Mes:");
            mesF = leer.nextInt();
            System.out.println("Año:");
            anioF = leer.nextInt();
            Date fechaFin = new Date(anioF - 1900, mesF - 1, diaF);

            double precio = precioTotalAlquiler(fechaInicio, fechaFin);

            System.out.println("El precio total del alquiler es: $" + precio);
            Alquiler alquiler = new Alquiler(titulo, fechaInicio, fechaFin, precio);
            agregarAlquiler(alquiler);
            Iterator<String> iterator = titulos.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equalsIgnoreCase(titulo)) {
                    iterator.remove();
                }
            }
        } else {
            System.out.println("No se encontró la película ingresada.");
        }
    }

    public boolean noHayAlquileres() {
        return alquileres.isEmpty();
    }

    public void agregarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public List<String> listaPeliculas(List<Pelicula> peliculas) {
        String titulo = "";
        for (int i = 0; i < peliculas.size(); i++) {
            titulo = peliculas.get(i).getTitulo();
            titulos.add(titulo);
        }
        return titulos;
    }

    public boolean verificarExistenciaPelicula(String titulo) {
        for (int i = 0; i < titulos.size(); i++) {
            if (titulos.get(i).equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarDisponible(String titulo) {
        for (int i = 0; i < alquileres.size(); i++) {
            if (alquileres.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }

    public void peliculasDisponiblesParaAlquilar() {
        for (int i = 0; i < titulos.size(); i++) {
            System.out.println("- " + titulos.get(i).toUpperCase());
        }
    }

    public static double precioTotalAlquiler(Date fechaInicio, Date fechaFinal) {

        long tiempoTranscurrido = fechaFinal.getTime() - fechaInicio.getTime();
        long dias = TimeUnit.DAYS.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
        double precio = 10;

        if (dias > 3) {
            precio = precio + ((precio * 0.1) * dias - 3);
        }
        return precio;
    }

    public void buscarAlquileresPorFecha() {
        int aux = 0, diaI, mesI, anioI;
        System.out.println("Ingrese la fecha de inicio del alquiler (DD/MM/AAAA): ");
        System.out.println("Día:");
        diaI = leer.nextInt();
        System.out.println("Mes:");
        mesI = leer.nextInt();
        System.out.println("Año:");
        anioI = leer.nextInt();
        Date fecha = new Date(anioI - 1900, mesI - 1, diaI);

        for (int i = 0; i < alquileres.size(); i++) {
            if (alquileres.get(i).getFechaInicio().equals(fecha)) {
                System.out.println("Se ha encontrado el alquiler:");
                mostrarDatosAlquiler(alquileres.get(i));
                aux++;
                break;
            }
        }
        if (aux == 0) {
            System.out.println("No se ha encontrado el alquiler.");
        }
    }

    public void mostrarPeliculasAlquiladas() {
        for (int i = 0; i < alquileres.size(); i++) {
            System.out.println("- " + alquileres.get(i).getTitulo().toUpperCase());
        }
    }

    public void mostrarDatosAlquiler(Alquiler alquiler) {
        System.out.println("-----------------------------");
        System.out.println(alquiler.toString().toUpperCase());
        System.out.println("-----------------------------");
    }

}
