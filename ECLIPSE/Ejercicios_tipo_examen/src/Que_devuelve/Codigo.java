package Que_devuelve;

public class Codigo {

	public static void main(String[] args) {
	
		
		Clase1 obj1 = new Clase1 (5,4);
		System.out.print(obj1.modificar(4) + " ");
		
		Clase1 obj2 = new Clase1 (5,4);
		System.out.print(obj2.modificar(5) + " ");
		
		obj2 = obj1;
		System.out.print(obj2.modificar(5) + " ");

	}

}
