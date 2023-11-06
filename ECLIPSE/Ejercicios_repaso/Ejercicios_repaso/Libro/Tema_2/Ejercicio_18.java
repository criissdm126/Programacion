package Tema_2;

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = (int) (Math.random() * 99) + 1;
		int num2 = (int) (Math.random() * 99) + 1;
		
		int operacion = (int) (Math.random() * 3); // 0: suma, 1: resta, 2: multiplicación
		
		int resultado;
		String operador;
		
		switch (operacion) {
			case 0:
				resultado = num1 + num2;
				operador = "+";
				break;
			case 1:
				resultado = num1 - num2;
				operador = "-";
				break;
			default:
				resultado = num1 * num2;
				operador = "*";
		}
		
		System.out.println("Cual es el resultado de la operacion: " + num1 + " " + operador + " " + num2);
		System.out.print("Respuesta: ");
		int usuario = sc.nextInt();
		
		if (usuario == resultado) {
			System.out.println("La respuesta es correcta.");
		}
		else {
			System.out.println("La respuesta es incorrecta.");
			System.out.println("El resultado era: " + resultado);
		}
		
		sc.close();

	}

}