package Tema4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		System.out.println("Escribe un numero, y se le mostrara  los numeros que sean pares:");
		Scanner sc = new Scanner(System.in);
		
		int num2 = sc.nextInt();
		muestrapares (num2);
		
		sc.close();
		
	}
	
	static void muestrapares (int n) {
		
		int num1 = 0;
		while ((n!=0) && (n>0)){
			num1 = num1 + 2;
			n --;
			System.out.println(num1);
		}
	
	
		
	}

}
