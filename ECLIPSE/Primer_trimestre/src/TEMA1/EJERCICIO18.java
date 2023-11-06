package TEMA1;

import java.util.*;

public class EJERCICIO18 {

	public static void main(String[] args) {
		
		int hormigas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero de hormigas: ");
		hormigas = sc.nextInt();
		
		int arañas;
		System.out.println("Dime el numero de arañas: ");
		arañas = sc.nextInt();
		
		int cochinillas;
		System.out.println("Dime el numero de cochinillas: ");
		cochinillas = sc.nextInt();
		
		hormigas = hormigas*6;
		arañas = arañas*8;
		cochinillas = cochinillas*14;
		
		int patas;
		patas = hormigas + arañas + cochinillas;
		System.out.println("El numero total de patas es: " + patas);
		
		sc.close();

	}

}
