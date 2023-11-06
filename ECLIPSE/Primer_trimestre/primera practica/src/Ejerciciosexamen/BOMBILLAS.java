package Ejerciciosexamen;

import java.util.Scanner;

public class BOMBILLAS {

	public static void main(String[] args) {
		
		boolean b1=false;
		boolean b2 = false;
		System.out.println("Dia:");
		System.out.println("Mes:");
		Scanner sc= new Scanner(System.in); 
			int dia = sc.nextInt();
			int mes = sc.nextInt();
			
			
			
			
			if ((dia%2==0) && (mes%2==0))
				b1 = true;
			//día par y mes par
			else 
				b2 = true;
			
			System.out.println("Bombilla b1:" + b1);
			System.out.println("Bombilla b2:" + b2);
			
			sc.close();


	}

}
