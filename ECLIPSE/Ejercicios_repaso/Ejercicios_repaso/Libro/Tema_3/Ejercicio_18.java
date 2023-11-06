package Tema_3;

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un numero natural: ");
		int num1 = sc.nextInt();
		
		System.out.println("Escribe otro numero natural: ");
		int num2 = sc.nextInt();
		
		int minComunDivisor = Math.min(num1, num2);
		int maxComunDivisor = 1;

		if (num1 < 0 || num2 < 0) {
			System.out.println("Numero incorrecto.");
		} else {
			for (int i = minComunDivisor; i >= 1; i--) {
				if (num1 % i == 0 && num2 % i == 0) {
					maxComunDivisor = i;
					break;
				}
			}

			int result = (num1 * num2) / maxComunDivisor;
			System.out.println("El minimo comun multiplo es: " + result);
		}

		sc.close();

	}

}

/*de forma similar a la actividad anterior, 
* implementa un añgoritmo que calcule el mínimo común múltiplo de dos números dados
*/