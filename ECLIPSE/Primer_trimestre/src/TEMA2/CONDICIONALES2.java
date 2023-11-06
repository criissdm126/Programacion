package TEMA2;

import java.util.Scanner;

public class CONDICIONALES2 {

	public static void main(String[] args) {
		
		int edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		edad = sc.nextInt();
		
		if (edad<18) {
		System.out.println("Eres menor de edad ");
		}
		else if  (edad <=30) {
		System.out.println("Eres joven.");
		}
		else if (edad <=50) {
		System.out.println("Eres viejoven.");
		}
		else if (edad<70) {
			System.out.println("Estas mayorcito.");
		}
		else if (edad>70) {
			System.out.println("Cuidate.");
		}
		sc.close();

	}

}
