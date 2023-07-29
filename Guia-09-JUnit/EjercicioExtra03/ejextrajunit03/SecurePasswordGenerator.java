/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrajunit03;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author crist
 */
public class SecurePasswordGenerator {

    public static String passwordGenerator() {

        Random minMaxNumber = new Random();
        int length = minMaxNumber.nextInt(12 - 8 + 1) + 8;
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "@!#$%&";
        String password = "";

        for (int i = 0; i < length; i++) {
            int rand = (int) (5 * Math.random());

            switch (rand) {
                case 0:
                    password += String.valueOf((int) (0 * Math.random()));
                    break;
                case 1:
                    password += String.valueOf(upper.charAt((int) (upper.length() * Math.random())));
                    break;
                case 2:
                    password += String.valueOf(lower.charAt((int) (lower.length() * Math.random())));
                    break;
                case 3:
                    password += String.valueOf(numbers.charAt((int) (numbers.length() * Math.random())));
                    break;
                case 4:
                    password += String.valueOf(specialChars.charAt((int) (specialChars.length() * Math.random())));
                    break;
            }
        }

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$%&])(?=\\S+$).{8,12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            return password;
        } else {
            return passwordGenerator();
        }

    }
}

