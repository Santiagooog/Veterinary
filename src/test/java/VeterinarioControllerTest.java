import Controller.VeterinarioController;
import Model.Dueno;
import Model.Veterinario;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeterinarioControllerTest {
    public VeterinarioControllerTest() {
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
     * Test of obtenerVeterinarios method, of class VeterinarioController.
     */
    @Test
    public void testObtenerVeterinarios() {
        List<Veterinario> listaVet = new ArrayList<>();
        Veterinario vet = new Veterinario(1,"Santiago Gomez", 22, "CRA5#185c21", "3246715510","ABC12345");
        listaVet.add(vet);

        System.out.println("obtenerVeterinarios");
        VeterinarioController instance = new VeterinarioController();
        String result = vet.getName();
        Veterinario nameBD = instance.obtenerVeterinarios().getFirst();
        System.out.println(nameBD);
        String expResult = nameBD.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerVeterinarioById method, of class VeterinarioController.
     */
    @Test
    public void testObtenerVeterinarioById() {
        System.out.println("obtenerVeterinarioById");
        int id = 1;
        VeterinarioController instance = new VeterinarioController();
        String expResult = "Santiago Gomez";
        String result = instance.obtenerVeterinarioById(id).getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertarVeterinario method, of class VeterinarioController.
     */
    @Test
    public void testInsertarVeterinario() {
        System.out.println("insertarVeterinario");
        Veterinario vet = null;
        VeterinarioController instance = new VeterinarioController();
        instance.insertarVeterinario(vet);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarVeterinario method, of class VeterinarioController.
     */
    @Test
    public void testEliminarVeterinario() {
        System.out.println("eliminarVeterinario");
        int id = 0;
        VeterinarioController instance = new VeterinarioController();
        instance.eliminarVeterinario(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarVeterinario method, of class VeterinarioController.
     */
    @Test
    public void testActualizarVeterinario() {
        System.out.println("actualizarVeterinario");
        Veterinario vet = null;
        int id = 0;
        VeterinarioController instance = new VeterinarioController();
        instance.actualizarVeterinario(vet, id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}