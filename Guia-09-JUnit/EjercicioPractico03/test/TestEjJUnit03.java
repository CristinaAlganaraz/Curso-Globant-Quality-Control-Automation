/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejjunit03.PasswordValidator;
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
public class TestEjJUnit03 {
    
    public TestEjJUnit03() {
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
    public void testValidPasswords() {
        assertTrue(PasswordValidator.validPassword("Kl4p@ucius"));
        assertFalse(!PasswordValidator.validPassword("d3@THn0Te"));
        assertEquals(true, PasswordValidator.validPassword("n3mES^$$"));
    }

    @Test
    public void testInvalidPasswords() {
        assertEquals(false, PasswordValidator.validPassword(null));
        assertFalse(PasswordValidator.validPassword("Kl4p@ uci us")); //Contiene espacios, el método arroja falso porque no cumple con las expresiones  
        assertFalse(PasswordValidator.validPassword("klapaucius")); //No contiene números, caracteres especiales ni mayúsculas, el método arroja falso porque no cumple con las expresiones
        assertFalse(PasswordValidator.validPassword("KLAPAUCIUS")); //No contiene números, caracteres especiales ni minúsculas, el método arroja falso porque no cumple con las expresiones
        assertFalse(PasswordValidator.validPassword("@#$%^&+=")); //No contiene números, mayúsculas ni minúsculas, el método arroja falso porque no cumple con las expresiones
        assertFalse(PasswordValidator.validPassword("hola")); //No contiene números, mayúsculas y tiene menos de 8 caracteres, el método arroja falso porque no cumple con las expresiones
        assertFalse(PasswordValidator.validPassword("123456789012345678901")); //No contiene mayúsculas ni minúsculas y tiene más de 20 caracteres, el método arroja falso porque no cumple con las expresiones
        assertTrue(!PasswordValidator.validPassword("H0l@"));
    }
}
