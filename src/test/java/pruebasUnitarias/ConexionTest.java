package pruebasUnitarias;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistencia.Conexion;

import javax.swing.*;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;
import static persistencia.Conexion.getConnection;

public class ConexionTest {

    public ConexionTest(){
    }

    @Before
    public void setUpClass(){}

    @AfterAll
    public static void tearDownClass() {}

    @BeforeEach
    public void setUp() {}

    @AfterEach
    public void tearDown() {}

    @org.junit.Test
    @Test
    public void testGetConnection() {
        System.out.println("Conexión con la base de datos");
        assertNotNull(getConnection());
    }
}
