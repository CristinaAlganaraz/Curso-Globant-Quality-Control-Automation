/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.Pais;
import Servicio.PaisService;
import Utilidades.PaisComparator;
import java.util.ArrayList;
import java.util.Collections;
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
public class TestEjColecciones05 {
    
    public TestEjColecciones05() {
    }
    PaisService ps;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ps = new PaisService();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testListarPaises() {
        ps.agregarPais(new Pais("Argentina"));
        ps.agregarPais(new Pais("Argentina"));
        Pais pais = new Pais("Uruguay");
        ps.agregarPais(pais);
        assertFalse(ps.listarPaises().isEmpty());
        assertTrue(ps.listarPaises().contains(pais));
        assertTrue(ps.listarPaises().size() == 2);
    }
    
    @Test
    public void testEliminarPais() {
        ps.agregarPais(new Pais("Perú"));
        ps.eliminarPais("Perú");
        assertTrue(ps.listarPaises().isEmpty());
    }
}
