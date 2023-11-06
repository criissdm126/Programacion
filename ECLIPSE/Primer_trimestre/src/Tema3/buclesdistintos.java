package Tema3;

import java.util.Scanner;

public class buclesdistintos {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		int a;
		int b;
		
		do {
			System.out.println("Escribe un numero:");
			a= sc.nextInt();
			b = sc.nextInt();
		}
		while (a!=b);
		
		sc.close();

	}

}
