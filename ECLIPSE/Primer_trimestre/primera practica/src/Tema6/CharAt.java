package Tema6;

import java.util.Scanner;

public class CharAt {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		String a = "hola";
		String b ="aloha";
		
		if (a.charAt(3) == b.charAt(3))
			System.out.println ("Son iguales");
		else 
			System.out.println ("Son distintos");
		
		sc.close();

	}

}
