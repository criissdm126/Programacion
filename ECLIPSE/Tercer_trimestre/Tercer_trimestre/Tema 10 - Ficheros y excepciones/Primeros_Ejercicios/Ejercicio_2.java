package Primeros_Ejercicios;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		/*modifica el programa anterior, para que, cuando salte el error,  en lugar de imprimir por pantalla:
		 * "se ha producido un error"
		 * Lo lance como excepción para que lo capture la clase llamadora, mantener bloque try - catch
		 */
		
		double i = 200, j = 0;
		
		try {
			division(j,i);
		}
		
		catch(Exception e) {
			System.out.println("Eror de calculo.");
		}
		finally {
			System.out.println("Fin del programa.");
		}
	}

	public static void division (double i, double j) throws Exception {
		
		double resultado;
		
		if (j != 0) {
			resultado = i/j;
			System.out.println("Resultado de la operación de " + i + " entre " + j + " es igual a: " + resultado);
		}
		else {
			throw new Exception("Error del calculo");
		}
		
	
	
	}

}
