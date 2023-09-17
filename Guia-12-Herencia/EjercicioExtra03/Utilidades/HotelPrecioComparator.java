package Utilidades;

import Entidades.Hotel;
import java.util.Comparator;

public class HotelPrecioComparator {
     public static Comparator<Hotel> ordenarPrecioDescendiente = (Hotel a, Hotel b) -> Double.compare(b.getPrecio(),a.getPrecio());  
}
