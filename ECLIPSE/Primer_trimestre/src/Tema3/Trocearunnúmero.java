package Tema3;

import java.util.Scanner;

public class Trocearunnúmero {

	public static void main(String[] args) {
		
		System.out.println("Inserte un numero:");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		//usuario elige 143
		
		while (num > 0) {
			int unidades = num % 10;
			System.out.print(unidades);
			
			if (num >99)
				System.out.print(" , ");
			else if (num<100 && num>9)
				System.out.print(" y ");
			
			
			
			
			num = num/10;
		}
		
		//ahora numero vale 14
		
		
		 sc.close();

	}

}
