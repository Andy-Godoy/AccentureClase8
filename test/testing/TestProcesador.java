/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import ejerciciotickettransito.Procesador;
import ejerciciotickettransito.gentickets.*;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sensorclima.TipoClima;
import sensorvelocidad.DatosVehiculo;
import sensorvelocidad.TipoVehiculo;

/**
 *
 * @author educacionit
 */
public class TestProcesador {
    
    public TestProcesador() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void unCasoDeUso() {
        
        GeneradorTicketMock generadorTicketMock = 
                new GeneradorTicketMock();
        
        Procesador procesador =
                new Procesador(generadorTicketMock);
        
        DatosVehiculo datosvehiculo = new DatosVehiculo();
        datosvehiculo.tipoVehiculo = TipoVehiculo.Auto;
        
        procesador.procesar(datosvehiculo, TipoClima.NORMAL, false);
        Assert.assertEquals(true, generadorTicketMock.isTicketGenerado());
    }
}
