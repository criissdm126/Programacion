package Arraylist;

import java.util.*;

public class Clientes {
	
	public static void main(String[] args) {
		
		//¿Cómo crear un arrayList de clientes?
		
		
		ArrayList <Integer> edad =new ArrayList<>();
		ArrayList <String> nombre =  new ArrayList<>();
		
		edad.add(20);
		edad.add(5);
		System.out.println("Las edades son: " + edad);
		System.out.println("El tamaño es: " + edad.size());
		
		 nombre.add("Pepe");
		 nombre.add("Juan");
		
		System.out.println("Los nombres son: " +  nombre);
		System.out.println("El tamaño es: " +  nombre.size());
	}
}
