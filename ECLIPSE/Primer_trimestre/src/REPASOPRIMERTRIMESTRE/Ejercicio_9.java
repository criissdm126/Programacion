package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int revista_precio;
		System.out.println ("Precio de la revista:");
		revista_precio = sc.nextInt();
		
		int antiguo;
		System.out.println ("Cuanto tiempo lleva usted subscrito");
		antiguo = sc.nextInt();
		
		int estudiante;
		System.out.println ("¿Es usted estudiante?");
		estudiante = sc.nextInt();
		sc.close();


	}

}
