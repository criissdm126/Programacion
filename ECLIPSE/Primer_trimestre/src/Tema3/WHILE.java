package Tema3;

import java.util.Scanner;

public class WHILE {

	public static void main(String[] args) {
		
		int num;
		 int contador =4;
		  int suma = 0;
		Scanner sc= new Scanner(System.in);
		
	   
	   
		double media;
		
	    while (contador <9)  {
			contador ++;
	    	System.out.println("Escriba 5 numeros:" );
	    	num = sc.nextInt();
	    	suma = suma + num;
			
		}
		
		
		
		System.out.println("El resultado de la suma es: " + suma);
		
		media = suma/5.0;
		System.out.println("La media es: " + media);
		
		
		
		
		
		sc.close();


	}

}
