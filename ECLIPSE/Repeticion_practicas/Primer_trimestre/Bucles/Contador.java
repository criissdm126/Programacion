package Bucles;

public class Contador {

	public static void main(String[] args) {
		int num1 = 100;
		int num2;
		int contador = 0;
		
		
		while (num1 >0) {
			System.out.println(num1);
			num1 = num1 - 2;
			num2 = num1 + 1;
			
			int digito = num2 % 10;
			if(digito == 7) {
				contador++;
			}
		}
		
		System.out.println("Existen: "  +  contador + " sietes");

	}

}

/*Escribir todos los números del 100 al 0 de 2 en 2.
 * Adicionalmente mostrar un contador total de los que terminan en 7
 */