/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejjunit04.TaskManager;
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
public class TestEjJUnit04 {
    
    public TestEjJUnit04() {
    }
    
    TaskManager tm;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tm = new TaskManager();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddTask() {
        tm.addTask("Ir a la peluquería");
        tm.addTask("Comprar detergente");
        assertTrue(tm.listTasks().size() > 0);
        assertTrue(tm.listTasks().size() == 2);
        assertTrue(tm.listTasks().contains("Ir a la peluquería"));
        assertFalse(!tm.listTasks().contains("Comprar detergente"));
        assertEquals(2, tm.listTasks().size());
    }

    @Test
    public void testRemoveTask() {
        tm.addTask("Pagar la tarjeta");
        tm.addTask("Cumpleaños de Melina");
        tm.removeTask("Pagar la tarjeta");
        assertTrue(!tm.listTasks().contains("Pagar la tarjeta"));
        assertEquals(1, tm.listTasks().size());
        tm.removeTask("Cumpleaños de Melina");
        assertTrue(tm.listTasks().isEmpty());
    }

    @Test
    public void testListTaks() {
        assertTrue(tm.listTasks().isEmpty());
        tm.addTask("Llevar el auto al taller");
        tm.addTask("Dormir siesta");
        assertTrue(!tm.listTasks().isEmpty());
        assertTrue(tm.listTasks().contains("Llevar el auto al taller"));
        assertNotNull(tm.listTasks());
        assertEquals("Dormir siesta", tm.listTasks().get(1));
        assertTrue(tm.listTasks().size() == 2);
    }
}
