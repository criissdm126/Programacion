package Tema6;
import java.util.*;

public class String {

public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String a = "lunes";
		System.out.println("Escribe una de las siguientes palabras: lunes, balon o casa.");
		a = sc.nextLine();
		
		String b = "balon";
		System.out.println("Escribe otra de las siguientes palabras: lunes, balon o casa.");
		b = sc.nextLine();
		
		String c = "casa";
		System.out.println("Escribe la palabra que te falte: lunes, balon o casa.");
		c = sc.nextLine();
		
		int longitud1 = a.length();
		int longitud2 = b.length();
		int longitud3 = c.length();
		
		if (a.length() == b.length()) {
			System.out.println(longitud1 + " tiene las mismas letras que " + longitud2);
		} else if (b.length() > c.length()) {
			System.out.println(longitud2 + " tiene más letras que " + longitud3);
		} else if (c.length() < a.length()) {
			System.out.println(longitud1 + " tiene más letras que " + longitud3);
		}
		
		sc.close();
	}

}