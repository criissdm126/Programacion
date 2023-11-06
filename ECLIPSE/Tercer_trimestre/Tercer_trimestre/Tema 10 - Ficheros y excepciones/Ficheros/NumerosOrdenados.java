package Ficheros;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumerosOrdenados {
	
	/*ENUNCIADO:
	 * En el archivo disponemos de una serie de numeros (uno por línea)
	 * diseña un programa que procese el fichero y nos muestre de menor a mayor
		*/


	public static void main(String[] args) {
		String nombreFichero = "NumerosOrdenados.txt";
		String cadena;
		
		
		try {
			FileReader prueba = new FileReader(nombreFichero);
			BufferedReader b = new BufferedReader(prueba);
			
			while((cadena = b.readLine()) !=null) {
				
				//String[] num = cadena.split(" ");
				System.out.println(cadena);
				
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
