package Instanceof;

public class Principal {

	public static void main(String[] args) {
		
		Figura[] figuras = new Figura [3];
		
		figuras[0] = new Circulo ();
		figuras[1] = new Cuadrado();
		figuras[2] = new Circulo();
		
		for(int i=0; i<figuras.length; i++) {
			if(figuras[i] instanceof Circulo) {
				System.out.println("Figura en el indice: " + i + " es un circulo");
			}
			else if (figuras[i] instanceof Cuadrado) {
				System.out.println("Figura en el indice: " + i + " es uncuadrado");
			}
		}
	}

}
