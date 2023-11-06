package Ficheros;

//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		leerFichero("prueba.txt");
		//no muestra nada por consola, sólo "carga" el fichero

	}
	
	private static void leerFichero(String nombreFichero) {
		/*ejemplo de excepciones comprobadas
		 * si no se gestionan el programa no compila
		 * y por lo tanto no deja ejecutar
		 */
		
		// FileReader hola = new FileReader(nombreFichero);
		
		try {
			FileReader hola = new FileReader(nombreFichero);
		}
		catch(FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			//e.printStackTrace();
		}
		
		
	}

}
