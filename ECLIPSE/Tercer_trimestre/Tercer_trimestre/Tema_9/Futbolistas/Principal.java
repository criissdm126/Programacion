package Futbolistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	
	    public static void main(String[] args) {
	        List<Futbolista> futbolistas = new ArrayList<>();
	        futbolistas.add(new Futbolista("12345678A", "Juan", 25, 10));
	        futbolistas.add(new Futbolista("23456789B", "Pedro", 30, 15));
	        futbolistas.add(new Futbolista("34567890C", "Alberto", 20, 5));
	        futbolistas.add(new Futbolista("45678901D", "Ana", 27, 12));
	        futbolistas.add(new Futbolista("56789012E", "María", 20, 8));

	        System.out.println("Futbolistas ordenados por DNI:");
	        Collections.sort(futbolistas);
	        for (Futbolista f : futbolistas) {
	            System.out.println(f);
	        }

	        System.out.println("Futbolistas ordenados por nombre:");
	        Collections.sort(futbolistas, Futbolista.nombreComparator);
	        for (Futbolista f : futbolistas) {
	            System.out.println(f);
	        }

	     // Ordenar futbolistas por edad y, para aquellos que tienen la misma edad, por nombres
	        Collections.sort(futbolistas, new Comparator<Futbolista>() {
	            public int compare(Futbolista f1, Futbolista f2) {
	                int result = Integer.compare(f1.getEdad(), f2.getEdad());
	                if (result == 0) {
	                    result = f1.getNombre().compareTo(f2.getNombre());
	                }
	                return result;
	            }
	        });

	        // Mostrar futbolistas ordenados por edad y, para aquellos que tienen la misma edad, por nombres
	        for (Futbolista f : futbolistas) {
	            System.out.println(f);
	        }

	}

}
