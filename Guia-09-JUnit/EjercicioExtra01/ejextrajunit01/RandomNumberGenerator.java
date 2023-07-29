/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrajunit01;

import java.util.Random;

/**
 *
 * @author crist
 */
public class RandomNumberGenerator {

    public int generateRandomNumber() {

        Random rand = new Random();
        int max = 8;
        int min = 3;

        return rand.nextInt(max - min + 1) + min;
    }

}
