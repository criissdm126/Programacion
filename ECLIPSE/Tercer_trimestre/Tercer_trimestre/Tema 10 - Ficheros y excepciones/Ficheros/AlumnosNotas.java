package Ficheros;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AlumnosNotas {
	
	/*ENUNCIADO
	 * Fichero entrada:

	Marta 3 6 5
	Pepe 2 7 9
	Mario 10 4 3

	Fichero salida:

	Marta 4,6
	Pepe 6
	Mario 5,6*/

	public static void main(String[] args) {
		//leerFichero("alumnos.txt");
		String nombreFichero = "alumnos.txt";
		String cadena;
		int media = 0;
		int suma = 0;
		
		try {
			FileReader prueba = new FileReader(nombreFichero);
			BufferedReader b = new BufferedReader(prueba);
			
			while((cadena = b.readLine()) !=null) {
				
				String[] num = cadena.split(" ");
				System.out.println(cadena);
				
				for(int i =0; i<cadena.length(); i++) {
					suma += Double.parseDouble(num[i]);
				}
				media = suma/num.length;
			}
			System.out.println("La media de Ana es: " + media);
			
			/*FileWriter vocal = new FileWriter(nombreFichero, true); //true indica que se debe abrir el archivo en modo "añadir"
			BufferedWriter bw = new BufferedWriter(vocal);
			
			bw.write("la media es: " + media);
			bw.newLine();
			bw.close();*/
			
		} 
		catch(FileNotFoundException e) {//este catch viene d ela carga del fichero
			System.out.println("Fichero no encontrado");
			
		}
		catch (IOException e) {//este catch viene del método redline
			System.out.println("Problema de lectura o escritura");
			
		}

	}

}

