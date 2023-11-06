package Tema1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int segundos;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Escribe los segundos:");
		segundos = sc.nextInt();
		double minutos;
		System.out.println ("Escribe los minutos:");
		minutos = sc.nextDouble();
		
		
		
		minutos = segundos/60;
		System.out.println ("Total en minutos:" + minutos);
		
		double horas;
		horas = minutos/3600;
		System.out.println ("Total en horas:" + horas);
		
		
		
		
		
		

		sc.close();

	}

}
