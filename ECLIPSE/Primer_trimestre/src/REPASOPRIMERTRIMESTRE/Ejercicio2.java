package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
	
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Escribe el primer numero:");
		num1 = sc.nextInt();
		System.out.println ("Escribe el segundo numero:");
		num2 = sc.nextInt();
		
		System.out.println("Ponga uno de los siguientes numeros, para realizar alguna de las operaciones, 1 (suma), 2 (resta):");
		num3 = sc.nextInt();
		
		
		String numoperacion = sc.nextLine();
		
		
		if (num3 == 1) {
			num3 = num1 + num2;
			System.out.println ("El resultado de " + numoperacion + num1 + " y " + num2 + " es: " + num3);
		}
		else if (num3 == 2) {
			num3 = num1 - num2;
			System.out.println ("El resultado de " + numoperacion + num1 + " y " + num2 + " es: " + num3);
		}
		
		else {
			System.out.println ("Operacion no permitida");
		}
		
		
		sc.close();

	}

}
