package Tema_7;

public class animal_prueba {

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
		g1.getColor("verde");
		



	}

}
