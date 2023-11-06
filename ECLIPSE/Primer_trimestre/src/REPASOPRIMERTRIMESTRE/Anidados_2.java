package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Anidados_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int letra;
		System.out.println("Indica el numero de letras que quiera, y le mostraremos ese numero en forma de escalera: ");
		letra = sc.nextInt();
		
		for (int fila=4; fila<letra; fila++) {
			for (int columna = 4; columna<letra; columna++) {
				System.out.println("*");
				System.out.println(" ");
			}
		}
		sc.close();
	}

}
