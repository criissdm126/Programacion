package Pagina_337;

import java.io.*;
import java.util.Arrays;

public class Datos2 {

	public static void main(String[] args) {
		
	//ObjectInputStream objeto = new ObjectInputStream(new FileInputStream("Datos.dat"));
		
		//pagina 340 11.4
		
		//int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		ObjectOutputStream flujoSalida = null;
		
		try (ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("Datos.dat"))){
			int [] t = new int[10];
			
			for (int i=0; i<t.length; i++) {
				t[i] = flujoEntrada.readInt();
			}
			
			System.out.println(Arrays.toString(t));
			
		}
		catch(IOException ex) {
			System.out.println("Error lectura.");
		}

	}

}
