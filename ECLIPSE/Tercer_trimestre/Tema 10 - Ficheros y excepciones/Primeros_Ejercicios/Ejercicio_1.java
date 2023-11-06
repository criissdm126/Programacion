package Primeros_Ejercicios;

public class Ejercicio_1 {

	public static void main(String[] args) throws Exception {
		
		int i = 200;
		int j = 2;
		
		//calculadora (i, j);
		System.out.println(calculadora (i, j));

	}
	public static int calculadora (int a, int b) {
		
		int calcular = 0;
		
		try {
			calcular = a/b;
		}
		
		catch(ArithmeticException e) {
			System.out.println("Salio mal la operacion.");
		}
		finally {
			System.out.println("Fin del programa.");
		}
		
		//int calcular = 0;
		return calcular;
	}

}
