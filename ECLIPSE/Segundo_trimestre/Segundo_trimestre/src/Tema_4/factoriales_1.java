package Tema_4;

import java.util.Scanner;

public class factoriales_1 {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
		
		System.out.println("Dime un numero y se realiza su factorial:");
		int num = sc.nextInt();
		
		int resultado = factorial (num);
		
		System.out.println(resultado);
		
		sc.close();

	}
	
	static int factorial (int a) {
		
	
		if(a==1) {
			return 1;
		}
		else {
			return a=a*factorial(a - 1);
		}
	}

	}


