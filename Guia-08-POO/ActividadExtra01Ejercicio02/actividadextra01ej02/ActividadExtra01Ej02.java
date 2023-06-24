/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra01ej02;

import Entidad.FiguraGeometrica;
import Service.FiguraGeometricaService;

/**
 *
 * @author crist
 */
public class ActividadExtra01Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FiguraGeometricaService figuraGeometricaService = new FiguraGeometricaService();
        FiguraGeometrica figura = figuraGeometricaService.crearFigura();
        figuraGeometricaService.calcularSuperficie(figura);
        figuraGeometricaService.calcularPerimetro(figura);
    }

}
