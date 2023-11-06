package Tema2;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		
		int nota;
		Scanner sc = new Scanner(System.in);
		nota = sc.nextInt();
		switch (nota) {
		
		case 0,1,2,3,4 -> {
			System.out.println("Suspenso.");
			System.out.println("Animo...");
		}
		
		case 5 -> {
			System.out.println("Suficiente.");
		}
		
		case 6 -> {
			System.out.println("Bien.");
		}
		
		case 7,8 -> {
			System.out.println("Notable.");
		}
		
		case 9, 10 -> {
			System.out.println("Sobresaliente.");
			System.out.println("Enhorabuena.");
		}
		
		default ->
		    System.out.println("Nota incorrecta.");
		}
		
		sc.close();
	}

}
