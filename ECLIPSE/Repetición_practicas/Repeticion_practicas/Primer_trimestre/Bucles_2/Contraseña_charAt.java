package Bucles_2;

import java.util.Scanner;

public class Contraseña_charAt {

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

            if (contrasenaIntroducida.length() != contrasenaAlmacenada.length()) {
                System.out.println("Contraseña incorrecta. Intentos restantes: " + --intentosRestantes);
                if (intentosRestantes == 0) {
                    System.out.println("Ya agoto el nomero de intentos. Intentelo de nuevo en un rato.");
                    break;
                }
                continue;
            }

            boolean coincide = true;
            for (int i = 0; i < contrasenaAlmacenada.length(); i++) {
                if (contrasenaAlmacenada.charAt(i) != contrasenaIntroducida.charAt(i)) {
                    coincide = false;
                    break;
                }
            }

            if (coincide) {
                System.out.println("Contraseña correcta.");
                break;
            } else {
                System.out.println("Contraseña incorrecta. Intentos restantes: " + --intentosRestantes);
                if (intentosRestantes == 0) {
                    System.out.println("Ya agoto el nomero de intentos. Intentelo de nuevo en un rato.");
                }
            }
        }

        sc.close();
    }

}
