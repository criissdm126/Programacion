package segunda_practica_evaluable;

import java.util.*;
import segunda_practica_evaluable.Coche.Accesorio;

public class Vehiculos {

	private static Coche[] cochesMezclados;


	public static void main(String[] args) {
		
		Coche[] coches = new Coche[4];
		coches[0] = new Coche("Ford", "Fiesta", 15000);
		coches[1] = new CocheElectrico("Tesla", "Model 3", 45000);
		coches[2] = new CocheCombustible("Renault", "Clio", 18000);
		coches[3] = new Coche("Seat", "Ibiza", 17000);
		
		// Mostrar todos los coches del array ordenados por precio
		System.out.println("Coches ordenados por precio:");
		Arrays.sort(coches);
		
		for (Coche c : coches) {
			System.out.println(c);
		}
		
		// Array de coches mezclados
		/*cochesMezclados = new Coche[6]; // Inicializamos la variable estática
		cochesMezclados[0] = new Coche("Ford", "Fiesta", 15000);
		cochesMezclados[1] = new CocheElectrico("Tesla", "Model 3", 45000);
		cochesMezclados[2] = new CocheCombustible("Ford", "Fiesta", 15000.0);
		cochesMezclados[3] = new Coche("Seat", "Ibiza", 17000);
		cochesMezclados[4] = new CocheCombustible("Volkswagen", "Golf", 25000);
		cochesMezclados[5] = new CocheElectrico("Nissan", "Leaf", 35000);*/

		
		
		// Acciones de arrancar, detenerse,frenar, acelerar
		for (Coche c : cochesMezclados) {
			c.arrancar();
			c.acelerar();
			c.frenar();
			c.detenerse();
		}
		
		// Calcular precio total de los coches mezclados
		double precioTotal = 0;
		for (Coche c : cochesMezclados) {
			precioTotal = precioTotal + c.verPrecio();
			//precioTotal += c.verPrecio();
		}
		System.out.println("Precio total de los coches mezclados: " + precioTotal);
		
		// Informe de coches de una marca dada
		generarInforme("Ford");
	}
	
	public static void generarInforme(String marca) {
		int total = 0;
		int totalElectricos = 0;
		int totalCombustible = 0;
		int totalOtros = 0;
		for (Coche c : cochesMezclados) {
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
	
	public static Accesorio[] crearAccesorios(int menu) {
		if (menu == 1) {
			Accesorio[] accesorios3 = {Accesorio.TECHO, Accesorio.NAVEGADOR, Accesorio.ASIENTOS_CALEFACTABLES};
			return  accesorios3;
		}
		else if (menu == 2) {
			Accesorio[] accesoriosTechoNavegador = {Accesorio.TECHO, Accesorio.NAVEGADOR};
			return	accesoriosTechoNavegador;
		}
		else if (menu == 3) {
			Accesorio[] accesoriosTechoAsiento_Calefactable = {Accesorio.TECHO, Accesorio.ASIENTOS_CALEFACTABLES};
			return accesoriosTechoAsiento_Calefactable;
		}
		else if (menu == 4) {
			Accesorio[] accesoriosNavegadorAsiento_Calefactable = {Accesorio.NAVEGADOR, Accesorio.ASIENTOS_CALEFACTABLES};
			return accesoriosNavegadorAsiento_Calefactable;
		}
		else if (menu == 5) {
			Accesorio[] accesoriosTecho = {Accesorio.TECHO};
			return accesoriosTecho;
		}
		else if (menu == 6) {
			Accesorio[] accesoriosNavegador = {Accesorio.NAVEGADOR};
			return accesoriosNavegador;
		}
		else if (menu == 7) {
			Accesorio[] accesoriosAsiento_calefactables = {Accesorio.ASIENTOS_CALEFACTABLES};
			return accesoriosAsiento_calefactables;
		}
		else {
			Accesorio[] sin_accesorios = new Accesorio[0];
			return sin_accesorios;
		}

		
	}
	
	public static void crearCoche(String marca, String modelo, Accesorio[] accesorios) {
		Coche normal = new Coche(marca, modelo, accesorios);
		int contador = 0;
		for (int posicion = 0; posicion < cochesMezclados.length && contador != 1; posicion ++) {
			if (cochesMezclados[posicion] == null) {
				cochesMezclados[posicion] = normal;
			normal.precioNormal();
			contador++;	
			}
			else if (cochesMezclados[cochesMezclados.length - 1] != null){
				System.err.println("Error: El concesionario esta lleno");
			contador++;	
			}
		}
	}
	
	public static void crearCocheElectrico(String marca, String modelo, Accesorio[] accesorios, double potencia) {
		Bateria b = new Bateria(potencia);
		CocheElectrico electrico = new CocheElectrico(marca, modelo, accesorios, b);
		electrico.setCoche_electrico(electrico);
		int contador = 0;
		for (int posicion = 0; posicion < coches.length && contador != 1; posicion ++) {
			if (coches[posicion] == null) {
			coches[posicion] = electrico;
			electrico.precioElectrico();
			contador++;	
			}
			else if (coches[coches.length - 1] != null){
				System.err.println("Error: El concesionario esta lleno");
			contador++;	
			}
		}
	}
		
	public static void crearCocheCombustible(String marca, String modelo, Accesorio[] accesorios, String deposito) {
		Deposito d = new Deposito(deposito);
		CocheCombustible combustible = new CocheCombustible(marca, modelo, accesorios, d);
		combustible.setCoche_combustible(combustible);
		int contador = 0;
		for (int posicion = 0; posicion < coches.length && contador != 1; posicion ++) {
			if (cochesMezclados[posicion] == null) {	
				cochesMezclados[posicion] = combustible;
			combustible.precioCombustible();
			contador++;	
			}
			else if (cochesMezclados[cochesMezclados.length - 1] != null){
				System.err.println("Error: El concesionario esta lleno");
			contador++;	
			}
		}
	}
	
	public static void mostrarCoches(Coche[]coches) {
		ordenarPorPrecio(coches);
		double precioFinal=0;
		for(int i = 0; i < coches.length; i++) {
			if(coches[i] != null) {
			precioFinal = coches[i].getPrecioFinal() + precioFinal;
			System.out.println(coches[i].toString());
			System.out.println();
			}
		}
		System.out.println("El precio total del concesionario es de: " + precioFinal);
		System.out.println();
	}

}