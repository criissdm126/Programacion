package BUCLESEVALUABLES;

import java.util.Scanner;

public class CUADRADO {

	public static void main(String[] args) {
		System.out.println("Escriba un numero:");
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int fila=1; fila<=num; fila++) {
			for (int columna=1; columna<=num; columna++)
				System.out.print("*");
				System.out.println("");
			
		}
		
		
		
		
		sc.close();
		

	}

}
