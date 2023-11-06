package Condicionales;

import java.util.Scanner;

public class Ejercicio_4 {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de segundos: ");
        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        System.out.println(segundos + " segundos equivale a " + horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos.");

        sc.close();
    }
}

/*
 * Ejercicio
 * Dado un número en segundos pasarlo a horas, minutos y segundos
 */
