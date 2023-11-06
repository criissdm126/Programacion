package Tema1;

import java.util.Locale;
import java.util.Scanner;

public class DECIMALES {

	public static void main(String[] args) {
		
		System.out.println("Nota del primer trimestre:");
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		double primera;
		primera= sc.nextDouble();
		
		System.out.println("Nota segundo trimestre:");
		float segunda;
		segunda= sc.nextFloat();

		
		System.out.println("Nota tercer trimestre:");
		double tercera;
		tercera= sc.nextDouble();
		
		
		double media;
		media = (primera + segunda + tercera)/3;
		System.out.println("Nota media: " + media);
	
sc.close();	

	}

}
