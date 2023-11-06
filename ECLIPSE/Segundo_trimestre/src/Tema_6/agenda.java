package Tema_6;

import java.util.Scanner;
import java.util.Arrays;

public class agenda {

	public static void main(String[] args) {
		
		String agenda[] = new String [0];
		int opcion;
		
		do {
			opcion = menu();
			switch(opcion) {
			case 1:
				agenda = nuevo(agenda);
				break;
			case 2:
				buscar(agenda);
				break;
			case 3:
				mostrar(agenda);
				break;
			}
		}while (opcion !=4);

	}
	
	static int menu(int a) {
		System.out.println("1. Nuevo contacto");
		System.out.println("2. Buscar contacto");
		System.out.println("3. Ver todo");
		System.out.println("4. Salir");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		sc.close();
		return a;
		
		
	}

	}


