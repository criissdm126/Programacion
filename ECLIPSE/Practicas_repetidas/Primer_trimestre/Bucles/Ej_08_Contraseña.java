package Bucles;

import java.util.*;

public class Ej_08_Contraseña {

	public static void main(String[] args) {
			        
		String contrasenaAlmacenada = "hola123";// Contraseña guardada
	        
	     Scanner sc = new Scanner(System.in);
	      String contrasenaIntroducida;
  
		do {

            System.out.print("Introduce la contraseña:"); 
            contrasenaIntroducida = sc.nextLine();

            if (contrasenaIntroducida.equals(contrasenaAlmacenada)) {
                System.out.println("Contraseña correcta.");
            }
            else {
                System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
            }

		}while(!contrasenaIntroducida.equals(contrasenaAlmacenada));

    }
}
/*Se introduce una contraseña en el código.
* Por teclado se pide que se introduzca otra contraseña.
* Hasta que se introduzca la misma seguirá preguntándola
*/

