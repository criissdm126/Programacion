package Tema_3;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Calcu2 {

	static Calculadora calc;

	@Before
	public void setUp() throws Exception {
        calc = new Calculadora(10,2);
	}

	@After
	public void tearDown() throws Exception {
        calc = null;
	}
    
	//SUMA
	@Test
    public void testSuma() {
        int resultadoEsperado = 12;
        int resultadoObtenido = calc.suma();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
	//RESTA
    @Test
    public void testResta() {
        int resultadoEsperado = 8;
        int resultadoObtenido = calc.resta();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    //MULTIPLICACION
    @Test
    public void testMultiplicacion() {
       /* int resultadoEsperado = 20;
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
    
    //DIVISION
    @Test
  public void testDivision() {
    	/*int resultadoEsperado = 5;
         int resultadoObtenido = calc.division();
         assertEquals(resultadoEsperado, resultadoObtenido);*/
    	
    	fail("No implementado aun");
    }


}
