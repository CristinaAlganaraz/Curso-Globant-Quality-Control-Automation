/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CodigosPostalesService {
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private HashMap<Integer, String> codigosPostales = new HashMap();

    public void cargarCodigoPostalCiudad() {
        System.out.println("Ingrese el código postal:");
        int codigoPostal = leer.nextInt();
        System.out.println("Ingrese el nombre de la ciudad:");
        String ciudad = leer.next();
        agregarCodigoPostalCiudad(codigoPostal, ciudad);
    }

    public void agregarCodigoPostalCiudad(Integer codigoPostal, String ciudad) {
        codigosPostales.put(codigoPostal, ciudad);
    }

    public HashMap<Integer, String> listarCodigosPostales() {
        return codigosPostales;
    }

    public void mostrarCodigoPostalCiudad() {
        if (codigosPostales.isEmpty()) {
            System.out.println("No hay datos para mostrar.");
        } else {
            for (Map.Entry<Integer, String> entry : codigosPostales.entrySet()) {
                System.out.println("- Código postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
            }
        }
    }

    public void buscarCiudadPorCodigoPostal() {
        if (codigosPostales.isEmpty()) {
            System.out.println("No hay datos para mostrar.");
        } else {
            System.out.println("Ingrese el código postal de la ciudad a buscar: ");
            int codigoPostal = leer.nextInt();
            boolean existe = true;
            for (Map.Entry<Integer, String> entry : codigosPostales.entrySet()) {
                if (entry.getKey().equals(codigoPostal)) {
                    System.out.println("La ciudad asociada al código postal " + codigoPostal + " es: " + entry.getValue());
                    existe = false;
                    break;
                }
            }
            if (existe) {
                System.out.println("No se encontró el código postal ingresado.");
            }
        }
    }

    public void eliminarCodigoPostalCiudad() {
        if (listarCodigosPostales().isEmpty()) {
            System.out.println("No hay datos para mostrar.");
        } else {
            System.out.println("Ingrese el código postal de la ciudad a eliminar: ");
            int codigoPostal = leer.nextInt();
            if (listarCodigosPostales().containsKey(codigoPostal)) {
                listarCodigosPostales().remove(codigoPostal);
                System.out.println("Se ha eliminado el código postal y la ciudad asociada.");
            } else {
                System.out.println("No se encontró el código postal ingresado.");
            }
        }
    }

    public void modificarCiudad() {
        if (listarCodigosPostales().isEmpty()) {
            System.out.println("No hay datos para mostrar.");
        } else {
            System.out.println("Ingrese el código postal de la ciudad a modificar: ");
            int codigoPostal = leer.nextInt();
            if (listarCodigosPostales().containsKey(codigoPostal)) {
                System.out.println("Ingrese el nombre de la ciudad: ");
                String ciudad = leer.next();
                listarCodigosPostales().put(codigoPostal, ciudad);
            } else {
                System.out.println("No se encontró el código postal ingresado.");
            }
        }
    }
}
