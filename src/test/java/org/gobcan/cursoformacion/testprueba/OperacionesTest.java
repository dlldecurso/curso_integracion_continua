package org.gobcan.cursoformacion.testprueba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class OperacionesTest 
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
    public void pruebaDeResta1Test()
    {
        assertEquals("La resta ha dejado de ser correcta", 0, Operaciones.resta(10, 10) );
    }

    @Test
    public void pruebaDeResta2Test()
    {
        assertNotEquals("La resta ha dejado de ser correcta", 8, Operaciones.resta(10, 10) );
        assertEquals("La resta ha dejado de ser correcta", 0, Operaciones.resta(10, 10) );
    }

    @Test
    public void pruebaDeMultiplicacion1Test()
    {
        assertNotEquals("La multiplicacion ha dejado de ser correcta", 4, Operaciones.multiplicacion(100,100));
        assertEquals("La multiplicacion ha dejado de ser correcta", 10000, Operaciones.multiplicacion(100 , 100) );
    }
    
    @Test
    public void pruebaDeDivisionTest3()
    {
    	// Para evitar falsos positivos se deben tener varios assert
    	// La prueba se para desde que falla el primer assert
        assertEquals("La division ha dejado de ser correcta", 10, Operaciones.division(100, 10) );
    }

    @Test
    public void pruebaDeDivisionTest4()
    {
    	try {
    	// Para evitar falsos positivos se deben tener varios assert
    	// La prueba se para desde que falla el primer assert
        assertEquals("La division ha dejado de ser correcta", 10, Operaciones.division(100, 10) );
        assertEquals("La division ha dejado de ser correcta", 5, Operaciones.division(5, 1) );
        assertEquals("La division ha dejado de ser correcta", 0, Operaciones.division(100, 0) );
    	} catch (ArithmeticException a) {
    		//assertTrue(a.getCause().getLocalizedMessage(),"");
    		assertTrue(true);
    	}
    }
}

