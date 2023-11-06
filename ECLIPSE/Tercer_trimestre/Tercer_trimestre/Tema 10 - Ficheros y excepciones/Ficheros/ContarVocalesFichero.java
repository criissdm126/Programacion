package Ficheros;

import java.io.*;

public class ContarVocalesFichero {

	public static void main(String[] args) {
	 
		String nombreFichero = "vocales.txt";
		String palabra;
		int vocales = 0;
		
		try {
			FileReader prueba = new FileReader(nombreFichero);
			BufferedReader b = new BufferedReader(prueba);
			
			while((palabra = b.readLine()) !=null) {
				System.out.println(palabra);
				for (int i=0; i<palabra.length(); i++) {
					if((palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o'|| palabra.charAt(i) == 'u')) {
						vocales ++;
					}
				}
			}
			System.out.println("El total de vocales es: " + vocales);
			
			/*FileWriter vocal = new FileWriter(nombreFichero, true);
			//true indica que se debe abrir el archivo en modo "añadir"
			
			BufferedWriter bw = new BufferedWriter(vocal);
			bw.write("El total de vocales es: " + vocales);
			bw.newLine();
			bw.close();*/
			
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
