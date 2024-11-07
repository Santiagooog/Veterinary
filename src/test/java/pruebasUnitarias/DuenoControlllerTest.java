package pruebasUnitarias;

import Controller.DuenoController;
import Model.Dueno;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DuenoControlllerTest {
    public void DuenoControllerTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of obtenerDuenoById method, of class DuenoController.
     */
    @Test
    public void testObtenerDuenoById() {
        System.out.println("obtenerDuenoById");
        int id = 1;
        DuenoController instance = new DuenoController();
        String expResult = "Pepita";
        String result = instance.obtenerDuenoById(id).getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertarDueno method, of class DuenoController.
     */
    @Test
    public void testInsertarDueno() {
        System.out.println("insertarDueno");
        Dueno dueno = new Dueno("Lupita Hernandez", 30, "Cra9#1945", "145646","lupi@gmail.com");
        DuenoController duenoCon = new DuenoController();
        assertTrue(duenoCon.insertarDueno(dueno));
    }

    /**
     * Test of eliminarDueno method, of class DuenoController.
     */
    @Test
    public void testEliminarDueno() {
        System.out.println("eliminarDueno");
        int id = 0;
        DuenoController dueno = new DuenoController();
        assertFalse(dueno.eliminarDueno(id));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarDueno method, of class DuenoController.
     */
    @Test
    public void testActualizarDueno() {
        System.out.println("actualizarDueno");
        Dueno dueno = new Dueno("Lupita Hernandez Gomez", 30, "Cra9#1945", "145646","lupi@gmail.com");
        int id = 0;
        DuenoController duenoCon = new DuenoController();
        assertFalse(duenoCon.actualizarDueno(dueno, id));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerDuenos method, of class DuenoController.
     */
    @Test
    public void testObtenerDuenos() {
        Dueno dueno = new Dueno("Pepita", 30, "Cra7#1851", "454784","pepita@yahoo.com");
        System.out.println("ObtenerMascotas");
        DuenoController instance = new DuenoController();
        String result = dueno.getName();
        Dueno nameBD = instance.obtenerDuenos().getFirst();
        String expResult = nameBD.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
