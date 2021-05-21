package org.gobcan.cursoformacion.testprueba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void pruebaDeSumaTest1()
    {
        assertEquals("La suma ha dejado de ser correcta", 20, App.suma(10, 10) );
    }

    @Test
    public void pruebaDeSumaTest2()
    {
        assertNotEquals("La suma ha dejado de ser correcta", 10000, App.suma(100,100));
        assertEquals("La suma ha dejado de ser correcta", 1100, App.suma(100 , 1000) );
    }
    
    @Test
    public void pruebaDeSumaTest3()
    {
    	// Para evitar falsos positivos se deben tener varios assert
    	// La prueba se para desde que falla el primer assert
        assertEquals("La suma ha dejado de ser correcta", 4, App.suma(2, 2) );

        assertNotEquals("La suma ha dejado de ser correcta", 10000, App.suma(100,100));
        assertEquals("La suma ha dejado de ser correcta", 1100, App.suma(100 , 1000) );

        assertEquals("La suma ha dejado de ser correcta", 20, App.suma(10, 10) );
    }
    
    @Test
    public void pruebaDeSumaTest4()
    {
        assertEquals("La suma ha dejado de ser correcta", 0, App.suma(0, 0) );
    }
}
