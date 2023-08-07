/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.CantanteFamoso;
import java.util.Comparator;

/**
 *
 * @author crist
 */
public class CantanteFamosoComparator {
    public static Comparator<CantanteFamoso> ordenarCantantesAlfabeticamente = (CantanteFamoso a, CantanteFamoso b) -> a.getNombre().compareTo(b.getNombre());  
}
