/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejextrajunit03.SecurePasswordGenerator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crist
 */
public class TestEjExtraJUnit03 {

    public TestEjExtraJUnit03() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPasswordLength() {
        String password = SecurePasswordGenerator.passwordGenerator();
        System.out.println(password + " tiene entre 8 y 12 caracteres.");
        assertTrue(password.length() >= 8 && password.length() <= 12);
    }

    @Test
    public void testIfPasswordHasUpperCaseChars() {
        String upper = "^(?=.*[A-Z]).{8,12}$";
        Pattern pattern = Pattern.compile(upper);
        String password = SecurePasswordGenerator.passwordGenerator();
        System.out.println(password + " tiene al menos una letra mayúscula.");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.matches());
    }

    @Test
    public void testIfPasswordHasLowerCaseChars() {
        String lower = "^(?=.*[a-z]).{8,12}$";
        Pattern pattern = Pattern.compile(lower);
        String password = SecurePasswordGenerator.passwordGenerator();
        System.out.println(password + " tiene al menos una letra minúscula.");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.matches());
    }

    @Test
    public void testIfPasswordHasSpecialChars() {
        String specialChars = "^(?=.*[@!#$%&]).{8,12}$";
        Pattern pattern = Pattern.compile(specialChars);
        String password = SecurePasswordGenerator.passwordGenerator();
        System.out.println(password + " tiene al menos un caracter especial.");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.matches());
    }

    @Test
    public void testIfPasswordHasNumbers() {
        String numbers = "^(?=.*[0-9]).{8,12}$";
        Pattern pattern = Pattern.compile(numbers);
        String password = SecurePasswordGenerator.passwordGenerator();
        System.out.println(password + " tiene al menos un número.");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.matches());
    }

    @Test
    public void testIfPasswordHasntSpaces() {
        String spaces = "^(?=\\S+$).{8,12}$";
        Pattern pattern = Pattern.compile(spaces);
        String password = SecurePasswordGenerator.passwordGenerator();
        System.out.println(password + " no tiene espacios entre los caracteres.");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.matches());
    }

    @Test
    public void testIfPasswordHasAllTheExpressions() {
        String characters = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$%&])(?=\\S+$).{8,12}$";
        Pattern pattern = Pattern.compile(characters);
        String password = SecurePasswordGenerator.passwordGenerator();
        System.out.println(password + " tiene entre 8 a 12 caracteres, al menos una letra mayúscula y miníscula, un número, un caracter especial y no contiene espacios.");
        Matcher matcher = pattern.matcher(password);
        assertTrue(matcher.matches());
    }
}
