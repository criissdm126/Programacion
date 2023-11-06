package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Escribe el valor de num1:");
		num1 = sc.nextInt();
		System.out.println ("Escribe el valor de num2:");
		num2 = sc.nextInt();
		
		if (num1%2 == 0 && num2%2 == 0) {
			System.out.println (num1 + " y " + num2 + " son numeros pares");
		}
		else if (num1%2 == 0 && num2 != 0 || num1 != 0 && num2%2 == 0) {
			System.out.println (num1 + " y " + num2 + " son numeros distintos");
		}
		
		else  {
			System.out.println (num1 + " y " + num2 + " son numeros impares");
		}
		
	
		sc.close();


	}

}
