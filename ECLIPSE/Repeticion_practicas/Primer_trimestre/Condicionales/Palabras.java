package Condicionales;

import java.util.Scanner;

public class Palabras {

	public static void main(String[] args) {
		
		System.out.println("Las palabras introducidas, se colocaran de la mas larga a la mas corta, en caso de ser iguales, alfabeticamente.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera palabra: ");
		String palabra1 = sc.nextLine();
		
		System.out.println("Introduce la segunda palabra: ");
		String palabra2 = sc.nextLine();
		
		System.out.println("Introduce la tercera palabra: ");
		String palabra3 = sc.nextLine();
		
		if (palabra1.length() > palabra2.length() && palabra1.length() > palabra3.length()) {
			if (palabra2.length() > palabra3.length()) {
				System.out.println(palabra1 + ", " + palabra2 + ", " + palabra3);
			}
            else {
				System.out.println(palabra1 + ", " + palabra3 + ", " + palabra2);
			}
		}

        else if (palabra2.length() > palabra1.length() && palabra2.length() > palabra3.length()) {
			if (palabra1.length() > palabra3.length()) {
				System.out.println(palabra2 + ", " + palabra1 + ", " + palabra3);
			}
            else {
				System.out.println(palabra2 + ", " + palabra3 + ", " + palabra1);
			}
		}
        
        else if (palabra3.length() > palabra1.length() && palabra3.length() > palabra2.length()) {
			if (palabra1.length() > palabra2.length()) {
				System.out.println(palabra3 + ", " + palabra1 + ", " + palabra2);
			}
            else {
				System.out.println(palabra3 + ", " + palabra2 + ", " + palabra1);
			}
		}

        else {
			if (palabra1.compareTo(palabra2) > 0 && palabra1.compareTo(palabra3) > 0) {
				if (palabra2.compareTo(palabra3) > 0) {
					System.out.println(palabra1 + ", " + palabra2 + ", " + palabra3);
				}
                else {
					System.out.println(palabra1 + ", " + palabra3 + ", " + palabra2);
				}
			}
            else if (palabra2.compareTo(palabra1) > 0 && palabra2.compareTo(palabra3) > 0) {
				if (palabra1.compareTo(palabra3) > 0) {
					System.out.println(palabra2 + ", " + palabra1 + ", " + palabra3);
				}
                else {
					System.out.println(palabra2 + ", " + palabra3 + ", " + palabra1);
				}
			}
            else {
				if (palabra1.compareTo(palabra2) > 0) {
					System.out.println(palabra3 + ", " + palabra1 + ", " + palabra2);
				}
                else {
					System.out.println(palabra3 + ", " + palabra2 + ", " + palabra1);
				}
			}
		}
		
		sc.close();
	}
}

/*Comparar 3 palabras introducidas por pantalla, y mostrarlos ordenadas de mayor a menor.
* Primero mirar el número de caracteres, y si son iguales alfabéticamente.
*/