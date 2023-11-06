package coches;

import java.util.Arrays;
import java.util.Scanner;
import coches.Coche.Accesorio;


public class Concesionario {

	static Coche[] coches = new Coche[10];
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		crearCoche("Toyota", "Dango", crearAccesorios(3));
		crearCocheCombustible("Toyota", "Sami", crearAccesorios(1), "diesel");
		crearCocheElectrico("Toyota", "Evis", crearAccesorios(1), 100);
		crearCocheCombustible("Opel", "Corsa", crearAccesorios(7), "gasolina");
		crearCocheElectrico("Mercedez", "Benz", crearAccesorios(5), 50);
		
		mostrarCoches(coches);
		
		coches[0].verPrecio();
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
		for (int posicion = 0; posicion < coches.length && contador != 1; posicion ++) {
			if (coches[posicion] == null) {
			coches[posicion] = normal;
			normal.precioNormal();
			contador++;	
			}
			else if (coches[coches.length - 1] != null){
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
			if (coches[posicion] == null) {	
			coches[posicion] = combustible;
			combustible.precioCombustible();
			contador++;	
			}
			else if (coches[coches.length - 1] != null){
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
	
	public static void informe(String marca) {
		int numero_coches = 0;
		int numero_coches_electricos = 0;
		int numero_coches_combustible = 0;
		for(int i = 0; i < coches.length; i++) {
			if(coches[i] != null && coches[i].getMarca().compareToIgnoreCase(marca) == 0) {
				numero_coches++;
				if(coches[i].getCoche_electrico() != null) {
					numero_coches_electricos++;
				}
				if(coches[i].getCoche_combustible() != null) {
					numero_coches_combustible++;
				}
			}		
		}
		int coches_normales = numero_coches - (numero_coches_electricos+numero_coches_combustible);
		System.out.println("Hay " + numero_coches + " coches de la marca " + marca);
		System.out.println("Hay " + numero_coches_electricos + " coches electricos, " + numero_coches_combustible + " coches de combustible y " + coches_normales + " coches normales");
	}
	
	public static void ordenarPorPrecio(Coche[]coches) {
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






