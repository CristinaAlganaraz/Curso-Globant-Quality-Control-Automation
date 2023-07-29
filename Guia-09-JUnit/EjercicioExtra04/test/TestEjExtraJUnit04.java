/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejextrajunit04.TextAnalyzer;
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
public class TestEjExtraJUnit04 {
    
    public TestEjExtraJUnit04() {
    }
    
    TextAnalyzer textAnalyzer;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        textAnalyzer = new TextAnalyzer();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTextAnalyzerLetterCount() {
        assertEquals(4,textAnalyzer.letterCount("hola"));
        assertEquals(7,textAnalyzer.letterCount("CÚSPIDE"));
        assertTrue(textAnalyzer.letterCount("h0l@") == 2);
        assertTrue(textAnalyzer.letterCount("Hola, ¡cómo estás?") == 13);
        assertTrue(textAnalyzer.letterCount("12345 %&/($") == 0);
    }
    
    @Test
    public void textAnalyzerDigitCount() {
        assertEquals(6, textAnalyzer.digitCount("123456"));
        assertEquals(0, textAnalyzer.digitCount("KLAPAUCIUS"));
        assertEquals(8, textAnalyzer.digitCount("1234 abcd 5678"));
        assertTrue(textAnalyzer.digitCount("11111") == 5);
    }
    
    @Test
    public void textAnalyzerSpaceCount() {
        assertEquals(0, textAnalyzer.spaceCount("SoyCristina"));
        assertEquals(5, textAnalyzer.spaceCount("palabra palabra palabra palabra palabra "));
    }
    
    @Test
    public void textAnalyzerSpecialCharacterCount() {
        assertEquals(12, textAnalyzer.specialCharacterCount("$#%&-_=)/¡+*"));
        assertEquals(5, textAnalyzer.specialCharacterCount("Y&r /% 34(h9)"));
        assertTrue(textAnalyzer.specialCharacterCount("Esta frase no contiene caracteres especiales") == 0);
    }

}
