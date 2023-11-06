package TEMA1;

import java.util.*;

public class iva {

	public static void main(String[] args) {
		
		double importe;
		int iva;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println ("Escribe el importe:");
		importe = teclado.nextDouble();
		
		System.out.println ("Escribe el iva:");
		iva = teclado.nextInt();
		
		double adicional = importe*iva/100;
		
		System.out.println ("Cantidad adicional:" + adicional);
		double importeTotal = importe + adicional;
		
		System.out.println ("El importe total es:" + importeTotal);
		
		double a = 3.0/4;
		 System.out.println("a vale:" + a);
		 int b = (int) a;
		 
		 System.out.println("b vale:" + b);
		 double c = 3 +5;
		 System.out.println("c vale:" + c);
		
		 
		 teclado.close();


	}

}
