package Tema5;

public class Arrays {

	public static void main(String[] args) {
		
		String semana [] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		for (int i=0; i<semana.length; i++) {
			
			if (i%2 !=0)
			System.out.println(semana[i]);
		}

	}

}
