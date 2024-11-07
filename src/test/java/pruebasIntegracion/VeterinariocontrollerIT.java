package pruebasIntegracion;

import Controller.VeterinarioController;
import Model.Veterinario;
import org.junit.jupiter.api.*;
import persistencia.Conexion;

import java.sql.Connection;

import static persistencia.Conexion.getConnection;

public class VeterinariocontrollerIT {

    public void VeterinarioControllerIT() {
    }

    @BeforeEach
    public void setUp() {
        getConnection();
        VeterinarioController vet = new VeterinarioController();
        Veterinario veterinario = new Veterinario();
    }

    @Test
    public void testObtenerVeterinarios(){

    }

    @Test
    public void testObtenerVeterinarioById() {
    }

    @Test
    public void testInsertarVeterinario() {
    }

    @Test
    public void testEliminarVeterinario() {
    }

    @Test
    public void testActualizarVeterinario() {
    }
}
