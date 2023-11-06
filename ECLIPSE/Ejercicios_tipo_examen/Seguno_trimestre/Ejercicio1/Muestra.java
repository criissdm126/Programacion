package Ejercicio1;

public class Muestra {

	public static void main(String[] args) {
		
		int [] valores1 = {9, 48, 5, 3, 29, 62};
		int [] valores2 = {4, 1, 2};
		
		metodo1(valores1[2]);
		metodo1(valores2[2]);
		metodo2(valores2);
		
		valores1 = metodo3(valores2);
		
		System.out.println(valores1[0]);
		
		for(int i = 1; i<valores2.length; i++) {
			
			System.out.println(" " + valores1[i]);
		}

	}
	
	public static void metodo1(int numero) {
		numero = 0;
		numero = numero + 10;
	}
	
	public static void metodo2(int [] lista) {
		lista[1] = lista[2];
	}
	
	public static int [] metodo3(int [] lista) {
		for(int i =0; i<lista.length; i++) {
			lista[i] = lista[i] + i;
			
		}
		return lista;
	}
}

