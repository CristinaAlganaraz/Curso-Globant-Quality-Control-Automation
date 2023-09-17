package Servicios;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Residencia;
import Utilidades.HotelPrecioComparator;
import java.util.ArrayList;
import java.util.Collections;

public class Service {

    public void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.toString());
            System.out.println("-----------------------------------------------------------------");
        }
    }

    public void mostrarHotelPrecioDescendente(ArrayList<Alojamiento> alojamientos) {
        ArrayList<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        Collections.sort(hoteles, HotelPrecioComparator.ordenarPrecioDescendiente);

        for (Hotel hotel : hoteles) {
            System.out.println(hotel.toString());
            System.out.println("-----------------------------------------------------------------");
        }
    }

    public void mostrarCampingsConRestaurante(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                if (((Camping) alojamiento).isRestaurante()) {
                    System.out.println(((Camping) alojamiento).toString());
                    System.out.println("-----------------------------------------------------------------");
                }
            }
        }
    }

    public void mostrarResidenciasConDescuento(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                if (((Residencia) alojamiento).isDescuentoGremios()) {
                    System.out.println(((Residencia) alojamiento).toString());
                    System.out.println("-----------------------------------------------------------------");
                }
            }
        }
    }
}
