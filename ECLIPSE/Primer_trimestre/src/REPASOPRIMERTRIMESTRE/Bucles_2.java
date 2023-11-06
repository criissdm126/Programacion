package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Bucles_2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble(); 
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		double num5 = sc.nextDouble();
		
		for (int i=0; i<5; i++) {
			double suma = num1 + num2 + num3 + num4 + num5;
			System.out.println ("Escriba un numero cual quiera y le mostraremos la suma: " + suma);
		}
		
		sc.close();

	}

}
