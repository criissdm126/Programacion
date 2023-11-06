package Tema_3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class multiplicacion {
	
	@ParameterizedTest
	@CsvSource({"20,10,200",
		        "5, 2, 10",
		        "6,2,12"})
	
	public void testMult(int a, int b, int esperado) {
		Calculadora calcu = new Calculadora(a,b);
		int result = calcu.multiplicacion();
		assertEquals(esperado, result);
	}

}
