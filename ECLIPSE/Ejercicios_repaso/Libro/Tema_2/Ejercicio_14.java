package Tema_2;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Pon un numero entre 0 y 99: ");
		int numero = sc.nextInt();
		
		if (numero < 0 || numero > 99) {
			System.out.println("El numero introducido esta fuera de rango.");
		}
        
        else {
			String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
			String[] decenas1 = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
			String[] decenas2 = {"veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
			
			if (numero < 10) {
				System.out.println(unidades[numero]);
			}
			else if (numero < 20) {
				System.out.println(decenas1[numero - 10]);
			}
			else if (numero < 30) {
				if (numero == 20) {
					System.out.println(decenas2[0]);
				}
				else {
					System.out.println(decenas2[0] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 40) {
				if (numero == 30) {
					System.out.println(decenas2[1]);
				}
				else {
					System.out.println(decenas2[1] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 50) {
				if (numero == 40) {
					System.out.println(decenas2[2]);
				}
				else {
					System.out.println(decenas2[2] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 60) {
				if (numero == 50) {
					System.out.println(decenas2[3]);
				} else {
					System.out.println(decenas2[3] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 70) {
				if (numero == 60) {
					System.out.println(decenas2[4]);
				}
				else {
					System.out.println(decenas2[4] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 80) {
				if (numero == 70) {
					System.out.println(decenas2[5]);
				}
				else {
					System.out.println(decenas2[5] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 90) {
				if (numero == 80) {
					System.out.println(decenas2[6]);
				}
				else {
					System.out.println(decenas2[6] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 100) {
				if (numero == 90) {
					System.out.println(decenas2[7]);
				}
				else {
					System.out.println(decenas2[7] + " y " + unidades[numero % 10]);
				}
			}
		}
	}
}

/*Escribe un programa que solicite al usuario un número entre 1 y 99.
 * El programa debe mostrarlo por letras, por ejemplo, para 56, se verá: "cicuenta y seis".
 */
