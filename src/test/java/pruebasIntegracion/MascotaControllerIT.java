package pruebasIntegracion;

import Controller.DuenoController;
import Controller.MascotaController;
import Model.Dueno;
import Model.Mascota;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static persistencia.Conexion.getConnection;

public class MascotaControllerIT {

    private Mascota mascota;
    private MascotaController mascotaController;

    @BeforeEach
    public void setUp() {
        mascotaController = new MascotaController();
        mascota = new Mascota();
        mascota.setName("Lobin");
        mascota.setBreed("Lobo");
        mascota.setAge(10);
        mascota.setIdDueno(1);
        mascota.setIdVeterinario(1);
    }

    @Test
    public void testObtenerMascotas() {
        List<Mascota> listaMascotas = mascotaController.obtenerMascotas();
        assertNotNull(listaMascotas);
    }

    @Test
    public void testObtenerMascotaById() {
        int id = 2;
        String nombre = mascotaController.obtenerMascotaById(id).getName();
        assertNotNull(nombre);
    }
    @Test
    public void testDBMascota() {
        Connection con = getConnection();
        assertNotNull(con);
    }

    @Test
    public void testInsertarMascota() {
        // Insertamos un veterinario
        boolean result = mascotaController.insertarMascota(mascota);
        // Buscamos el veterinario
        Mascota masc = mascotaController.obtenerMascotaById(9);
        // Eliminamos el veterinario
        boolean eliminacion = mascotaController.eliminarMascota(9);
        assertTrue(eliminacion);
    }
}
