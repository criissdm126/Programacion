package Bucles_2;

import java.util.*;

public class ContraseñaChar {

	public static void main(String[] args) {
		
        // Contraseña almacenada en el código
        String contrasenaAlmacenada = "contraseña123";
        
        Scanner sc = new Scanner(System.in);
        String contrasenaIntroducida;
        
        // Se sigue preguntando la contraseña hasta que se introduzca la misma
        while (true) {
            System.out.print("Introduce la contraseña: ");
            contrasenaIntroducida = sc.nextLine();
            boolean contrasenaCorrecta = true;
            
            // Comparamos caracter a caracter
            for (int i = 0; i < contrasenaIntroducida.length(); i++) {
                if (contrasenaIntroducida.charAt(i) != contrasenaAlmacenada.charAt(i)) {
                    contrasenaCorrecta = false;
                    break;
                }
            }
            
            if (contrasenaCorrecta) {
                System.out.println("Contraseña correcta.");
                break;
            } else {
                System.out.println("Contraseña incorrecta. Intentalo de nuevo.");
            }
        }
        
        sc.close();
    }
}

/*Se introduce una contraseña en el código.
* Por teclado se pide que se introduzca otra contraseña.
* Hasta que se introduzca la misma seguirá preguntándola
*/
