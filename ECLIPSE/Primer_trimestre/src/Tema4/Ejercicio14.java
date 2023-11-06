package Tema4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		System.out.println("Escribe horas y minutos, se mostrará en segundos.");
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		System.out.println("Escribe un valor en minutos:");
		minutos = sc.nextInt();
		
		
		int horas;
		System.out.println("Escribe un valor en horas:");
		horas = sc.nextInt();
		
		int segun;
		System.out.println("Escribe un valor en segudos:");
		segun = sc.nextInt();
		
		
		System.out.println(segundos (horas,minutos,segun));
		
		sc.close();

	}
	
	static int segundos (int a, int b, int c) {
		
		int hora = a*3600;
		int min = b*60;
		int segundos = hora + min + c;
		
		System.out.println("El total en segundos es: " + segundos);
		
		return segundos;
	}

}
