package Ejercicio1;

public class Imprime {

	// ¿Qué imprime por pantalla?
	
	public static void main(String[] args) {
		
		int num, suma;
		
		suma = 1;
		for (int i =1; i<=4; i++) {
			num = 2;
			suma = suma - num + i;
		}
		System.out.println(suma);
	}
}
