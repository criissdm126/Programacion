package Tema5;

import java.util.Scanner;

public class rectángulo {

	public static void main(String[] args) {
		
		System.out.println("Escriba un numero: ");
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			for (int j=i; j<=num; j++){
				System.out.print("*");
			}
			System.out.println("");
	}
		sc.close();

	}

}
