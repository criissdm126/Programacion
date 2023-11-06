package Pagina_337;

import java.io.*;

public class Datos {

	public static void main(String[] args) {
		
		int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		ObjectOutputStream flujoSalida = null;
		
		try {
			flujoSalida = new ObjectOutputStream(new FileOutputStream("Datos.dat"));
			
			for(int n:t) {
				flujoSalida.writeInt(n);
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

	}

}
