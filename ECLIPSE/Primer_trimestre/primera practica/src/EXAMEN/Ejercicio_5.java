package EXAMEN;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
		String a="madrid";

		Scanner sc=new Scanner (System.in);
		System.out.println("Escribe una ciudad en minusculas:");
		
		String b = sc.next();
		
		if(b.equals(a)) {
			System.out.println("Tu respuesta es: " + b);
		}
		
		else if(b.equals(a) == false) {
			System.out.println("Son distintas");
		}
		
		else {
			System.out.println("Son iguales");
		}
		sc.close();

	}

}
