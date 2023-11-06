package TEMA2;


import java.util.Scanner;

public class edad {

	public static void main(String[] args) {
		
		double edad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad:");
		edad = sc.nextDouble();
		
		int numero;
		System.out.println("Dime tu numero favorito:");
		numero = sc.nextInt();
		
		
		if (numero % 2 == 0) {
			System.out.println("Tu numero es par. ");
		}
		
		else if (edad<18) {
			System.out.println("Eres menor de edad.");
		}
		
		else if (edad>18) {
			System.out.println("Eres mayor de edad.");
		}
	
		
		sc.close();
	}

}
