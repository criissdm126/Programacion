package JUEGOS;

import java.util.Scanner;

public class ADIVINAELNÚMERO {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("Tienes que adivinar un numero comprendido entre el 1 y el 100.");
		
		
		int numsecreto = (int)(Math.random()*99)+1;
		int intentos = sc.nextInt();
		System.out.println("Introduzca un numero:");
		int acierto = sc.nextInt();
		
		while (acierto != numsecreto && intentos > 0) {
			intentos--;
			if (acierto > numsecreto) {
				System.out.println("Incorrecto, el numero secreto es un numero mas pequeño que el introducido");
			}
			else {
				System.out.println("Incorrecto, el numero secreto es mayor.");
				System.out.println("Intentelo de nuevo");
			}
			acierto = sc.nextInt();
		}
		
		if (intentos <= 0) System.out.println("Se te han acabado los intentos, el numero secreto era: " + numsecreto);
		
		else  System.out.println("Enhorabuena, has acertado el numero secreto");
		
		sc.close();

	}

}
