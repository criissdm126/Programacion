package Interfaces_2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		
		empleado e1 = new empleado (7, "Pepe");
		empleado e2 = new empleado (2, "Paco");
		empleado e3 = new empleado (3, "Maria");
		empleado e4 = new empleado (3, "Ana");
		empleado e5 = new empleado (5, "Susana");
		
		empleado arrayEmpleados[] = {e1, e2, e3, e4, e5};
		
		
		System.out.println("Antes de ordenar:");
		System.out.println(Arrays.toString(arrayEmpleados));
		
		
		//ordenaID(arrayEmpleados);
		//ordenaNombre(arrayEmpleados);
		
		Arrays.sort(arrayEmpleados);
		
		System.out.println("Despues de ordenar:");
		System.out.println(Arrays.toString(arrayEmpleados));
		

	}
	

	//ordenar por ID
	static void ordenaID(empleado[] arrayAOrdenar) {
		
		empleado aux;
		for(int i = 1; i<arrayAOrdenar.length ; i++) {
			for (int j = 1; j <arrayAOrdenar.length; j++) {
				if(arrayAOrdenar[j].getId_empleado() > arrayAOrdenar[j+1].getId_empleado()) {
					aux = arrayAOrdenar [j];
					arrayAOrdenar [j] = arrayAOrdenar [j + 1];
					arrayAOrdenar [j + 1] = aux;
				}
			}
		}
	}
		
		/*generar variable auxiliar para intercambiar
		 * utilizar burbuja
		 * recorrer las posiciones del array excepto la última
		 * si el id es mayor que el anterior se intercambian las posiciones
		 */
	

	//ordenar por nombre
	static void ordenaNombre(empleado[] arrayAOrdenar) {
		
		empleado aux;
		for(int i = 1; i<arrayAOrdenar.length ; i++) {
			for (int j = 1; j <arrayAOrdenar.length; j++) {
				if(arrayAOrdenar[j].getNombre().compareTo(arrayAOrdenar[j+1].getNombre()) >= 0) {
					aux = arrayAOrdenar [j];
					arrayAOrdenar [j] = arrayAOrdenar [j + 1];
					arrayAOrdenar [j + 1] = aux;
				}
			}
		}
	}
	
	
	//ordenar primero por id y en segundo lugar por nombre, si dos coinciden alfabeticamente
	//public static empleado[]

}