/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejextrajunit02.PalindromeChecker;
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
public class TestEjExtraJUnit02 {
    
    public TestEjExtraJUnit02() {
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
    public void testIsPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("otto"));
        assertTrue(PalindromeChecker.isPalindrome("ab ba"));
        assertTrue(PalindromeChecker.isPalindrome("@n@"));
    }
    
    @Test
    public void testIsNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("cristina"));
        assertFalse(PalindromeChecker.isPalindrome("ray ar"));
    }
}
