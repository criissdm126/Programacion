package Ejercicio_7;

import java.util.*;

public class ArrayLisr {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Elemento 1");
		arrayList.add("Elemento 2");
		arrayList.add("Elemento 3");
		arrayList.add("Elemento 4");

		LinkedList<String> linkedList = new LinkedList<>(arrayList);

		for (String elemento : arrayList) {
		    System.out.println(elemento);
		}

		for (String elemento : linkedList) {
		    System.out.println(elemento);
		}


	}

}


//Crea un ArrayList de tipo String, con 4 elementos.
// Cópialo en una LinkedList.
// Recorre ambos mostrando únicamente el valor de cada elemento.