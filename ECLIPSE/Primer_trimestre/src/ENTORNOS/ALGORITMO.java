package ENTORNOS;

import java.util.*;

public class ALGORITMO {

	public static void main(String[] args) {
		
		System.out.println("Escriba un numero:" );
		Scanner sc= new Scanner(System.in);
		
		
		boolean num1 = false;
		double modulo = sc.nextDouble();
		
		if (int)(num1 = 0) {
			System.out.println("Valor incorrecto.");
		}
		else if ((num1 < 0) || (num1 > 100)) {
			System.out.println("El numero esta fuera del rango.");
		}
		
		modulo = num1/2;
		
		if (modulo == 0) {
			System.out.println("El numero es par.");
		}
		else if (modulo!=0) {
			System.out.println("El numero es impar.");
		}
		sc.close();

	}

}
