package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Ejercicio7SWITCH {

	public static void main(String[] args) {
		
		int nota;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Escriba una nota comprendida entre el 0 y el 10:");
		nota = sc.nextInt();
		
		switch (nota) {
		case 0,1,2,3,4 ->{
			System.out.println ("Suspenso");
		}
		case 5 ->{
			System.out.println ("Insuficiente");
		}
		case 6->{
			  System.out.println ("Bien");
		}
		case 7,8->{
			System.out.println ("Notable");
		}
		case 9,10->{
			System.out.println ("Sobresaliente");
		}
		}
		sc.close();

	}

}
