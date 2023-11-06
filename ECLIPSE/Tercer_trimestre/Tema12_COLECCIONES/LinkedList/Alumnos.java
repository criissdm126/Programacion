package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Alumnos {

	public static void main(String[] args) {
		
		List<String> lista =  new ArrayList<>();
		LinkedList<Integer> lista2 = new LinkedList<>();
		
   LinkedList<String> alumnos = new LinkedList<String>();
   List<String> personas2  = new LinkedList<String>();
   
   alumnos.add("Pepe");
   alumnos.add("Maria");
   alumnos.add("Paco");
   
   System.out.println(alumnos.get(0));
   
   alumnos.addFirst("Ana");
   System.out.println(alumnos.get(0));
   System.out.println(alumnos.get(1));

	}

}
