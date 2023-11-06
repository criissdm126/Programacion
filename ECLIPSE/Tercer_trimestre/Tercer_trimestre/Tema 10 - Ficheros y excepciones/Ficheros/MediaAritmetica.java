package Ficheros;
import java.io.*;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		//no muestra nada por consola, sólo "carga" el fichero
		
		String nombreFichero = "media.txt";
		String cadena;
		int media = 0;
		//int contador =0;
		int suma = 0;
		
		try {
			FileReader prueba = new FileReader(nombreFichero);
			BufferedReader b = new BufferedReader(prueba);
			//cadena = b.readLine();		
			
			while((cadena= b.readLine()) !=null) {
				
				String[] trozos = cadena.split(" ");
				for(int i=0; i<trozos.length; i++) {
					suma += Double.parseDouble(trozos[i]);
				}
				
				media = suma/trozos.length;
			}
			System.out.println("La media de las notas es: " + media);
			
		} 
		catch(FileNotFoundException e) {//este catch viene de la carga del fichero
			System.out.println("Fichero no encontrado");
			//e.printStackTrace();
		}
		catch (IOException e) {//este catch viene del método redline
			System.out.println("Problema de lectura o escritura");
			//e.printStackTrace();
		}

	}
}
