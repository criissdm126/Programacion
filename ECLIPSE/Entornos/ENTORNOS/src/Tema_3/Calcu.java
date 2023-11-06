package Tema_3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;

/*import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;*/

public  class Calcu {
	
	//suma
	public void testSuma() {
		int valorEsperado = 30;
		Calculadora calc = new Calculadora (10, 20);
		int valor = calc.suma();
		assertEquals(valorEsperado, valor, 0);
		}
	
	//resta
	@Test
	public void testResta() {
	int esperado = 10;
	Calculadora calcu = new Calculadora (20,10);
	int result = calcu.resta();
	assertEquals(esperado,result,0 );
	}
	
	//multiplicación
	
	/*@ParameterizedTest
	@ValueSource(strings = {"Hola", "Mundo"})
	void noNulo(String cadena) {
		assertNotNull(cadena);
	}*/
	
	/*@ParameterizedTest
	@CsvSource({"20,10,200"})
	public void testMultiplica(int a, int b, int esperado) {
	//int esperado = 200;
	Calculadora calcu = new Calculadora (a,b);
	int result = calcu.multiplicacion();
	assertEquals(esperado,result);
		
	}*/
	
	@ParameterizedTest
	@CsvSource({"20,10,200",
		        "5, 2, 10",
		        "6,2,12"})
	public void testMult(int a, int b, int esperado) {
		Calculadora calcu = new Calculadora(a,b);
		int result = calcu.multiplicacion();
		assertEquals(esperado, result);
	}
	
	
	//división
	@Test
 public void testDivide() {
		/*int esperado = 2;
		Calculadora calc = new Calculadora(20,10);
		int result = calc.division();
		assertEquals(esperado, result, 0);*/
		
		fail("No implementado aun");
		
		
	}
	
	
	
}