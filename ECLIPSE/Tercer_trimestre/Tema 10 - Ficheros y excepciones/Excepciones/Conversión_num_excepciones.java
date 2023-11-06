package Excepciones;

public class Conversión_num_excepciones {

public static void main(String[] args) {
		
		int a = 3;
		boolean b = false;
		
		if (a == 1 || a == 0) {
			b = (boolean) (a == 1);
		}
		else { // gestionamos la excepción o el caso en el que "a" no sea 0 ni 1
			
		}
		
		System.out.println(b);

	}


}