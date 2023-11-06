package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) {
		

		leeryescribirFichero("prueba.txt");
		//no muestra nada por consola, sólo "carga" el fichero

	}
	
	private static void leeryescribirFichero(String nombreFichero) {
		/*ejemplo de excepciones comprobadas
		 * si no se gestionan el programa no compila
		 * y por lo tanto no deja ejecutar
		 */
		
		String cadena;
		
		try {
			FileReader prueba = new FileReader(nombreFichero);
			BufferedReader b = new BufferedReader(prueba);
			
			FileWriter escritor = new FileWriter(nombreFichero, true);
			//true indica que se debe abrir el archivo en modo "añadir"
			BufferedWriter bw = new BufferedWriter(escritor);
			bw.write("Escribimos desde el programa");
			bw.newLine();
			bw.close(); //sin esto no se escribe nada
			
			//leer fichero
			while((cadena = b.readLine()) !=null) {
				System.out.println(cadena);
			}
			
		}
		catch(FileNotFoundException e) {//este catch viene d ela carga del fichero
			System.out.println("Fichero no encontrado");
			//e.printStackTrace();
		}
		catch (IOException e) {//este catch viene del método redline
			// e.printStackTrace();
			System.out.println("Algun problema con la lectura o escritura");
			System.out.println(e.toString());
		}
		
		
	}

}
