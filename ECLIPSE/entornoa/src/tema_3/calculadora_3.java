package tema_3;

import static org.junit.Assert.*;
import org.junit.Test;


public class calculadora_3 {

	//suma
		public void testSuma() {
			int valorEsperado = 30;
			calculadora calc = new calculadora(10, 20);
			int valor = calc.suma();
			assertEquals(valorEsperado, valor, 0);
			}
		
		//resta
		@Test
		void testResta() {
		int esperado = 10;
		calculadora calcu = new calculadora (20,10);
		int result = calcu.resta();
		assertEquals(esperado,result,0 );
		}
		
		//multiplicación
		@Test
		void testMultiplica() {
		int esperado = 200;
		calculadora calcu = new calculadora (20,10);
		int result = calcu.multiplicacion();
		assertEquals(esperado,result,0 );
		}
		
		//división
		@Test
		public void testDivide() {
			fail("No implementado aun");
		}


}
