package Trabajosevaluables;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		 System.out.println("Se pueden realizar tres operaciones, la primera: una raiz cuadrada, la segunda:una potencia, tercera: una division.");
		 System.out.println("Numero 1:");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		
		System.out.println("Numero 2:");
		double num2 = sc.nextDouble();
		
		System.out.println("Ponga uno de los siguientes numeros, para realizar alguna de las operaciones, 1 (raiz), 2 (division), 3 (potencia):");
		String numoperacion = sc.nextLine();
		int operacion = sc.nextInt();
		
		
		if (operacion==1){
			System.out.println("Se va a realizar una raiz cuadrada.");
			double raiz1 = Math.sqrt(num1);
			double raiz2 = Math.sqrt(num2);
			System.out.println(numoperacion +" El resultado es: "+ raiz1 +" y "+ raiz2);
		}
		else if (operacion==2) {
			System.out.println("Se va a realizar una division.");
			System.out.println(numoperacion +" El resultado es: "+ (num1/num2));
		}
		else if (operacion==3) {
			System.out.println("Se va a realizar una potencia.");
			System.out.println(numoperacion  +" El resultado es: "+ Math.pow(num1,0.5) +" y "+ Math.pow(num2,0.5));
		}
		
		
		
		sc.close();

	}

}
