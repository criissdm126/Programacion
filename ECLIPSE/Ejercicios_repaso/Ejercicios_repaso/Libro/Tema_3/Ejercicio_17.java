package Tema_3;

import java.util.*;

public class Ejercicio_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Dale un valor numerico a A: ");
		int a = sc.nextInt();
		
		System.out.println("Dale un valor numerico a B: ");
		int b = sc.nextInt();
		
		int maxComunDivisor = 0;
		sc.close();
		
		for(int i = 0; i <= Math.min(a, b); i ++) {
			if (a % i == 0 && b % i == 0) {
				maxComunDivisor = i;
			}
		}
		
		
		System.out.println("El maximo comun divisor de " + a + " y " + b + " es " + maxComunDivisor);

	}

}

/* desde el menor de a y b, buscar de forma decreciente, el primer numero que divide a ambos simultáneamente.
 * Programa que calcule el maximo comun divisor de ambos*/
 