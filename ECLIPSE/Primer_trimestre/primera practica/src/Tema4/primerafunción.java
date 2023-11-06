package Tema4;

public class primerafunción {

public static void main(String[] args) {
		
		System.out.println("Buenos dias.");
		
		
		saluda (2);
		saluda (1);
		saluda (4);
		saluda (0);
		saludaydevuelve (1); //ESTO EQUIVALE A UN 5
		
		
		System.out.println("Hoy es lunes");

	}
	static void saluda(int veces) {
		System.out.println("Esta funcion saluda");
		
		for (int i = 0; i<veces; i++) {
			System.out.println("Hola que tal");
			}
		}
	
	static int saludaydevuelve (int veces) {
		
		int numero = 0;
		System.out.println("Esta funcion saluda");
		for (int i = 0; i<veces; i++) {
			System.out.println("Hola que tal");
			}
		if (veces<0) numero = -1;
		if (veces>0) numero = 5;
		if (veces==0) numero = 0;
		
		return numero;
		
	}
}
