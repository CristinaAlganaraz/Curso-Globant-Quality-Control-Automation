/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Pais;
import java.util.Comparator;

/**
 *
 * @author crist
 */
public class PaisComparator {

    public static Comparator<Pais> ordenarAlfabeticamente = new Comparator<Pais>() {

        @Override
        public int compare(Pais a, Pais b) {
            return a.getNombre().compareTo(b.getNombre());
        }
    };
}
