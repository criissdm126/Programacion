package Bucles_2;

import java.util.Scanner;

public class contraseña_compareto {

	public static void main(String[] args) {
		
        // Contraseña almacenada en el código
        String contrasenaAlmacenada = "contrasena123";
        int intentosRestantes = 3; // número de intentos restantes
        
        Scanner sc = new Scanner(System.in);
        String contrasenaIntroducida;
        
        // Se sigue preguntando la contraseña hasta que se introduzca la misma
        while (intentosRestantes > 0) {
            System.out.print("Introduce la contraseña: ");
            contrasenaIntroducida = sc.nextLine();
            
            if (contrasenaIntroducida.compareTo(contrasenaAlmacenada) == 0) {
                System.out.println("Contraseña correcta.");
                break;
            } else {
                intentosRestantes--;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + intentosRestantes);
                if (intentosRestantes == 0) {
                    System.out.println("Ya agoto el número de intentos. Intentelo de nuevo en un rato.");
                }
            }
        }
        
        sc.close();
    }

}
