package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		int seg;
		double horas;
		double minutos;
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Escriba un valor en segundos, y se lo mostraremos en horas, minutos y segundos, segun corresponda:");
		seg = sc.nextInt();
		
		System.out.println ("Total en segundos: " + seg);
		
	
		minutos = seg/60.0;
		System.out.println ("Total en minutos: " + minutos);
		
		horas = seg/3600;
		System.out.println ("Total en horas: " + horas);
		
		sc.close();


	}

}
