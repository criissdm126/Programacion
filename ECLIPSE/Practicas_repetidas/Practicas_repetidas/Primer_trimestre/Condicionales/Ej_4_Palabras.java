package Condicionales;

import java.util.Scanner;

public class Ej_4_Palabras {

	public static void main(String[] args) {
		
		System.out.println("Las palabras introducidas, se colocaran de la mas larga a la mas corta, en caso de ser iguales, alfabeticamente.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera palabra: "); // palabra 1
		String palabra1 = sc.nextLine();
		
		System.out.println("Introduce la segunda palabra: "); // palabra 2
		String palabra2 = sc.nextLine();
		
		System.out.println("Introduce la tercera palabra: "); // palabra 3
		String palabra3 = sc.nextLine();
		
		// LONGUITUD DE PALABRAS
		if (palabra1.length() > palabra2.length() && palabra1.length() > palabra3.length()) { // palabra 1 es la más larga de las tres
			if (palabra2.length() > palabra3.length()) { // palabra 2 más larga que palabra 3
				System.out.println(palabra1 + ", " + palabra2 + ", " + palabra3); //  palabra 1 >  palabra 2 > palabra 3
			}
            else { // en caso de que palabra 3 sea más larga que palabra 2
				System.out.println(palabra1 + ", " + palabra3 + ", " + palabra2); //  palabra 1 >  palabra 3 > palabra 2
			} 
		}

        else if (palabra2.length() > palabra1.length() && palabra2.length() > palabra3.length()) {  // palabra 2 es la más larga de las tres
			if (palabra1.length() > palabra3.length()) { //palabra 1 más larga que palabra 3
				System.out.println(palabra2 + ", " + palabra1 + ", " + palabra3); //  palabra 2 >  palabra 1 > palabra 3
			}
            else {// en caso de que palabra 3 sea más larga que palabra 1
				System.out.println(palabra2 + ", " + palabra3 + ", " + palabra1);//  palabra 2 >  palabra 3 > palabra 1
			}
		}
        
        else if (palabra3.length() > palabra1.length() && palabra3.length() > palabra2.length()) { // palabra 3 es la más larga de las tres
			if (palabra1.length() > palabra2.length()) { // palabra 1 más larga que palabra 2
				System.out.println(palabra3 + ", " + palabra1 + ", " + palabra2); //  palabra 3 >  palabra 1 > palabra 2
			}
            else {// en caso de que palabra 2 sea más larga que palabra 1
				System.out.println(palabra3 + ", " + palabra2 + ", " + palabra1);//  palabra 3 >  palabra 2 > palabra 1
			}
		}

		// SI SON IGUALES DE TAMAÑO LAS COLOCA ALFABTICAMENTE (Z > A)
		// A = 1, Z = 29
        else {
			// EN CASO DE SER PALABRA 1 ALFABETICAMENTE MAYOR A PALABRA 2 Y PALABRA 3
			if (palabra1.compareTo(palabra2) > 0 && palabra1.compareTo(palabra3) > 0) { // COMPARA LA PALABRA 1 CON LAS OTRAS, PALABRA 1 ALFABETICAMENTE VA ANTES
				if (palabra2.compareTo(palabra3) > 0) { //COMPARA PALABRA 2 CON LA 3
					System.out.println(palabra1 + ", " + palabra2 + ", " + palabra3); // //  palabra 1 >  palabra 2 > palabra 3
				}
                else { // PALABRA 3 ES MAYOR A PALABRA 2 ALFABETICAMENTE
					System.out.println(palabra1 + ", " + palabra3 + ", " + palabra2); //  palabra 1 >  palabra 3 > palabra 2
				}
			}
			// EN CASO DE SER PALABRA 2 ALFABETICAMENTE MAYOR A PALABRA 1 Y PALABRA 3
            else if (palabra2.compareTo(palabra1) > 0 && palabra2.compareTo(palabra3) > 0) { //COMPARA LA PALABRA 2 CON LAS OTRAS, PALABRA 2 ALFABETICAMENTE VA ANTES
				if (palabra1.compareTo(palabra3) > 0) { //COMPARA PALABRA 1 CON LA 3
					System.out.println(palabra2 + ", " + palabra1 + ", " + palabra3); //  palabra 2 >  palabra 1 > palabra 3
				}
                else {// PALABRA 3 ES MAYOR A PALABRA 1 ALFABETICAMENTE
					System.out.println(palabra2 + ", " + palabra3 + ", " + palabra1); //  palabra 2 >  palabra 3 > palabra 1
				}
			}
			// EN CASO DE SER PALABRA 3 ALFABETICAMENTE MAYOR A PALABRA 1 Y PALABRA 2
            else { // PALABRA 3 ES MAYOR QUE LAS DEMÁS ALFABETICAMENTE
				if (palabra1.compareTo(palabra2) > 0) { //COMPARA PALABRA 1 CON LA 2
					System.out.println(palabra3 + ", " + palabra1 + ", " + palabra2); //  palabra 3 >  palabra 1 > palabra 2
				}
                else { // PALABRA 2 ES MAYOR A PALABRA 1 ALFABETICAMENTE
					System.out.println(palabra3 + ", " + palabra2 + ", " + palabra1); //  palabra 3 >  palabra 2 > palabra 1
				}
			}
		}
		
		sc.close();
	}
}

/*Comparar 3 palabras introducidas por pantalla, y mostrarlos ordenadas de mayor a menor.
* Primero mirar el número de caracteres, y si son iguales alfabéticamente.
*/