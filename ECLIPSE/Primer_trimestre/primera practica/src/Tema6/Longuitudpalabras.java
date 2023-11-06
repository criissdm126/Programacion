package Tema6;

import java.util.Scanner;

public class Longuitudpalabras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 String a;
		 System.out.println("Escriba una palabra: ");
		 a = sc.nextLine();
		 
		 String b;
		 System.out.println("Escriba una segunda palabra: ");
		 b = sc.nextLine();
		 
		 String c;
		 System.out.println("Escriba una tercera palabra: ");
		 c = sc.nextLine();
			
			int longuituda = a.length();
			int longuitudb = b.length();
			int longuitudc = c.length();
			
			if (longuituda > longuitudb && longuitudb > longuitudc){
			System.out.println( a + "- " + b + "-" + c);
			}
			
			else if (longuituda > longuitudc && longuitudc > longuitudb){
				System.out.println( a + "- " + c + "-" + b);
			}
			else if (longuitudb > longuituda && longuituda > longuitudc) {
				System.out.println(b + "-" +  a + "-" + c);
			}
			
			else if (longuitudb > longuitudc && longuitudc > longuituda) {
				System.out.println(b + "-" + c + "-" + a);
			}
			
			else if (longuitudc > longuituda && longuituda > longuitudb) {
				System.out.println(c + "-" + a + "-" + b);
			}
				
			else if (longuitudc > longuitudb && longuitudb > longuituda) {
				System.out.println(c + "- " + b + "-" + a);
			}
			
			
			
			sc.close();

	}

}
