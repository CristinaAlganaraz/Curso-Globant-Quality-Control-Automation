/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextrajunit04;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author crist
 */
public class TextAnalyzer {

    public int letterCount(String text) {
        int counter = 0;
        char character;

        for (int i = 0; i < text.length(); i++) {
            character = text.charAt(i);
            if (Character.isLetter(character)) {
                counter++;
            }
        }
        return counter;
    }

    public int digitCount(String text) {
        int counter = 0;
        char character;

        for (int i = 0; i < text.length(); i++) {
            character = text.charAt(i);
            if (Character.isDigit(character)) {
                counter++;
            }
        }
        return counter;
    }

    public int spaceCount(String text) {
        int counter = 0;
        char character;

        for (int i = 0; i < text.length(); i++) {
            character = text.charAt(i);
            if (Character.isWhitespace(character)) {
                counter++;
            }
        }
        return counter;
    }

    public int specialCharacterCount(String text) {
        int counter = 0;
        char character;

        for (int i = 0; i < text.length(); i++) {
            character = text.charAt(i);
            if (!Character.isLetter(character) && !Character.isDigit(character) && !Character.isWhitespace(character)) {
                counter++;
            }
        }
        return counter;
    }

}
