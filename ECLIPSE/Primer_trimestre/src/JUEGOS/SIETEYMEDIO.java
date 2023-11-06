package JUEGOS;

import java.util.Scanner;

public class SIETEYMEDIO {

	public static void main(String[] args) {
		
		System.out.println("Cada carta vale su valor, a excepcion de sota, caballo y rey que valen 0.5 puntos, que comience el juego.");
		Scanner sc= new Scanner(System.in);
		
		
		int numerocartas = (int)(Math.random()*10)+1;
		System.out.println("Su primera carta es: " + numerocartas);
		double valortotal= 7.5;
		valortotal = sc.nextDouble();
		
		int carta1 = sc.nextInt();
		int carta2 = 0;
		while ((carta2 <= 7.5) && (valortotal == 7.5)) {
			carta2 = sc.nextInt();
			System.out.println ("Su  carta es: " + carta2);
			valortotal = carta1 + carta2;
			System.out.println ("La suma de sus cartas es de: " + valortotal);
		}
		if (numerocartas != valortotal && valortotal <7.5) {
			System.out.println ("Su nueva carta es: " + numerocartas);
			valortotal ++;
			System.out.println ("Su valor es: " + valortotal);
			valortotal = numerocartas + valortotal;
		}
		
		
		sc.close();

		
		
	}
}


