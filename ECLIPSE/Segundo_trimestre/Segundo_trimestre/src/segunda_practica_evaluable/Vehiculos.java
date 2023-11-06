package segunda_practica_evaluable;

import java.util.*;
import segunda_practica_evaluable.Coche.Accesorio;

public class Vehiculos {
	
	static Coche[] cochesMezclados = new Coche [10];
	public static void main(String[] args) {
		
		crearCoche("Ford", "Fiesta", crearAccesorios(5));
		crearCocheCombustible("Volkswagen", "Golf", crearAccesorios(4), "diesel");
		crearCocheElectrico("Tesla", "Model 3", crearAccesorios(6), 100);
		crearCocheCombustible("Ford", "Fiesta", crearAccesorios(2), "gasolina");
		crearCocheElectrico("Nissan", "Leaf", crearAccesorios(1), 50);
		
		
		//mostrarCoches(cochesMezclados);
		
		cochesMezclados[0].verPrecio();
		//Coche c1 = new Coche("Ford", "Fiesta", crearAccesorios(0));
	//	cochesMezclados[0] = c1;
		mostrarCoches(cochesMezclados);
	}
	
	public static void generarInforme(String marca) {
		int total = 0;
		int totalElectricos = 0;
		int totalCombustible = 0;
		for(int i = 0; i < cochesMezclados.length; i++) {
			if(cochesMezclados[i] != null && cochesMezclados[i].getMarca().compareToIgnoreCase(marca) == 0) {
				total++;
				if(cochesMezclados[i].getCocheElect() != null) {
					totalElectricos++;
				}
				if(cochesMezclados[i].getCocheComb() != null) {
					totalCombustible++;
				}
			}		
		}
		int normal = total - (totalElectricos + totalCombustible);
		System.out.println("Hay " + total + " coches de la marca " + marca);
		System.out.println("Hay " + totalElectricos + " coches electricos, " + totalCombustible + " coches de combustible y " + normal + " coches normales");
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
				normal.getPrecioBase();
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
		electrico.setCocheElect(electrico);  
		int contador = 0;
		for (int posicion = 0; posicion < cochesMezclados.length && contador != 1; posicion ++) {
			if (cochesMezclados[posicion] == null) {
				cochesMezclados[posicion] = electrico;
			electrico.precioElectrico();
			contador++;	
			}
			else if (cochesMezclados[cochesMezclados.length - 1] != null){
				System.err.println("Error: El concesionario esta lleno");
			contador++;	
			}
		}
	}
		
	public static void crearCocheCombustible(String marca, String modelo, Accesorio[] accesorios, String deposito) {
		Deposito d = new Deposito(deposito);
		CocheCombustible combustible = new CocheCombustible(marca, modelo, accesorios, d);
		combustible.setCocheComb(combustible);  
		int contador = 0;
		for (int posicion = 0; posicion < cochesMezclados.length && contador != 1; posicion ++) {
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
		ordenarPrecio(coches);
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

	private static void ordenarPrecio(Coche[] coches) {
		for (int i = 0; i < coches.length - 1; i++) {
            for (int j = 0; j < coches.length - i - 1; j++) {
                if (coches[j] != null && coches[j + 1] != null && coches[j].getPrecioFinal() > coches[j + 1].getPrecioFinal()) {
                    Coche temp = coches[j];
                    coches[j] = coches[j + 1];
                    coches[j + 1] = temp;
                }
            }
        }

	}

}