package Bucles_2;

import java.util.*;


public class Ej_12_NumerosPrimos_for {

public static void main(String[] args) {
		
		System.out.println("Escriba un número:"); // se pregunta el número
		Scanner sc= new Scanner(System.in);
		
		int num2 = sc.nextInt();
		int numprimo = 0;
		boolean primo;
		
		for(int i = 2; i <= num2; i++) {
			primo = true;
			for(int j = 2; j <= i-1; j++) { // se revisa si el número es primo
				if(i % j == 0) {
					primo = false;
					break; // si no es primo se sale del ciclo for interno
				}
			}
			if(primo == true) { // en caso de ser primo
				numprimo++;
				System.out.println(i + " es primo");
			}
		}
		
		System.out.println("Entre 1 y " + num2 + " existen "+ numprimo + " números primos");
		sc.close();
	}
}