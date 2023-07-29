/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.Alumno;
import Servicio.AlumnoService;
import java.util.ArrayList;
import java.util.List;
import static java.util.Optional.empty;
import static org.hamcrest.CoreMatchers.hasItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crist
 */
public class TestEjColecciones03 {

    public TestEjColecciones03() {
    }
    AlumnoService as;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        as = new AlumnoService();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAgregarAlumno() {
        List<Alumno> alumnos = new ArrayList();
        assertTrue(alumnos.isEmpty());
        List<Integer> notas = new ArrayList();
        notas.add(10);
        Alumno alumno1 = new Alumno("Cristina", notas);
        as.agregarAlumno(alumno1);
        assertThat(as.listarAlumnos(), is(not(empty())));
        assertEquals("Cristina", as.listarAlumnos().get(0).getNombre());
        assertThat(as.listarAlumnos().get(0).getNotas(), hasItem(10));
        Alumno alumno2 = new Alumno("Tamara");
        as.agregarAlumno(alumno2);
        assertTrue(as.listarAlumnos().get(1).getNombre().equals("Tamara"));
        assertTrue(as.listarAlumnos().contains(alumno1) && as.listarAlumnos().contains(alumno2));
    }

    @Test
    public void testOrdenDescendenteListarAlumnos() {
        List<Alumno> alumnos = new ArrayList();
        as.agregarAlumno(new Alumno("walter"));
        as.agregarAlumno(new Alumno("Leonor"));
        as.agregarAlumno(new Alumno("Cristina"));
        as.agregarAlumno(new Alumno("ZULEMA"));
        as.agregarAlumno(new Alumno("ANITA"));
        as.agregarAlumno(new Alumno("analía"));
        assertEquals("analía", as.listarAlumnos().get(0).getNombre());
        assertEquals("ANITA", as.listarAlumnos().get(1).getNombre());
        assertEquals("Cristina", as.listarAlumnos().get(2).getNombre());
        assertEquals("Leonor", as.listarAlumnos().get(3).getNombre());
        assertEquals("walter", as.listarAlumnos().get(4).getNombre());
        assertEquals("ZULEMA", as.listarAlumnos().get(5).getNombre());
    }

    @Test
    public void testBuscarAlumnoTrue() {
        List<Alumno> alumnos = new ArrayList();
        Alumno alumno1 = new Alumno("Laura");
        as.agregarAlumno(alumno1);
        Alumno alumno2 = new Alumno("Florencia");
        as.agregarAlumno(alumno2);
        assertTrue(as.buscarAlumno("LAURA"));
        assertTrue(as.buscarAlumno("florencia"));
        assertTrue(as.listarAlumnos().stream().anyMatch(Alumno -> Alumno.getNombre().equals("Florencia")));
        assertTrue(as.listarAlumnos().stream().anyMatch(Alumno -> Alumno.getNombre().equals("Laura")));
    }

    @Test
    public void testBuscarAlumnoFalse() {
        List<Alumno> alumnos = new ArrayList();
        Alumno alumno1 = new Alumno("Pepe");
        as.agregarAlumno(alumno1);
        Alumno alumno2 = new Alumno("Lalo");
        as.agregarAlumno(alumno2);
        Alumno alumno3 = new Alumno("Antonio");
        assertFalse(as.buscarAlumno("Antonio"));
        assertFalse(as.listarAlumnos().stream().anyMatch(Alumno -> Alumno.getNombre().equals("José")));
        assertFalse(as.listarAlumnos().stream().anyMatch(Alumno -> Alumno.getNombre().equals("Andrea")));
    }

    @Test
    public void testNotaFinal() {
        List<Alumno> alumnos = new ArrayList();

        List<Integer> notas1 = new ArrayList();
        notas1.add(5);
        notas1.add(9);
        notas1.add(3);
        Alumno alumno1 = new Alumno("Laura", notas1);
        as.agregarAlumno(alumno1);
        assertEquals(5, as.notaFinal("Laura"));

        List<Integer> notas2 = new ArrayList();
        notas2.add(8);
        notas2.add(9);
        notas2.add(10);
        Alumno alumno2 = new Alumno("Cristina", notas2);
        as.agregarAlumno(alumno2);
        assertEquals(9, as.notaFinal("Cristina"), 0);

        List<Integer> notas3 = new ArrayList();
        notas3.add(0);
        notas3.add(0);
        notas3.add(0);
        Alumno alumno3 = new Alumno("Leonor", notas3);
        as.agregarAlumno(alumno3);
        assertEquals(0, as.notaFinal("Leonor"), 0);
    }

}
