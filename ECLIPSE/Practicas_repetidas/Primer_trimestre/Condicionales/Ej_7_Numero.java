package Condicionales;


import java.util.Scanner;

public class Ej_7_Numero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Pon un numero entre 0 y 99: "); // se pregunta un numero
		int numero = sc.nextInt();
		
		if (numero < 0 || numero > 99) { //se comprueba que esta dentro del rango
			System.out.println("El numero introducido esta fuera de rango.");
		}
        
        else {
			String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"}; // unidades 1 - 9
			String[] decenas1 = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"}; //decenas 10 - 100
			String[] decenas2 = {"veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};//decenas 10 - 100
			
			if (numero < 10) { //unidades
				System.out.println(unidades[numero]);
			}
			else if (numero < 20) { //decenas
				System.out.println(decenas1[numero - 10]);
			}
			else if (numero < 30) { // si numero es menor a 30
				if (numero == 20) { // si numero es igual a 20
					System.out.println(decenas2[0]);
				}
				else { // si está entre 20 y 30
					System.out.println(decenas2[0] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 40) { // numero menor a 40
				if (numero == 30) { // en caso de ser 30
					System.out.println(decenas2[1]);
				}
				else { // numero entre 30 y 40
					System.out.println(decenas2[1] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 50) {// numero menor a 50 
				if (numero == 40) {// en caso de ser 40
					System.out.println(decenas2[2]);
				}
				else {// numero entre 40 y  50
					System.out.println(decenas2[2] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 60) {// numero menor a 60
				if (numero == 50) { // en caso de ser 50 
					System.out.println(decenas2[3]);
				} else {// numero entre 50 y 60
					System.out.println(decenas2[3] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 70) {// numero menor a 70
				if (numero == 60) { // en caso de ser 60
					System.out.println(decenas2[4]);
				}
				else { // numero entre 60 y 70
					System.out.println(decenas2[4] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 80) {// numero menor a 80
				if (numero == 70) { // en caso de ser 70
					System.out.println(decenas2[5]);
				}
				else { // numero entre 70 y 80
					System.out.println(decenas2[5] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 90) {// numero menor a 90
				if (numero == 80) { // en caso de ser 80 
					System.out.println(decenas2[6]);
				}
				else { // numero entre 80 y 90
					System.out.println(decenas2[6] + " y " + unidades[numero % 10]);
				}
			}
			else if (numero < 100) {// numero menor a 100
				if (numero == 90) { // en caso de ser 90
					System.out.println(decenas2[7]);
				}
				else {// numero entre 90 y 100
					System.out.println(decenas2[7] + " y " + unidades[numero % 10]);
				}
			}
		}
	}
}

/*Pedir un número de 0 a 99 y mostrarlo escrito.
* Por ejemplo, para 56 mostrar: cincuenta y seis
*/