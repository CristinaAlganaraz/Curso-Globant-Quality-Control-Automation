/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejjunit05;

import java.time.DateTimeException;
import java.time.LocalDate;

/**
 *
 * @author crist
 */
public class DateValidator {

    public static boolean isDateValid(int year, int month, int day) {
        try {
            LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            return false;
        }
        return true;
    }

}
