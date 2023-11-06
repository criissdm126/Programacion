package Ficheros;

import java.io.*;
import java.util.*;

public class Firmas {

	public static void main(String[] args) {
		
		leeryescribirFichero("Firmas.txt");

	}
	
	private static void leeryescribirFichero(String nombreFichero) {
		
		int menu =1;
		Scanner sc1 = new Scanner (System.in);
		
		while (menu != 0) {
			menu();
			
			menu = sc1.nextInt();
			
			if (menu == 1) {
				agregarFirma("Firmas.txt");
			}
			
			else if (menu == 2) {
				leerFirmas("Firmas.txt");
			}
			else if(menu == 3) {
				System.out.println("Se acabo el programa.");
			}
	}
}
	
	public static void menu() {
		System.out.println("1. Agregar frima");
		System.out.println("2. Leer frima");
		System.out.println("3. Salir");
	}
	
	public static void agregarFirma(String firmas) {
		Scanner sc = new Scanner(System.in);
		String cad;
		
		try {
			
			
			FileWriter escritor = new FileWriter(firmas); //true indica que se debe abrir el archivo en modo "añadir"
			BufferedWriter bw = new BufferedWriter(escritor);
			
			System.out.println("Escriba un nombre: ");
			String nombre = sc.nextLine();
			
			bw.write("Escribimos desde el programa");
			bw.newLine();
			bw.close(); //sin esto no se escribe nada
			
			
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
	
	public static void leerFirmas(String firmas) {
		String cad2;
		
		try {
			FileReader firma = new FileReader(firmas);
			BufferedReader br = new  BufferedReader(firma);
			
			if((cad2 = br.readLine()) == null) {
				System.out.println("No hay frimas registradas");
			}
			else {
				while((cad2 = br.readLine()) != null) {
					System.out.println(cad2);
				}
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			//e.printStackTrace();
		}
		catch(IOException io) {
			System.out.println("Algun problema de escritura o lectura");
			System.out.println(io.toString());
		}
		
	}

	

}
