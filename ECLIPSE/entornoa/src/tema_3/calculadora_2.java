package tema_3;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class calculadora_2 {
	private calculadora calc;

	@Before
	public void setUp() throws Exception {
        calc = new calculadora(5,3);
	}

	@After
	public void tearDown() throws Exception {
        calc = null;
	}

	@Test
    public void testSuma() {
        int resultadoEsperado = 8;
        int resultadoObtenido = calc.suma();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testResta() {
        int resultadoEsperado = 2;
        int resultadoObtenido = calc.resta();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testMultiplicacion() {
        int resultadoEsperado = 15;
        int resultadoObtenido = calc.multiplicacion();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testDivision() {
        int resultadoEsperado = 1;
        int resultadoObtenido = calc.division();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }


}
