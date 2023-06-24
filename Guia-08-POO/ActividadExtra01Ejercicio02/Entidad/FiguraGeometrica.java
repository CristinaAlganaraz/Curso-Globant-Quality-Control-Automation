/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author crist
 */
public class FiguraGeometrica {
    
    private String figuraGeometrica;
    private double baseLado;
    private double alturaApotema;
    private double ladoA;
    private double ladoC;
    private double radio;
    private double diagonalMayor;
    private double diagonalMenor;

    public FiguraGeometrica() {
    }
    
    //Constructor para la figura geométrica cuadrado, rectángulo, hexágono y pentágono

    public FiguraGeometrica(String figuraGeometrica, double baseLado, double alturaApotema) {
        this.figuraGeometrica = figuraGeometrica;
        this.baseLado = baseLado;
        this.alturaApotema = alturaApotema;
    }
    
     //Constructor para la figura geométrica triangulo

    public FiguraGeometrica(String figuraGeometrica, double baseLado, double alturaApotema, double ladoA, double ladoC) {
        this.figuraGeometrica = figuraGeometrica;
        this.baseLado = baseLado;
        this.alturaApotema = alturaApotema;
        this.ladoA = ladoA;
        this.ladoC = ladoC;
    }
   
     //Constructor para la figura geométrica circulo
    
    public FiguraGeometrica(String figuraGeometrica, double radio) {
        this.figuraGeometrica = figuraGeometrica;
        this.radio = radio;
    }
    
    //Constructor para la figura geométrica rombo

    public FiguraGeometrica(String figuraGeometrica, double baseLado, double diagonalMayor, double diagonalMenor) {
        this.figuraGeometrica = figuraGeometrica;
        this.baseLado = baseLado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public String getFiguraGeometrica() {
        return figuraGeometrica;
    }

    public void setFiguraGeometrica(String figuraGeometrica) {
        this.figuraGeometrica = figuraGeometrica;
    }

    public double getBaseLado() {
        return baseLado;
    }

    public void setBaseLado(double baseLado) {
        this.baseLado = baseLado;
    }

    public double getAlturaApotema() {
        return alturaApotema;
    }

    public void setAlturaApotema(double alturaApotema) {
        this.alturaApotema = alturaApotema;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    
}
