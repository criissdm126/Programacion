package Tema_2;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = (int) (Math.random() * 99) + 1;
		int num2 = (int) (Math.random() * 99) + 1;
		System.out.println("Cual es la suma de estos numeros " + num1 +" + " + num2);
		System.out.println("Resultado: ");
		int usuario = sc.nextInt();
		
		int resultado = num1 + num2;
		
		if (usuario == resultado) {
			System.out.println("La suma es correcta.");
		}
		else {
			System.out.println("La suma es incorrecta.");
			System.out.println("El resultado era: " + resultado);
		}
		
		
		
		sc.close();

	}

}

/*Realiza el "juego d ela suma", que consiste en que aparezcan dos números aleatorios (comprendidos entre el 1 y 99) que el usuario tiene que sumar.
 * La aplicación debe indicar el resultado de la operación es correcto o incorrecto
 */
