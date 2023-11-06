package segunda_practica_evaluable;

import java.util.Arrays;
import segunda_practica_evaluable.coche.Accesorio;



public class Concesionario {

	static coche[] cochesMezclados;


	public static void main(String[] args) {
		
		coche[] coches = new coche[4];
		coches[0] = new coche("Ford", "Fiesta", 15000);
		coches[1] = new CocheElectrico("Tesla", "Model 3", 45000);
		coches[2] = new CocheCombustible("Renault", "Clio", 18000);
		coches[3] = new coche("Seat", "Ibiza", 17000);
		
		// Mostrar todos los coches del array ordenados por precio
		System.out.println("Coches ordenados por precio:");
		Arrays.sort(coches);
		//Arrays.toString(coches);
		
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
			precioTotal += c.verPrecio(); 
			//precioTotal += c.verPrecio();
		}
		System.out.println("Precio total de los coches mezclados: " + precioTotal);
		
		// Informe de coches de una marca dada
		generarInforme("Volkswagen");
	}
	
	//CREAR ACCESORIO
	public static Accesorio[] nuevoAccesorios(int menu) {

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
	
	//CREAR COCHE
	public static void crearCoche(String marca, String modelo, Accesorio[] accesorios) {
		coche normal = new coche(marca, modelo, accesorios);
		int contador = 0;
		for (int posicion = 0; posicion < coche.length && contador != 1; posicion ++) {
			if (coches[posicion] == null) {
			coche[posicion] = normal;
			normal.verPrecio();
			contador++;	
			}
			else if (coche[coche.length - 1] != null){
				System.err.println("Error: El concesionario esta lleno");
			contador++;	
			}
		}
	}
	
	//ELECTRICO
	
	public static void crearCocheElectrico(String marca, String modelo, Accesorio[] accesorios, double potencia) {
		Bateria b = new Bateria(potencia);
		CocheElectrico electrico = new CocheElectrico(marca, modelo, accesorios, b);
		electrico.setCocheElec(electrico);
		int contador = 0;
		for (int posicion = 0; posicion < coches.length && contador != 1; posicion ++) {
			if (coche[posicion] == null) {
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
	

	//COMBUSTIBLE
	public static void crearCocheCombustible(String marca, String modelo, Accesorio[] accesorios, String deposito) {
		Deposito d = new Deposito(deposito);
		CocheCombustible combustible = new CocheCombustible(marca, modelo, accesorios, d);
		combustible.setCochCom(combustible);
		int contador = 0;
		for (int posicion = 0; posicion < coches.length && contador != 1; posicion ++) {
			if (coches[posicion] == null) {	
			coches[posicion] = combustible;
			combustible.precioCombustible();
			contador++;	
			}
			else if (coche [coche.lenght - 1] != null){
				System.err.println("Error: El concesionario esta lleno");
			contador++;	
			}
		}
	}

	//vercoches
	public static void mostrarCoches(coche[]coches) {
		ordenarPorPrecio(coches);
		double precioFinal=0;
		for(int i = 0; i < coches.length; i++) {
			if(coches[i] != null) {
			precioFinal = coches[i].getPrecioBase() + precioFinal;
			System.out.println(coches[i].toString());
			System.out.println();
			}
		}
		System.out.println("El precio total del concesionario es de: " + precioFinal);
		System.out.println();
	}


	private static void ordenarPorPrecio(coche[] coches) {
		// TODO Auto-generated method stub
		
	}

	//GENERAR INFORME
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