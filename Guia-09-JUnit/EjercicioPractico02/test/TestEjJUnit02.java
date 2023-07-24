/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejjunit02.TemperatureConverter;
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
public class TestEjJUnit02 {

    public TestEjJUnit02() {
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
    public void testCelsiusToFahrenheit() {
        assertEquals(59,TemperatureConverter.celsiusToFahrenheit(15),0.1);
    }
    
    @Test
    public void testCelsiusToKelvin() {
        assertEquals(296.15, TemperatureConverter.celsiusToKelvin(23), 0.1);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(7.111111111, TemperatureConverter.fahrenheitToCelsius(44.8), 0.1);
    }

    @Test
    public void testFahrenheitToKelvin() {
        assertEquals(268.15, TemperatureConverter.fahrenheitToKelvin(23), 0.1);
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(1.85, TemperatureConverter.kelvinToCelsius(275), 0.1);
    }

    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(62.33, TemperatureConverter.kelvinToFahrenheit(290), 0.1);
    }
}
