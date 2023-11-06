package Tema6;

import java.util.Scanner;

public class STRING {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		String a ="lunes";
		System.out.println("Escribe una de las siguientes palabras: lunes, balon o casa.");
		a = sc.nextLine();
		
		String b = "balon";
		System.out.println("Escribe otra de las siguientes palabras: lunes, balon o casa.");
		b = sc.nextLine();
		
		String c = "casa";
		System.out.println("Escribe la palabra que te falte: lunes, balon o casa.");
		c = sc.nextLine();
		
		int longuitud1 = a.length();
		int longuitud2 = b.length();
		int longuitud3 = c.length();
		
		
		if (a.length() == b.length()) {
			System.out.println(longuitud1 + "Tiene las mismas letras que" + longuitud2);
		}
        
        else if (b.length() > c.length()) {
			System.out.println(longuitud2 + "Tiene mas letras que" + longuitud3);
		}
		
        
        else if (c.length()< a.length()) {
			System.out.println(longuitud1 + "Tiene mas letras que" + longuitud3);
        }
		
	
		
		
		sc.close();


	}

}
