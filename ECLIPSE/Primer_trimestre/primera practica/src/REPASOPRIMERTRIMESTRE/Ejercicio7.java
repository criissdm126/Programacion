package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		
		double nota;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Escriba una nota comprendida entre el 0 y el 10:");
		nota = sc.nextDouble();
		
		if (nota <= 4) {
			System.out.println ("Insuficiente");
		}
		else if (nota == 5) {
			System.out.println ("Suficiente");
		}
		else if (nota == 6) {
			System.out.println ("Bien");
		}
		else if (nota == 7 || nota == 8) {
			System.out.println ("Notable");
		}
		else if (nota >= 9) {
			System.out.println ("Sobresaliente");
		}
		sc.close();

	}

}
