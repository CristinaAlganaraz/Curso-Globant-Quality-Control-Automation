/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejextrajunit01.RandomNumberGenerator;
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
public class TestEjExtraJUnit01 {
    
    public TestEjExtraJUnit01() {
    }
    
    RandomNumberGenerator randomNumberGenerator;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        randomNumberGenerator = new RandomNumberGenerator();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testRandomNumberGenerator() {
        int number1 = randomNumberGenerator.generateRandomNumber();
        System.out.println(number1);
        assertTrue(number1 >= 3 && number1 <= 8);
        assertFalse(number1 < 3);
        assertFalse(number1 > 8);

        int number2 = randomNumberGenerator.generateRandomNumber();
        System.out.println(number2);
        assertTrue(number2 >= 3 && number1 <= 8);
        assertFalse(number2 < 3);
        assertFalse(number2 > 8);
        
        int number3 = randomNumberGenerator.generateRandomNumber();
        System.out.println(number3);
        assertTrue(number3 >= 3 && number1 <= 8);
        assertFalse(number3 < 3);
        assertFalse(number3 > 8);        
    }
}
