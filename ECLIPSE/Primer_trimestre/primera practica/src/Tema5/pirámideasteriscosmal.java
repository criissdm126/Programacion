package Tema5;

import java.util.Scanner;

public class pirámideasteriscosmal {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe un numero: ");
		int num;
		num = sc.nextInt();
		
		for (int i =0; i<num;i++) {
			System.out.println();
			
			for (int j=0; j<num-i-1; ++j) {
				System.out.println("*");
			}
			for (int j = 0; j< 2*i+1; j++) {
				System.out.println("*");
			}
		}
		System.out.println();
		sc.close();

	}

}
