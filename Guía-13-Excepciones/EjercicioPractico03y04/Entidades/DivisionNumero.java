package Entidades;

public class DivisionNumero {
 
    public void division(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("No es posible dividir por cero.");
            }
            int resultado = a / b;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            throw e;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }

}
