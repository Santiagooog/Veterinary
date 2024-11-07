package pruebasUnitarias;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistencia.Conexion;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        boolean expResult=false;
        Connection conexion = Conexion.getConnection();
        boolean result = true;
        if(conexion!=null){
            expResult=true;
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
