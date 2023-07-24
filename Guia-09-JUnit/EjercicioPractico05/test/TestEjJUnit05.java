/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejjunit05.DateValidator;
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
public class TestEjJUnit05 {
    
    public TestEjJUnit05() {
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
    public void testValidDates() {
        assertTrue(DateValidator.isDateValid(1998, 5, 31));
        assertTrue(DateValidator.isDateValid(2020, 2, 29));
        assertTrue(DateValidator.isDateValid(2024, 2, 29));
        assertTrue(DateValidator.isDateValid(2123, 10, 1));
    }

    @Test
    public void testInvalidDates() {
        assertFalse(DateValidator.isDateValid(2023, 4, 31));
        assertFalse(DateValidator.isDateValid(2023, 6, 31));
        assertFalse(DateValidator.isDateValid(2023, 9, 31));
        assertFalse(DateValidator.isDateValid(2023, 11, 31));
        assertFalse(DateValidator.isDateValid(2023, 2, 29));
        assertFalse(DateValidator.isDateValid(2023, 2, 30));
        assertFalse(DateValidator.isDateValid(2023, 18, 12));
        assertFalse(DateValidator.isDateValid(2023, 6, 0));
        assertFalse(DateValidator.isDateValid(2023, 9, 45));
    }
}
