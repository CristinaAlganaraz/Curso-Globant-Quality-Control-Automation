/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejjunit01;

/**
 *
 * @author crist
 */
public class DiscountCalculator {

    public static double calculateDiscount(double price, double discount) {
        int maxDiscount = 65;
        int minDiscount = 10;

        if (discount == 0) {
            return price;
        }

        if (discount < minDiscount || discount > maxDiscount) {
            throw new IllegalArgumentException("Descuento mínimo permitido: 10%" + '\n'
                    + "Descuento máximo permitido: 65%");
        }

        return price - (price * (discount / 100));
    }
}
