package JUEGOS;

import java.util.Scanner;

public class EMAILVÁLIDO {

	public static void main(String[] args) {
		
		System.out.println("Dime su correo electronico: ");
		Scanner sc = new Scanner(System.in);
		
		
		int puntos = 0, arrobas = 0;
		String email = "pepe@gmail.com";
		int longitud = email.length() - 1;
		
		for (int i=0; i<=longitud; i++) {
			if (email.charAt(i)== '@');
			arrobas ++;
			if (email.charAt(i)=='.');
			puntos++;
		}
		
		if((arrobas == 1) && (puntos == 1)) {
			System.out.println("Email valido");
		}
		else {
			System.out.println("Email incorrecto");
		}
		
		System.out.println("pepe@gmail.com".substring(longitud - 3));
		
		
		
		
		sc.close();
	}

}
