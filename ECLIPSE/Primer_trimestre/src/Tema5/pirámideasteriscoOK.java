package Tema5;

import java.util.Scanner;

public class pirámideasteriscoOK {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un numero: ");
		int num = sc.nextInt();
		int espacios = 2*num - 2;
		
		for (int i =0; i < num; i++) {
			for (int j=0; j <= i; j++)
				System.out.println("*");
			
			espacios = espacios - 1;
			
		for (int j = 0; j<=i; j++) {
			System.out.println("*");
		}
		System.out.println("\n");
		}
		sc.close();

	}

}
