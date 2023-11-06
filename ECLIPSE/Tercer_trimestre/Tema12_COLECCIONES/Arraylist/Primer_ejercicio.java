package Arraylist;

import java.util.*;

public class Primer_ejercicio {

	public static void main(String[] args) {
		// añado 3 elementos sin especificar el tamaño
		ArrayList<String> milista = new ArrayList<>();
		
		milista.add("Rojo");
		milista.add("Verde");
		milista.add("Amarillo");
		
		
		System.out.println("El tamaño de la listas es: " + milista.size());
		//muestro lista
		System.out.println(milista);
		
		
		//otro arraylist
      ArrayList<Integer> milista2 = new ArrayList<>();
		
		milista2.add(3);
		milista2.add(2);
	
		
		//milista2.remove(2); //exception fuera de rango
		//milista2.remove(0); //quito el elemento de la posicion 0
		//milista2.remove(Integer.valueOf(2)); //borro el numero 2
		
		Integer a = milista2.get(0); //obtengo el elemento de la posición 0
		System.out.println(a);
		//error de compilación al meter un double en milista2.add(3.4);
		System.out.println(milista2);
	}

}
