package CUBO;

public class Principal {

	public static void main(String[] args) {
   Cubo cubo1 = new Cubo(5);
		
		System.out.println(cubo1.capacidad);
		System.out.println(cubo1.getCapacidad());
		
		Cubo cubo3=new Cubo(3);
		System.out.println("el contenido es " + cubo3.getContenido());
		
		
		cubo3.llenar();
		
		cubo3.vaciar();
		
		System.out.println("el contenido es " + cubo3.getContenido());
		
		cubo1.llenar();
		cubo3.volcar(cubo1, 2);
		
		System.out.println("el contenido de cubo 3 es " + cubo3.getContenido());
		System.out.println("el contenido de cubo 1 es " + cubo1.getContenido());

	}

}

