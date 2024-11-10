package pruebasIntegracion;

import Controller.DuenoController;
import Controller.VeterinarioController;
import Model.Dueno;
import Model.Veterinario;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static persistencia.Conexion.getConnection;

public class DuenoControllerIT {

    private DuenoController duenoController;
    private Dueno dueno;

    @BeforeEach
    public void setUp() {
        duenoController = new DuenoController();
        dueno = new Dueno();
        dueno.setName("Mario Bross");
        dueno.setAge(30);
        dueno.setPhone("154871");
        dueno.setAdress("Carolina, Av 18");
        dueno.setEmail("duenio@hotmail.com");
    }

    @Test
    public void testObtenerDuenoById() {
        int id = 1;
        String nombre = duenoController.obtenerDuenoById(id).getName();
        assertNotNull(nombre);
    }
    @Test
    public void testObtenerDuenos() {
        List<Dueno> listaDuenos = duenoController.obtenerDuenos();
        assertNotNull(listaDuenos);
    }
    @Test
    public void testDBDueno() {
        Connection con = getConnection();
        assertNotNull(con);
    }
    @Test
    public void testIntegracion() {
        // Insertamos un veterinario
        boolean result = duenoController.insertarDueno(dueno);
        // Buscamos el veterinario
        Dueno duen = duenoController.obtenerDuenoById(6);
        // Eliminamos el veterinario
        boolean eliminacion = duenoController.eliminarDueno(6);
        assertTrue(eliminacion);
    }

}
