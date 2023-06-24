/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.FiguraGeometrica;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class FiguraGeometricaService {
    
   
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public FiguraGeometrica crearFigura() {

        String figura;

        do {

            System.out.println("Elija la figura geométrica de la cual quiere conocer el área y perímetro:");
            System.out.println("");
            System.out.println("- CUADRADO");
            System.out.println("- RECTANGULO");
            System.out.println("- TRIANGULO");
            System.out.println("- CIRCULO");
            System.out.println("- HEXAGONO");
            System.out.println("- PENTAGONO");
            System.out.println("- ROMBO");
            System.out.println("");

            figura = leer.next();
            figura = figura.toUpperCase();

            switch (figura) {
                case "CUADRADO":
                    System.out.println("Indique la medida del lado:");
                    double lado = leer.nextDouble();
                    return new FiguraGeometrica(figura, lado, lado);
                case "RECTANGULO":
                    System.out.println("Indique la medida de la base:");
                    double baseRectangulo = leer.nextDouble();
                    System.out.println("Indique la medida de la altura:");
                    double alturaRectangulo = leer.nextDouble();
                    return new FiguraGeometrica(figura, baseRectangulo, alturaRectangulo);
                case "TRIANGULO":
                    System.out.println("Indique la medida del lado A:");
                    double ladoA = leer.nextDouble();
                    System.out.println("Indique la medida del lado B (base):");
                    double baseTriangulo = leer.nextDouble();
                    System.out.println("Indique la medida del lado C:");
                    double ladoC = leer.nextDouble();
                    System.out.println("Indique la medida de la altura:");
                    double alturaTriangulo = leer.nextDouble();
                    return new FiguraGeometrica(figura, baseTriangulo, alturaTriangulo, ladoA, ladoC);
                case "CIRCULO":
                    System.out.println("Indique la medida del radio:");
                    double radio = leer.nextDouble();
                    return new FiguraGeometrica(figura, radio);
                case "HEXAGONO":
                    System.out.println("Indique la medida del lado:");
                    double ladoHexagono = leer.nextDouble();
                    System.out.println("Indique la medida de la apotema:");
                    double apotemaHexagono = leer.nextDouble();
                    return new FiguraGeometrica(figura, ladoHexagono, apotemaHexagono);
                case "PENTAGONO":
                    System.out.println("Indique la medida del lado:");
                    double ladoPentagono = leer.nextDouble();
                    System.out.println("Indique la medida de la apotema:");
                    double apotemaPentagono = leer.nextDouble();
                    return new FiguraGeometrica(figura, ladoPentagono, apotemaPentagono);
                case "ROMBO":
                    System.out.println("Indique la medida de la diagonal mayor:");
                    double diagonalMayor = leer.nextDouble();
                    System.out.println("Indique la medida de la diagonal menor:");
                    double diagonalMenor = leer.nextDouble();
                    double ladoRombo = Math.sqrt(Math.pow((diagonalMayor/2), 2) + Math.pow((diagonalMenor/2), 2));
                    return new FiguraGeometrica(figura, ladoRombo, diagonalMayor, diagonalMenor);
                default:
                    System.out.println("Opción inválida.");
                    System.out.println("");
            }

        } while (!figura.equalsIgnoreCase("CUADRADO") && !figura.equalsIgnoreCase("RECTANGULO") && !figura.equalsIgnoreCase("TRIANGULO") && !figura.equalsIgnoreCase("CIRCULO") && !figura.equalsIgnoreCase("HEXAGONO") && !figura.equalsIgnoreCase("PENTAGONO") && !figura.equalsIgnoreCase("ROMBO"));

        return new FiguraGeometrica();

    }
    
    public void calcularSuperficie(FiguraGeometrica figura) {

        switch (figura.getFiguraGeometrica()) {
            case "CUADRADO":
                System.out.println("Área: " + Math.pow(figura.getBaseLado(), 2));
                break;
            case "RECTANGULO":
                System.out.println("Área: " + (figura.getAlturaApotema() * figura.getBaseLado()));
                break;
            case "TRIANGULO":
                System.out.println("Área: " + ((figura.getBaseLado() * figura.getAlturaApotema())/2));
                break;
            case "CIRCULO":
                System.out.println("Área: " + Math.PI * Math.pow(figura.getRadio(), 2));
                break;
            case "HEXAGONO":
                System.out.println("Área: " + 3 * figura.getBaseLado() * figura.getAlturaApotema());
                break;
            case "PENTAGONO":
                System.out.println("Área: " + (5 * figura.getBaseLado() * figura.getAlturaApotema()) / 2);
                break;
            case "ROMBO":
                System.out.println("Área: " + (figura.getDiagonalMayor() * figura.getDiagonalMenor()) / 2);
                break;
            default:
                System.out.println("Opción inválida.");

        }
  
    }

    public void calcularPerimetro(FiguraGeometrica figura) {

        switch (figura.getFiguraGeometrica()) {
            case "CUADRADO":
                System.out.println("Perímetro: " + (figura.getBaseLado() * 4));
                break;
            case "RECTANGULO":
                System.out.println("Perímetro: " + ((figura.getBaseLado() + figura.getAlturaApotema()) * 2));
                break;
            case "TRIANGULO":
                System.out.println("Perímetro: " + (figura.getLadoA() + figura.getBaseLado() + figura.getLadoC()));
                break;
            case "CIRCULO":
                System.out.println("Perímetro: " + (2 * Math.PI * figura.getRadio()));
                break;
            case "HEXAGONO":
                System.out.println("Perímetro: " + (figura.getBaseLado() * 6));
                break;
            case "PENTAGONO":
                System.out.println("Perímetro: " + (figura.getBaseLado() * 5));
                break;
            case "ROMBO":
                System.out.println("Perímetro: " + (figura.getBaseLado() * 4));
                break;
            default:
                System.out.println("Opción inválida.");

        }
    }
    
}
