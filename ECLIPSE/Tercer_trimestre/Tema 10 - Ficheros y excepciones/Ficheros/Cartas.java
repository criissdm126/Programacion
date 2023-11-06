package Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cartas {

	public static void main(String[] args) {
		String nombreFichero = "Cartas.txt";
		String cadena;
		int cuentapalabras =0;
		int cuentalineas =0;
		int cuentacaracter =0;
		
		
		try {
			FileReader file = new FileReader(nombreFichero);
			BufferedReader buffer = new BufferedReader(file);
			
			while((cadena = buffer.readLine()) !=null) {//redline = si hay algo que leer leo
				
				cuentalineas ++;
				String[] carta= cadena.split(" ");
				System.out.println(cadena);
				cuentapalabras = cuentapalabras + carta.length;
				
				for(int i =0; i<carta.length; i++) {
					cuentacaracter = cuentacaracter + carta[i].length();
				}
				//cuentacaracter = cuentacaracter + cadena.length();
				System.out.println("Tiene " + cuentalineas +" lineas, " + cuentapalabras + " palabras y " + cuentacaracter + " caracteres");
			}

	}
		
		catch(FileNotFoundException e) {//este catch viene d ela carga del fichero
			System.out.println("Fichero no encontrado");
			
		}
		catch (IOException e) {//este catch viene del método redline
			System.out.println("Problema de lectura o escritura");
		}
	}
}