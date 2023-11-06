package Tema2;

import java.util.Scanner;

public class aleatoriocorrección {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int a = (int) (Math.random() * 99) + 1;
		int b = (int) (Math.random() * 99) + 1;
		int operacion = (int) (Math.random() * 3) + 1;;
		int resultadomaquina = 0;
		resultadomaquina = sc.nextInt();
		int resultadousuario = 0;
		resultadousuario = sc.nextInt();
	
		
	
		
			if (operacion == 1)  {
				System.out.println("La operacion es suma");
				resultadomaquina = a + b;
			}
				
			else 
				if (operacion == 2) {
					System.out.println("La operacion es una resta");
					resultadomaquina = a - b;	
				}
					
				else {
					System.out.println("La operacion es una multiplicacion");
					resultadomaquina = a * b;	
				}
			
			sc.close();

	}

}
