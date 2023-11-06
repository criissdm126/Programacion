package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		double suma;
		double resta;
		double media;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Escribe la primera nota:");
		num1 = sc.nextInt();
		System.out.println ("Escribe la segunda nota:");
		num2 = sc.nextInt();
		
		suma = num1 + num2;
		System.out.println ("La suma de ambas notas es: " + suma);
		
		resta = num1 - num2;
		System.out.println ("La resta de ambas notas es: " + resta);
		
		media = (num1 + num2)/2;
		System.out.println ("La media de ambas notas es: " + media);
		
		
		sc.close();

	}

}
