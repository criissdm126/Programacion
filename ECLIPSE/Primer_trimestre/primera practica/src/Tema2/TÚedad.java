package Tema2;

import java.util.Scanner;

public class TÚedad {

	public static void main(String[] args) {
		
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		edad = sc.nextInt();
		
		if (edad>=30) {
			System.out.println("Tienes mas de 30 años. ");
		}
		
		else if (edad >=20) {
			System.out.println("Tienes mas de 20 años");
		}
		
		else {
			System.out.println("Eres MENOR de edad.");
		}
		
		
		sc.close();

	}

}
