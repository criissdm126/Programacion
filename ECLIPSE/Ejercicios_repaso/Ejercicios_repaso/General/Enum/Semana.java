package Enum;

import java.util.*;

public class Semana {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un dia de la semana:");
        String diaIngresado = scanner.nextLine().toUpperCase();

        try {
            DiaSemana dia = DiaSemana.valueOf(diaIngresado);

            if (dia.esLaboral()) {
                System.out.println(dia + " es un dia laboral.");
            } else {
                System.out.println(dia + " no es un dia laboral.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Dia no valido.");
        }

        scanner.close();
    }
}