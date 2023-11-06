package TEMA1;

import java.util.Scanner;

public class Numfavyedad {

	public static void main(String[] args) {
		
		System.out.println("Escribe tu numero favorito y tu edad:");
		Scanner sc = new Scanner(System.in);
		double edad;
		edad=sc.nextDouble();
		int numero;
		numero=sc.nextInt();
		System.out.println("Mi edad es " + edad + " y mi numero favorito es " + numero);
		
		sc.close();


	}

}
