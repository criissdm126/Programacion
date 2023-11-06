package ANIMAL;

import Programacion_objetos.animal;
import Programacion_objetos.ave;
import Programacion_objetos.gallo;
import Programacion_objetos.gato;
import Programacion_objetos.tigre;

public class Principal {

	public static void main(String[] args) {
		
animal a1 = new animal("domestico", "Paco");
		
		animal a2= new animal("salvaje", "gato");
	
		tigre t1 = new tigre("domestico", "Ana", "Persa");
		
		System.out.println(t1);
	
		tigre t2 = new tigre();
		System.out.println(t2);
		
		ave ave1 = new ave("rojo");
		System.out.println(ave1);
		
		
		gallo g1 = new gallo ("grande");
		System.out.println(g1);
		
		
		gato gato1 = new gato ("siames");
		gato gato2 = new gato("persa");
		
		if(gato1.equals(gato2)){
			System.out.println("Son iguales");
		}
		else {
			System.out.println("son distintos");
		}
		
	}

}



