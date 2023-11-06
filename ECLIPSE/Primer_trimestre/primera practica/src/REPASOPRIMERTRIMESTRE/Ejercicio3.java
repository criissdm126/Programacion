package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Escriba un numero y se le mostrara si es par o impar:");
		n = sc.nextInt();
		
		if (n%2 == 0) {
			System.out.println ("El numero introducido es par");
		}
		else {
			System.out.println ("El numero introducido es impar");
		}
		sc.close();

	}

}
