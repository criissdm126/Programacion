package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Bucles_7 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		int suma = 0;
		double media = 0;
		
		do {
			System.out.println ("Escriba un numero, y cuando escriba uno negativo, mostraremos la media hasta dicho numero:");
			num = sc.nextInt();
			suma = suma + num;
			media = suma/100;
			System.out.println ("La media es: " + media);
		
		}while (num <= 100);
		
		sc.close();

	}

}
