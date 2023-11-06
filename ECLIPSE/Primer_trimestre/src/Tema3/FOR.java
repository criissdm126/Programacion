package Tema3;

import java.util.Scanner;

public class FOR {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num1 = 0;
		int suma = 0;
		for (int i = num1; i <5; i++) {
			System.out.println("Escriba un numero:" );
			num1 = sc.nextInt();
			suma = suma + num1 ;
		}
		
		
		double media;
		
		System.out.println("La suma es:" + suma);
		media = suma/5.0;
		System.out.println("La media es: " + media);
		
		sc.close();

	}

}
