package pruebasUnitarias;

import Controller.MascotaController;
import Model.Mascota;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MascotaControllerTest {
    public MascotaControllerTest() {
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
     * Test of obtenerMascotaById method, of class MascotaController.
     */
    @Test
    public void testObtenerMascotaById() {
        System.out.println("obtenerMascotaById");
        int id = 6;
        MascotaController instance = new MascotaController();
        String expResult = "Max";
        String result = instance.obtenerMascotaById(id).getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertarMascota method, of class MascotaController.
     */
    @Test
    public void testInsertarMascota() {
        System.out.println("insertarMascota");
        Mascota masc = new Mascota("Tiberius", "Doberman", 5, 1,1);
        MascotaController mascota = new MascotaController();
        assertTrue(mascota.insertarMascota(masc));
    }

    /**
     * Test of eliminarMascota method, of class MascotaController.
     */
    @Test
    public void testEliminarMascota() {
        System.out.println("eliminarMascota");
        int id = 0;
        MascotaController mascota = new MascotaController();
        assertFalse(mascota.eliminarMascota(id));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarMascota method, of class MascotaController.
     */
    @Test
    public void testActualizarMascota() {
        System.out.println("actualizarMascota");
        Mascota masc = new Mascota("Tiberius", "Criollo", 5, 1,1);
        int id = 0;
        MascotaController mascota = new MascotaController();
        assertFalse(mascota.actualizarMascota(masc, id));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMascotas method, of class MascotaController.
     */
    @Test
    public void testObtenerMascotas() {
        Mascota masc = new Mascota("Ruffo", "Criollo", 15, 1,1);
        System.out.println("ObtenerMascotas");
        MascotaController instance = new MascotaController();
        String result = masc.getName();
        Mascota nameBD = instance.obtenerMascotas().getFirst();
        String expResult = nameBD.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
