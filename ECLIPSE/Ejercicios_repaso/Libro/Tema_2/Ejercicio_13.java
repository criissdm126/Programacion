package Tema_2;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de comida diaria: ");
		double comidaDiaria = sc.nextDouble();
		
		System.out.println("Introduce la cantidad de animales que tiene: ");
		int numAnimales = sc.nextInt();
		
		System.out.println("Introduce la cantidad de kilos por animal (pueden ser decimales): ");
		double kilosPorAnimal = sc.nextDouble();
		
		double kilosNecesarios = numAnimales * kilosPorAnimal;
        
        if (comidaDiaria == 0) {
            System.out.println("No hay suficiente comida para los animales.");
        } else if (kilosNecesarios <= comidaDiaria) {
            System.out.println("Hay suficiente comida para los animales.");
        } else {
            double racion = comidaDiaria / numAnimales;
            System.out.println("No hay suficiente comida para los animales.");
            System.out.println("Cada animal debera comer " + racion + " kg de comida al dia.");
        }
		
		sc.close();
	}

}
