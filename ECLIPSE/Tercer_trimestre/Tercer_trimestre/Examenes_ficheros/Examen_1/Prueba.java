package Examen_1;
import java.io.*;
import java.util.*;

public class Prueba {

	public static void main(String[] args) throws IOException {
		/*String nombreFichero = "Examen_1.txt";
		String  cadena;
		String palabra = "fin";
		String usuario = sc.next();*/
		crearFichero("Examen_1.txt");
	}
	public static void crearFichero(String nombreFichero) {
		System.out.println("Escriba varias palabras, cuando ponga fin se acabara el programa: ");
		Scanner sc = new Scanner(System.in);
		
		InputStreamReader usu = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (usu);
		
		String cadena = "";
		
		try {
			
			while(!(cadena.equalsIgnoreCase("fin"))) {
				
				cadena = br.readLine();
				
				FileWriter fw = new FileWriter(nombreFichero, true); //true indica que se debe abrir el archivo en modo "añadir"
				BufferedWriter bw = new BufferedWriter(fw);
				
				if(cadena.equalsIgnoreCase("fin")) {
					
					bw.newLine();
					bw.close();
				
			
			}
				else {
					bw.write(cadena);
					bw.newLine();
					bw.close();
		}
				
			}
			FileReader lector = new FileReader("Examen_1.txt");
			BufferedReader br2 = new BufferedReader (lector);
			
			while((cadena = br2.readLine()) != null) {
				System.out.println(cadena);
			}
			
		}
		
		catch(FileNotFoundException e) {//este catch viene d ela carga del fichero
			System.out.println("Fichero no encontrado");
			//e.printStackTrace();
		}
		catch (IOException e) {//este catch viene del método redline
			//e.printStackTrace();
			
			System.out.println("Problema de lectura o escritura");
			System.out.println(e.toString());
		}
		
	}
	

}
/*Escribir fichero lineas que vaya escribiendo el usuario por teclado
 * hasta que escriba fin, no aparecera por teclado
 * mostrarlo por pantalla
 */
