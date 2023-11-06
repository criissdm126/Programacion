package TEMA1;

import java.util.Scanner;

public class EJERCICIO17 {

	public static void main(String[] args) {
		
		double primera;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un valor en milimetros: ");
		primera = sc.nextDouble();
		
		double segunda;
		System.out.println("Escribe un valor en centimetros: ");
		segunda = sc.nextDouble();
		
		double tercera;
		System.out.println("Escribe un valor en metros: ");
		tercera = sc.nextDouble();
		segunda = segunda*10;
		tercera = tercera*1000;
		
		double milimetros;
		milimetros = primera + segunda + tercera;
		System.out.println("Total en milimetros: " + milimetros);
		
		
		sc.close();


	}

}
