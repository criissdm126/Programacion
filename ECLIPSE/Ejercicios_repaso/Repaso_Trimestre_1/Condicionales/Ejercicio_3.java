package Condicionales;

import java.util.Scanner;

public class Ejercicio_3 {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }

        sc.close();
    }
}

/*
 * Ejercicio
 * Dado un número introducido por pantalla, decir si es par o impar
 */
