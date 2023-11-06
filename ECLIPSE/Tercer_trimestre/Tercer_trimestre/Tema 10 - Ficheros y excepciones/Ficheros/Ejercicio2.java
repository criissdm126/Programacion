package Ficheros;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		leerFichero("prueba.txt");
		//no muestra nada por consola, sólo "carga" el fichero

	}
	
	private static void leerFichero(String nombreFichero) {
		/*ejemplo de excepciones comprobadas
		 * si no se gestionan el programa no compila
		 * y por lo tanto no deja ejecutar
		 */
		
		String cadena;
		
		try {
			FileReader prueba = new FileReader(nombreFichero);
			BufferedReader b = new BufferedReader(prueba);
			
			while((cadena = b.readLine()) !=null) {
				System.out.println(cadena);
			}
		}
		catch(FileNotFoundException e) {//este catch viene d ela carga del fichero
			System.out.println("Fichero no encontrado");
			//e.printStackTrace();
		}
		catch (IOException e) {//este catch viene del método redline
			e.printStackTrace();
		}
		
		
	}

}
