package Contraseña;

import java.util.*;

public class Principal {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de contraseñas: ");
	        int cantidadContraseñas = scanner.nextInt();
	        scanner.nextLine(); // Limpiar el buffer

	        Password[] contraseñas = new Password[cantidadContraseñas];
	        boolean[] contraseñasFuertes = new boolean[cantidadContraseñas];

	        System.out.print("Ingrese la longitud de las contraseñas: ");
	        int longitudContraseñas = scanner.nextInt();
	        scanner.nextLine(); // Limpiar el buffer

	        for (int i = 0; i < cantidadContraseñas; i++) {
	            contraseñas[i] = new Password(longitudContraseñas);
	            contraseñasFuertes[i] = contraseñas[i].esFuerte();
	        }

	        System.out.println("Contraseñas generadas:");

	        for (int i = 0; i < cantidadContraseñas; i++) {
	            System.out.println(contraseñas[i].getContraseña() + " " + contraseñasFuertes[i]);
	        }
	    }
	}