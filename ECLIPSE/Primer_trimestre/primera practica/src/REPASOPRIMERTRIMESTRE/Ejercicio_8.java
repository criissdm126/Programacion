package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;


public class Ejercicio_8 {

	public static void main(String[] args) {
		
		System.out.println ("Numero de entradas disponibles:");
		Scanner sc= new Scanner(System.in);
		int entradas;
		entradas = sc.nextInt();
		
		int vendidas;
		System.out.println ("Numero de entradas vendidas:");
		vendidas = sc.nextInt();
		
		
		int precio = 1;
		double recaudado;
	
		
		if (vendidas != entradas && vendidas == 10 || vendidas != entradas && vendidas < 10)  {
			System.out.println ("No se ha recaudado dinero.");
			
			precio = 1 * vendidas;
			System.out.println ("Se ha conseguido: " + precio + " euros");
		}
		
		else if (vendidas != entradas && vendidas >= 40 || vendidas != entradas && vendidas <= 100) {
			
			precio = 1 * vendidas;
			recaudado = (vendidas*25)/100;
			System.out.println ("Se ha conseguido: " + precio + " euros.");
			System.out.println ("Se ha recaudado: " + recaudado + " euros.");
		}
		
		sc.close();

	}

}
