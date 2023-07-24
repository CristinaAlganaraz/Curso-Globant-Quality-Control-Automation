/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejjunit01.DiscountCalculator;
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
public class TestEjJUnit01 {
    
    public TestEjJUnit01() {
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
    public void testAllowedDiscount() {
       assertEquals(212.5,DiscountCalculator.calculateDiscount(250, 15),0.1);
       assertEquals(66.9933,DiscountCalculator.calculateDiscount(99.99, 33),0.1);
       assertEquals(501.6,DiscountCalculator.calculateDiscount(1254, 60),0.1);      
    }
    
    @Test
    public void testNotAllowedDiscount() {
        try {
            DiscountCalculator.calculateDiscount(128900, 9);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Descuento mínimo permitido: 10%" + '\n'
                    + "Descuento máximo permitido: 65%");
        } catch (Throwable t) {
            fail("Expected an IllegalArgumentException to be thrown");
        }

        try {
            DiscountCalculator.calculateDiscount(32075, 87);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Descuento mínimo permitido: 10%" + '\n'
                    + "Descuento máximo permitido: 65%");
        } catch (Throwable t) {
            fail("Expected an IllegalArgumentException to be thrown");
        }
    }
    
    @Test
    public void testMaxDiscount() {
        assertEquals(210681, DiscountCalculator.calculateDiscount(234090, 10), 0.1);
    }

    @Test
    public void testMinDiscount() {
        assertEquals(15148, DiscountCalculator.calculateDiscount(43280, 65), 0.1);
    }
    
    @Test
    public void noDiscount() {
        assertEquals(342367.56, DiscountCalculator.calculateDiscount(342367.56, 0), 0.1);
    }
}
