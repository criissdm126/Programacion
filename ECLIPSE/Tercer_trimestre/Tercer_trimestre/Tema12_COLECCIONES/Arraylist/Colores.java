package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Colores {

	public static void main(String[] args) {
		
		ArrayList <String> colores2 = new ArrayList<>();
		
		colores2.add("Rojo");
		colores2.add("Verde");
		colores2.add("Azul");
		
		colores2.remove("Verde");
		
		System.out.println(colores2.size());
		
		
		ArrayList <String> colores3 = new ArrayList<>(Arrays.asList("Azul", "Verde","Amarillo"));
		
		System.out.println(colores3);
		
		colores3.set(1,"Negro");
		
		System.out.println(colores3);
		
		String a = colores3.get(1);
		System.out.println(a);
		
		
		String [] colores = new String[2];
		 colores[0] = "Morado";
		 colores[1] = "Rosa";
		 colores3.toArray(colores);
		 
		// System.out.println(Arrays.toString(colores));
		 
		 
		 ArrayList <String> colores4 = new ArrayList<>(Arrays.asList(colores));
		 System.out.println(colores4);
		 
		 colores4.removeIf(ejemplo -> ejemplo.contains("a"));
		 
		 colores4.stream()
		 .map(p->p.toLowerCase())
		 .filter(p->p.contains("a"))
		 .forEach(System.out::println);

		 
		

	}

}
