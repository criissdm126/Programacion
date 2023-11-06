package Trabajosevaluables;

import java.util.Scanner;

public class BOMBILLAS {

	public static void main(String[] args) {
		
		
		System.out.println("Ingrese dos numeros:");
		Scanner sc = new Scanner(System.in);
		
		boolean b1 = false;
		boolean b2 = false;
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 < 100 && num1 >= 0 && num2 <10 && num2 >= 0) {
			b2 = true;
		}
		
		else if (num2 < 100 && num2 >= 0 && num1 <10 && num1 >=0) {
			b2 = true;
		}
		
		else {
			b1 = true;
		}
		
		
		System.out.println("Bombilla b1:" + b1);
		System.out.println("Bombilla b2:" + b2);
		
		
		sc.close();

		

	}

}
