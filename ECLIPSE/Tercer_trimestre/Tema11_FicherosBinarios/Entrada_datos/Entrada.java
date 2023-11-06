package Entrada_datos;

import java.io.*;

public class Entrada {

	public static void main(String[] args) {
		
		InputStreamReader is = new InputStreamReader (System.in); 
		BufferedReader br = new BufferedReader (is);
		
		int a = 0;
		boolean error = false;
		
		
		do {
			System.out.println("Escribe un numero: ");
			try {
				a = Integer.parseInt(br.readLine());
				error = false;
			}
			catch (IOException e) {
				System.out.println("Problema de lectura de datos");
			}
			catch(NumberFormatException n) {
				System.out.println("El numero no es correcto");
				error = true;
			}
		}	
		while(error == true); 
		
		
		System.out.println("Lo que a escrito multiplicado por 2, es: " + a*2);

	}

}
