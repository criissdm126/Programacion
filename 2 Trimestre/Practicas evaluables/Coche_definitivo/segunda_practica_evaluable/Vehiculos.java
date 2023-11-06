package segunda_practica_evaluable;

import java.util.*;

public class Vehiculos {

	private static coche[] cochesMezclados;


	public static void main(String[] args) {
		
		coche[] coches = new coche[4];
		coches[0] = new coche("Ford", "Fiesta", 15000);
		coches[1] = new CocheElectrico("Tesla", "Model 3", 45000);
		coches[2] = new CocheCombustible("Renault", "Clio", 18000);
		coches[3] = new coche("Seat", "Ibiza", 17000);
		
		// Mostrar todos los coches del array ordenados por precio
		System.out.println("Coches ordenados por precio:");
		Arrays.sort(coches);
		
		for (coche c : coches) {
			System.out.println(c);
		}
		
		// Array de coches mezclados
		cochesMezclados = new coche[6]; // Inicializamos la variable estática
		cochesMezclados[0] = new coche("Ford", "Fiesta", 15000);
		cochesMezclados[1] = new CocheElectrico("Tesla", "Model 3", 45000);
		cochesMezclados[2] = new CocheCombustible("Ford", "Fiesta", 15000.0, 40.0, "B", "C", "diesel", "gasolina");
		cochesMezclados[3] = new coche("Seat", "Ibiza", 17000);
		cochesMezclados[4] = new CocheCombustible("Volkswagen", "Golf", 25000);
		cochesMezclados[5] = new CocheElectrico("Nissan", "Leaf", 35000);

		
		
		// Acciones de arrancar, detenerse,frenar, acelerar
		for (coche c : cochesMezclados) {
			c.arrancar();
			c.acelerar();
			c.frenar();
			c.detenerse();
		}
		
		// Calcular precio total de los coches mezclados
		double precioTotal = 0;
		for (coche c : cochesMezclados) {
			precioTotal = precioTotal + c.verPrecio();
			//precioTotal += c.verPrecio();
		}
		System.out.println("Precio total de los coches mezclados: " + precioTotal);
		
		// Informe de coches de una marca dada
		generarInforme("Seat");
	}
	
	public static void generarInforme(String marca) {
		int total = 0;
		int totalElectricos = 0;
		int totalCombustible = 0;
		int totalOtros = 0;
		for (coche c : cochesMezclados) {
			if (c.getMarca().equals(marca)) {
				total++;
				if (c instanceof CocheElectrico) {
					totalElectricos++;
				}
				else if (c instanceof CocheCombustible) {
					totalCombustible++;
				}
				else {
					totalOtros++;
				}
			}
		}
		
		System.out.println("Informe de coches de la marca " + marca);
		System.out.println("Total de coches: " + total);
		System.out.println("Total de coches electricos: " + totalElectricos);
		System.out.println("Total de coches de combustible: " + totalCombustible);
		System.out.println("Total de coches de otros tipos: " + totalOtros);
	}
}