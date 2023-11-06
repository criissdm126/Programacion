package Ejerciciosexamen;

public class Ejercicio_6 {

	public static void main(String[] args) {
		
		

	}
	static int maximoArray (int miArray[]) {
		
		int maximo = miArray[0];
		
		for (int i=1; i<miArray.length; i++) {
			if (miArray[i]>maximo) maximo=miArray[i];
			
			return maximo;
		}
		return maximo;
	}

}
