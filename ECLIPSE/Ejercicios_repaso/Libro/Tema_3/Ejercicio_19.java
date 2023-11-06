package Tema_3;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un número natural: ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Numero incorrecto.");
		}
		
		while (num != 0) {
			double raiz = Math.sqrt(num);
			System.out.println("La raiz cuadrada es: " + raiz);

		}
		

	}

}

/*Calcula la raíz cuadrada de un número natural mediante aproximaciones.
 * En el caso de que no sea exacta, muestra el resto.
 * Por ejemplo, para calcular la raíz cuadrada de 23, 
 *    probamos 1 elevado a 2 = 1, 2^2 = 4, 3^2 = 9, 4^2 = 16, 5^4 = 25 (nos pasamos),
 *    resultando 4 la raíz cuadrada de 23 con un resto (23 - 16) de 7*/
