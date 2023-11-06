package Tema1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		
		double a;
		double b;
		float c;
		int x;
		double y;
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Escribe el valor de a:");
		a = sc.nextDouble();
		System.out.println("Escribe el valor de b:");
		b = sc.nextDouble();
		System.out.println("Escribe el valor de c:");
		c = sc.nextFloat();
		System.out.println("Escribe el valor de x:");
		x = sc.nextInt();
		

	a = a * Math.pow(x, 2);
	b = b * x;
	y = (a + b + c);
	System.out.println("y = " + y);
	
	sc.close();

	}

}
