package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class EJERCICIO6 {

	public static void main(String[] args) {
		
		
		int edad;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Escriba su edad:");
		edad = sc.nextInt();
		
		if (edad<18) {
			System.out.println ("Eres muy joven");
		}
		else if (edad < 40) {
			System.out.println ("Eres joven");
		}
		else if (edad<65) {
			System.out.println ("Eres viejoven");
		}
		else {
			System.out.println ("Cuidate");
		}
		sc.close();

	}

}
