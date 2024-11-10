package pruebasIntegracion;

import Controller.VeterinarioController;
import Model.Veterinario;
import org.junit.jupiter.api.*;
import persistencia.Conexion;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static persistencia.Conexion.getConnection;

public class VeterinariocontrollerIT {

    private VeterinarioController veterinario;
    private Veterinario vet;

    @BeforeEach
    public void setUp() {
        getConnection();
        veterinario = new VeterinarioController();
        vet = new Veterinario();
        vet.setName("Hugo");
        vet.setAge(26);
        vet.setPhone("154871");
        vet.setAdress("Carolina, Av 18");
        vet.setCodigoProfesional("GFG545");
    }

    @Test
    public void testObtenerVeterinarios(){
        List<Veterinario> listaVeterinarios = veterinario.obtenerVeterinarios();
        assertNotNull(listaVeterinarios);
    }

    @Test
    public void testObtenerVeterinarioById() {
        int id = 1;
        String nombre = veterinario.obtenerVeterinarioById(id).getName();
        assertNotNull(nombre);
    }

    @Test
    public void testDBVeterinario() {
        Connection con = getConnection();
        assertNotNull(con);
    }

    @Test
    public void testIntegracion() {
        // Insertamos un veterinario
        boolean result = veterinario.insertarVeterinario(vet);
        // Buscamos el veterinario
        Veterinario vete = veterinario.obtenerVeterinarioById(15);
        // Eliminamos el veterinario
        boolean eliminacion = veterinario.eliminarVeterinario(15);
        assertEquals(true, eliminacion);
    }
}

