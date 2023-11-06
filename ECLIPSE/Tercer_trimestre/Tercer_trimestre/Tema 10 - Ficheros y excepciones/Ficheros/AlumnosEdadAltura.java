package Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AlumnosEdadAltura {
	
	/* ENUNCIADO:
	 * Leer der un fichero nombres de alumnos, su edad y altura
	 * Paco 20 1,77
	 * Pepe 23 1,70
	 * Maria 22 1,67
	 * 
	 * Mostrar por pantalla:
	 * Paco tiene 20 años y mide 1,77
	 * Pepe tiene 23 años y mide 1,70
	 * Maria tiene 22 años y mide 1,67
	 */

	public static void main(String[] args) {
		String nombreFichero = "AlumnosEdadAltura.txt";
		String cadena;
		
		
		try {
			File archivo = new File("AlumnosEdadAltura.txt");
			Scanner scanner = new Scanner(archivo);
			
			while((scanner.hasNext())) {
				String nombre = scanner.next();
				int edad = scanner.nextInt();
				double altura = scanner.nextDouble();
				
				System.out.println(nombre + " tiene " + edad + " años y mide " + altura + " cm.");
			}
			scanner.close();
			
		} 
		catch(FileNotFoundException e) {//este catch viene d ela carga del fichero
			System.out.println("Fichero no encontrado");
			
		}
		catch (IOException e) {//este catch viene del método redline
			System.out.println("Problema de lectura o escritura");
			
		}

	}

}

