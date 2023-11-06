package Tema_3;

import java.util.*;

public class Ejercicio_11 {

	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un numero decimal: ");
	        int decimal = sc.nextInt();

	        String binario = "";

	        while (decimal > 0) {
	            int resto = decimal % 2;
	            binario = resto + binario;
	            decimal = decimal / 2;
	        }

	        System.out.println("El numero binario es:");

	        for (int i = 0; i < binario.length(); i++) {
	            System.out.println(binario.charAt(i));
	        }

	        sc.close();

	    }

	}

/*Realiza un programa que convierta un número decimal en su representación binaria.
 * Hay que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce el usuario.
 * Por simplicidad, iremos mostrando el número binario con un digito por línea.
 */
