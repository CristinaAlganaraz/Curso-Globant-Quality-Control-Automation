/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class MovilService {

    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private Movil movil = new Movil();

    public Movil cargarCelular() {

        System.out.println("Marca:");
        String marca = leer.next();
        movil.setMarca(marca);

        System.out.println("Modelo:");
        String modelo = leer.next();
        movil.setModelo(modelo);

        System.out.println("Memoria RAM:");
        int memoriaRam = leer.nextInt();
        movil.setMemoriaRam(memoriaRam);

        System.out.println("Capacidad de almacenamiento:");
        int almacenamiento = leer.nextInt();
        movil.setAlmacenamiento(almacenamiento);

        System.out.println("Precio:");
        double precio = leer.nextDouble();
        movil.setPrecio(precio);

        int[] codigo = ingresarCodigo();
        movil.setCodigo(codigo);

        return new Movil(marca, modelo, memoriaRam, almacenamiento, precio, codigo);
    }

    public int[] ingresarCodigo() {

        String code;

        do {
            System.out.println("Ingrese el código del producto:");
            code = leer.next();
            if (code.length() != 7) {
                System.out.println("El código debe tener 7 dígitos.");
            }
        } while (code.length() != 7);

        int[] codigo = new int[7];

        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = Character.getNumericValue(code.charAt(i));
            if (i == codigo.length) {
                break;
            }
        }
        return codigo;
    }

    public void actualizarPrecio(Movil movil) {
        System.out.println("Ingrese el nuevo precio:");
        double precio = leer.nextDouble();
        movil.setPrecio(precio);
    }

    public void mostrarDatos(Movil movil) {
        System.out.println("-----------------------------------------------------------");
        System.out.println(movil.toString());
        System.out.println("-----------------------------------------------------------");
    }
}
