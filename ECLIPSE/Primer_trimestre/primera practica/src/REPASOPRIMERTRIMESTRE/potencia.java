package REPASOPRIMERTRIMESTRE;

public class potencia {

	public static void main(String[] args) {
		
		int a=3;
		int b=2;
		//3 al cuadrado
		
		int resultado = potencia (b,a);//2 al cubo
		System.out.println(resultado);
		
		System.out.println(potencia(8,2)); //8 al cuadrado
	}
	
	static int potencia (int base, int exponente) {
		
		
		for (int i=1; i<exponente; i++) 
			base*=base;
		
		return base;
	}

}
