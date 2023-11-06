package Tema_2;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre 0 y 360 y lo pasamos a radianes: ");
		double grados = sc.nextDouble();
		
		
		if(grados >= 0 && grados <=360) {
			double radianes = (grados * 3.14)/ 180;
			System.out.println("El resultado en radianes es: " + radianes);
		}
		else {
			System.out.println("numero incorrecto.");
		}

		sc.close();

	}

}
