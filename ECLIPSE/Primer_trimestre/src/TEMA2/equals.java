package TEMA2;


import java.util.Scanner;

public class equals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String a = "hola";
		String b = "aloha";
		
		if (a.equals(b))
			System.out.println ("Son iguales");
		else 
			System.out.println ("Son distintos");
		
		
		sc.close();

	}

}
