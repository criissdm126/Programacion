package Tema_3;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.fail;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Calculadora_ALL {
	
	static Calculadora calc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calc = new Calculadora(10,2);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		 calc = null;
	}
	
	@Test
    public void testSuma() {
        int resultadoEsperado = 12;
        int resultadoObtenido = calc.suma();
        assertTrue(resultadoEsperado, resultadoObtenido);
        
       // assertEquals(resultadoEsperado, resultadoObtenido);
    }

    private void assertTrue(int resultadoEsperado, int resultadoObtenido) {
		
	}

	@Test
    public void testResta() {
        int resultadoEsperado = 8;
        int resultadoObtenido = calc.resta();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testMultiplicacion() {
        /*int resultadoEsperado = 20;
        int resultadoObtenido = calc.multiplicacion();
        assertEquals(resultadoEsperado, resultadoObtenido);*/
    }
    
    @ParameterizedTest
	@CsvSource({"20,10,200",
		        "5, 2, 10",
		        "6,2,12"})
	public void testMult(int a, int b, int esperado) {
		Calculadora calcu = new Calculadora(a,b);
		int result = calcu.multiplicacion();
		assertEquals(esperado, result);
	}

    @Test
  public void testDivision() {
    	/* int resultadoEsperado = 5;
         int resultadoObtenido = calc.division();
         assertEquals(resultadoEsperado, resultadoObtenido);*/
    	
    	fail("No implementado aun");
    }

}
