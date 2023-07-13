/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;
import Entidad.Ahorcado;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author crist
 */
public class AhorcadoService {

    private Ahorcado ahorcado = new Ahorcado();
    private Scanner leer = new Scanner(System.in);
    private ArrayList<String> listaLetraEncontrada = new ArrayList<>();

    public void crearJuego() {
        System.out.println("Ingrese la palabra a buscar:");
        String palabra = leer.next().toUpperCase();
        String[] palabraABuscar = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraABuscar[i] = palabra.substring(i, i + 1);
        }
        ahorcado.setPalabraABuscar(palabraABuscar);

        System.out.println("Ingrese la cantidad de jugadas máximas:");
        ahorcado.setCantidadJugadasMaximas(leer.nextInt());

        ahorcado.setCantidadLetrasEncontradas(0);

        String[] mostrarAvance = new String[ahorcado.getPalabraABuscar().length];
        Arrays.fill(mostrarAvance, "_ ");
        ahorcado.setMostrarAvance(mostrarAvance);
    }

    public void longitud() {
        System.out.println("Psst, acá va una pista... La palabra contiene " + ahorcado.getPalabraABuscar().length + " letra/s.");
    }

    public void buscar(String letra) {
        boolean bandera = false;

        for (String palabraABuscar : ahorcado.getPalabraABuscar()) {
            listaLetraEncontrada.add(letra);
            if (palabraABuscar.equals(letra)) {
                bandera = true;
            }
        }

        if (bandera) {
            System.out.println("Se encontró la letra '" + letra + "' en la palabra :-)");
        } else {
            System.out.println("No se encontró la letra '" + letra + "' en la palabra :-(");
        }
    }

    public void encontradas(String letra) {

        boolean bandera = false;

        int contador = 0;

        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            if (ahorcado.getPalabraABuscar()[i].equals(letra)) {
                ahorcado.getMostrarAvance()[i] = ahorcado.getPalabraABuscar()[i];
                contador++;
                bandera = true;
            }
        }

        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            System.out.print(ahorcado.getMostrarAvance()[i]);
        }
        System.out.println("");

        if (bandera) {
            ahorcado.setCantidadLetrasEncontradas(ahorcado.getCantidadLetrasEncontradas() + contador);
        } else {
            ahorcado.setCantidadJugadasMaximas(ahorcado.getCantidadJugadasMaximas() - 1);
        }

        if (contador > 0) {
            System.out.println("La letra '" + letra + "' está en la palabra " + contador + " vez/veces.");
        } else if (intentos() == 0) {
            System.out.println("");
            System.out.println("¡Agotaste todos los intentos! ");
        } else {
            System.out.println("Te queda/n " + intentos() + " intento/s :-/");
        }
        System.out.println("Letras encontradas: " + ahorcado.getCantidadLetrasEncontradas());
        System.out.println("Letras pendientes de encontrar: " + (ahorcado.getPalabraABuscar().length - ahorcado.getCantidadLetrasEncontradas()));
    }

    public int intentos() {
        return ahorcado.getCantidadJugadasMaximas();
    }

    public void juego() {

        String letra;
        crearJuego();
        longitud();
        do {
            do {
                System.out.println("--------------------------------------------------------------");
                System.out.println("Ingrese una letra a buscar:");
                letra = leer.next().toUpperCase();

                if (listaLetraEncontrada.contains(letra)) {
                    System.out.println("La letra ya fue ingresada.");
                }
            } while (listaLetraEncontrada.contains(letra));
            buscar(letra);
            encontradas(letra);
            if (intentos() == 0) {
                System.out.print("La palabra secreta era: ");
                for (String palabraABuscar : ahorcado.getPalabraABuscar()) {
                    System.out.print(palabraABuscar);
                }
                System.out.println("");
            }
        } while (ahorcado.getCantidadLetrasEncontradas() != ahorcado.getPalabraABuscar().length && intentos() > 0);

        if (ahorcado.getCantidadLetrasEncontradas() == ahorcado.getPalabraABuscar().length) {
            System.out.println("");
            System.out.println("Felicitaciones, ¡adivinaste la palabra!");
        }
    }
}
