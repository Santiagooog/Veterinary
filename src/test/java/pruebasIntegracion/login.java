package pruebasIntegracion;

import Controller.VeterinarioController;
import Model.Veterinario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class login {
    HashMap<Integer, String> usuariosDisponibles;
    VeterinarioController vetContro;


    @BeforeEach
    public void setUp() {
        usuariosDisponibles = new HashMap<>();
        vetContro = new VeterinarioController();
    }


    @Test
    public void testLogin() {
        List<Veterinario> listaVeterinarios = vetContro.obtenerVeterinarios();
        for (Veterinario vet : listaVeterinarios) {
            usuariosDisponibles.put(vet.getId(),vet.getCodigoProfesional());
        }
        assertNotNull(usuariosDisponibles);
    }
}

