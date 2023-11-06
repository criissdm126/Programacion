package Examen_primer_trimestre;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
		
		String a = "madrid";
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una ciudad en minusculas:");
		// suponemos que el usuario escribe por teclado "madrid"
		String b = sc.nextLine();

		if (b.equals(a)) {
		    System.out.println("Has elegido " + b);
		    System.out.println("Son iguales");
		} else {
		    System.out.println("No son iguales");
		}

	}

}
