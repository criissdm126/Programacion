package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class String_2 {

	public static void main(String[] args) {
		
		System.out.println("Escriba una palabra que se lea igual del derecho que del reves: ");
		Scanner sc = new Scanner(System.in);
		
		String palindromo = sc.nextLine();
		String a = palindromo.replaceAll(" ", " ").toLowerCase();
		
		
		int b = 0;
		int longuitud = a.length();
		
		while (b<longuitud/2 &&  a.charAt(b) == a.charAt(longuitud-1-b)) {
			if (a.charAt(b) == a.charAt(longuitud -1-b)) {
				b++;
			}
		}
		
		if (b==longuitud/2)
			System.out.println("Es un palindromo");
		else System.out.println("No es un polindromo");
		
		sc.close();


	}

}
