package Dudas;

import java.io.*;


public class Ejercicio_1 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream file = new  FileOutputStream ("double_ej_1.dat");
			ObjectOutputStream object = new ObjectOutputStream (file);
			
			object.writeDouble(3.2);
			object.writeDouble(33.20);
			object.writeDouble(8.50);
			
			object.close();
		}
		
		catch(FileNotFoundException e) {//este catch viene d ela carga del fichero
			System.out.println("Fichero no encontrado");
			
		}
		catch (IOException e) {//este catch viene del método redline
			System.out.println("Problema de lectura o escritura");
			
		}
		
		try {
			FileOutputStream file1 = new  FileOutputStream ("double_ej_1.dat");
			ObjectOutputStream object1 = new ObjectOutputStream (file1);
			
			while (true) {
				try {
		    		System.out.println("Segunda forma: " + object1.readDouble()); //leo double
					System.out.println("Segunda forma: " + object1.readInt()); //leo int
				}
				catch(EOException e) {
					object1.close();
				}
				//System.out.println("Primera forma: " + object1.readDouble());
			}
		}
	}
}

/*Escribir  3 double
 * leer los 3 double (con un bucle)
 */

/*double[] t = {8.4,7.7, 3.9};

ObjectOutputStream flujoSalida = null;

try {
	flujoSalida = new ObjectOutputStream(new FileOutputStream("double_ej_1.dat"));
	
	for(double n:t) {
		flujoSalida.writeDouble(n);
	}
}

catch(IOException e) {
	System.out.println(e);
}
finally {
	if(flujoSalida != null){
		try {
			flujoSalida.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}

System.out.println("Los numeros son: " + t);*/

/*InputStreamReader is = new InputStreamReader ("double_ejercicio_1.txt"); 
BufferedReader br = new BufferedReader (is);*/
