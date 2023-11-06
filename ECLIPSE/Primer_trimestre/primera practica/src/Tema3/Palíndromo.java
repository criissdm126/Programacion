package Tema3;

import java.util.Scanner;

public class Palíndromo {

	public static void main(String[] args) {
		
		System.out.println("Escriba una palabra que se lea igual del derecho que del reves: ");
		Scanner sc = new Scanner(System.in);
		String normal= sc.nextLine();
		
		String a = normal.replaceAll("", "").toLowerCase();
		
		int b = 0;
		int lon = a.length();
		
		while (b<lon/2 &&  a.charAt(b) == a.charAt(lon-1-b)) {
			if (a.charAt(b) == a.charAt(lon -1-b)) {
				b++;
			}
		}
		
		if (b==lon/2)
			System.out.println("Es un palindromo");
		else System.out.println("No es un polindromo");
		
		sc.close();

	}

}
