package Ficheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ListaNumeros {
	
	/*ENUNCIADO:
	 * Leer de dos ficheros dos listas de números (cada número estará en una línea).
	 * Añadir los números leídos en un array.
	 * Escribir los números ordenados en un tercer fichero*/
	private static boolean append;

	public static void main(String[] args, String fileName) {
		
		String nombreFichero = "Lista1.txt";
		String fichero = "Lista2.txt";
		String cadena;
		double num =0;
		double arrays [] = new double [0];
		
		try {
			
			//fichero 1 (15 22 5 4)
			FileReader prueba = new FileReader(nombreFichero);
			BufferedReader b = new BufferedReader(prueba);
			
			while((cadena = b.readLine()) !=null) {
				
				arrays = Arrays.copyOf(arrays, arrays.length +1 );
				
				num = Double.parseDouble(cadena);
					
				arrays[arrays.length - 1] = num;
				System.out.println(cadena);
			}
			
			System.out.println(" ");
			
			//Fichero numero 2, poder verlo (5 9 3 6)
			FileReader file = new FileReader(fichero);
			BufferedReader buffer = new BufferedReader(file);
			
			while((cadena = buffer.readLine()) !=null) {
				arrays = Arrays.copyOf(arrays, arrays.length + 1);
				
				num = Double.parseDouble(cadena);
					
				arrays[arrays.length - 1] = num;
				System.out.println(cadena);
			}
			
			FileWriter vocal = new FileWriter(fileName:"Lista3.txt", append: true); //true indica que se debe abrir el archivo en modo "añadir"
			BufferedWriter bw = new BufferedWriter(vocal);
			
			Arrays.sort(arrays);
			bw.newLine();
			bw.write(Arrays.toString(arrays));
			bw.close();
			
		} 
		catch(FileNotFoundException e) {//este catch viene d ela carga del fichero
			System.out.println("Fichero no encontrado");
			
		}
		catch (IOException e) {//este catch viene del método redline
			System.out.println("Problema de lectura o escritura");
			System.out.println(e.toString());
			
		}

	}

}
