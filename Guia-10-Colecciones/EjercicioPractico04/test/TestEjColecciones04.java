/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.Pelicula;
import Servicio.PeliculaService;
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
public class TestEjColecciones04 {

    public TestEjColecciones04() {
    }
    PeliculaService ps;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ps = new PeliculaService();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testNoHayPeliculas() {
        assertTrue(ps.noHayPeliculas());
        Pelicula pelicula = new Pelicula("Avatar", "James Cameron", 3);
        ps.agregarPelicula(pelicula);
        assertFalse(ps.noHayPeliculas());
    }

    @Test
    public void testAgregarPelicula() {
        Pelicula pelicula1 = new Pelicula("Inception", "Christopher Nolan", 3);
        Pelicula pelicula2 = new Pelicula("Pulp Fiction", "Quentin Tarantino", 2);
        Pelicula pelicula3 = new Pelicula("Se7en", "David Fincher", 1);
        ps.agregarPelicula(pelicula1);
        ps.agregarPelicula(pelicula2);
        ps.agregarPelicula(pelicula3);
        assertTrue(ps.listarPeliculas().get(0).getTitulo() == "Inception");
        assertEquals("Pulp Fiction", ps.listarPeliculas().get(1).getTitulo());
        assertEquals("Se7en", ps.listarPeliculas().get(2).getTitulo());
        assertTrue(ps.listarPeliculas().get(0).getDirector() == "Christopher Nolan");
        assertEquals("Quentin Tarantino", ps.listarPeliculas().get(1).getDirector());
        assertEquals("David Fincher", ps.listarPeliculas().get(2).getDirector());
        assertTrue(ps.listarPeliculas().get(0).getDuracion() == 3);
        assertEquals(2, ps.listarPeliculas().get(1).getDuracion());
        assertEquals(1, ps.listarPeliculas().get(2).getDuracion());
    }

    @Test
    public void ordenarPeliculasPorTitulo() {
        Pelicula pelicula1 = new Pelicula("Pulp Fiction", "Quentin Tarantino", 2);
        Pelicula pelicula2 = new Pelicula("Inception", "Christopher Nolan", 3);
        Pelicula pelicula3 = new Pelicula("AVATAR", "James Cameron", 3);
        Pelicula pelicula4 = new Pelicula("Se7en", "David Fincher", 1);
        ps.agregarPelicula(pelicula1);
        ps.agregarPelicula(pelicula2);
        ps.agregarPelicula(pelicula3);
        ps.agregarPelicula(pelicula4);
        ps.listarPeliculasPorTitulo();
        assertEquals("AVATAR", ps.listarPeliculas().get(0).getTitulo());
        assertEquals("Inception", ps.listarPeliculas().get(1).getTitulo());
        assertEquals("Pulp Fiction", ps.listarPeliculas().get(2).getTitulo());
        assertEquals("Se7en", ps.listarPeliculas().get(3).getTitulo());
    }

    @Test
    public void ordenarPeliculasPorDirector() {
        Pelicula pelicula1 = new Pelicula("Pulp Fiction", "Quentin Tarantino", 2);
        Pelicula pelicula2 = new Pelicula("Inception", "Christopher Nolan", 3);
        Pelicula pelicula3 = new Pelicula("Se7en", "David Fincher", 1);
        Pelicula pelicula4 = new Pelicula("Se7en", "DISNEY", 1);
        ps.agregarPelicula(pelicula1);
        ps.agregarPelicula(pelicula2);
        ps.agregarPelicula(pelicula3);
        ps.agregarPelicula(pelicula4);
        ps.listarPeliculasPorDirector();
        assertEquals("Christopher Nolan", ps.listarPeliculas().get(0).getDirector());
        assertEquals("David Fincher", ps.listarPeliculas().get(1).getDirector());
        assertEquals("DISNEY", ps.listarPeliculas().get(2).getDirector());
        assertEquals("Quentin Tarantino", ps.listarPeliculas().get(3).getDirector());
    }

    @Test
    public void ordenarPeliculasPorDuracionAscendente() {
        Pelicula pelicula1 = new Pelicula("Pulp Fiction", "Quentin Tarantino", 2);
        Pelicula pelicula2 = new Pelicula("Inception", "Christopher Nolan", 3);
        Pelicula pelicula3 = new Pelicula("Se7en", "David Fincher", 1);
        ps.agregarPelicula(pelicula1);
        ps.agregarPelicula(pelicula2);
        ps.agregarPelicula(pelicula3);
        ps.listarPeliculasPorDuracionAscendente();
        assertEquals(1, ps.listarPeliculas().get(0).getDuracion());
        assertEquals(2, ps.listarPeliculas().get(1).getDuracion());
        assertEquals(3, ps.listarPeliculas().get(2).getDuracion());
    }

    @Test
    public void ordenarPeliculasPorDuracionDescendente() {
        Pelicula pelicula1 = new Pelicula("Pulp Fiction", "Quentin Tarantino", 2);
        Pelicula pelicula2 = new Pelicula("Inception", "Christopher Nolan", 3);
        Pelicula pelicula3 = new Pelicula("Se7en", "David Fincher", 1);
        ps.agregarPelicula(pelicula1);
        ps.agregarPelicula(pelicula2);
        ps.agregarPelicula(pelicula3);
        ps.listarPeliculasPorDuracionDescendente();
        assertEquals(3, ps.listarPeliculas().get(0).getDuracion());
        assertEquals(2, ps.listarPeliculas().get(1).getDuracion());
        assertEquals(1, ps.listarPeliculas().get(2).getDuracion());
    }
}
