package Entidades;

import Interfaces.ValidadorFechas;
import static Interfaces.ValidadorFechas.MAX_VALID_YR;
import static Interfaces.ValidadorFechas.MIN_VALID_YR;
import static Interfaces.ValidadorFechas.esBisiesto;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Alquiler implements ValidadorFechas {
    private String nombreCliente;
    private int dni;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posicion;
    private Barco barco;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicion, Barco barco, double precio) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicion = posicion;
        this.barco = barco;
        this.precio = precio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public Alquiler crearAlquiler(ArrayList<Barco> barcos, int i) {
        Scanner leer = new Scanner(System.in);
        Alquiler alquiler = new Alquiler();
        
        System.out.println("Ingrese su nombre:");
        alquiler.setNombreCliente(leer.next());

        System.out.println("Ingrese su DNI:");
        alquiler.setDni(leer.nextInt());

              int diaA, diaD, mesA, mesD, anioA, anioD;
        LocalDate fechaA = null, fechaD = null;
        
        do {
            System.out.println("Ingrese la fecha de inicio del alquiler:");
            System.out.print("Día: ");
            diaA = leer.nextInt();
            System.out.print("Mes: ");
            mesA = leer.nextInt();
            System.out.print("Año: ");
            anioA = leer.nextInt();
            if (!esFechaValida(diaA, mesA, anioA)) {
                System.out.println("La fecha ingresada es incorrecta. Intente nuevamente.");
                System.out.println("");
            } else {
                fechaA = LocalDate.of(anioA, Month.of(mesA), diaA);
                alquiler.setFechaAlquiler(fechaA);
            }
        } while (!esFechaValida(diaA, mesA, anioA));
    
        do {
            do {
                System.out.println("Indique la fecha de devolución:");
                System.out.print("Día: ");
                diaD = leer.nextInt();
                System.out.print("Mes: ");
                mesD = leer.nextInt();
                System.out.print("Año: ");
                anioD = leer.nextInt();
                if (!esFechaValida(diaD, mesD, anioD)) {
                    System.out.println("La fecha ingresada es incorrecta. Intente nuevamente.");
                    System.out.println("");
                } else {
                    fechaD = LocalDate.of(anioD, Month.of(mesD), diaD);
                    alquiler.setFechaDevolucion(fechaD);
                }
            } while (!esFechaValida(diaD, mesD, anioD));
            if (ChronoUnit.DAYS.between(fechaA, fechaD) < 0) {
                System.out.println("La fecha de devolución no puede ser anterior a la fecha de alquiler.");
                System.out.println("");
            }
        } while (ChronoUnit.DAYS.between(fechaA, fechaD) < 0);     

        System.out.println("Indique la posición del amarre:");
        alquiler.setPosicion(leer.next());

        alquiler.setBarco(barcos.get(i));        

        double price = alquiler.precioAlquiler(barcos.get(i));
        alquiler.setPrecio(price);

        return alquiler;
    }
    
    public static boolean esFechaValida(int dia, int mes, int anio) {
        if (anio > MAX_VALID_YR || anio < MIN_VALID_YR) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes == 2) {
            if (esBisiesto(anio)) {
                return (dia <= 29);
            } else {
                return (dia <= 28);
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return (dia <= 30);
        }
        return true;
    }
    
    public long cantidadDias() {
        long cantidadDias = ChronoUnit.DAYS.between(getFechaAlquiler(), getFechaDevolucion());
        return cantidadDias;
    }

    public double precioAlquiler(Barco barco) {        
        return cantidadDias() * barco.calcularModulo();
    }

    @Override
    public String toString() {
        return "Alquiler{" + "Nombre del cliente: " + nombreCliente + ", DNI: " + dni + ", Fecha inicio alquiler: " + fechaAlquiler + ", Fecha devolución: " + fechaDevolucion + ", Posición: " + posicion + ", Precio: $" + precio + ", Barco: " + barco + '}';
    }
}
