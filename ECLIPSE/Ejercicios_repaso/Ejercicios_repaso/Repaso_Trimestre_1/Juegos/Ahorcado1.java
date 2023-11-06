package Juegos;

import java.util.Scanner;

public class Ahorcado1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String palabraSecreta = "casita"; // Palabra secreta
        int intentos = 5; // Número de intentos
        
        StringBuilder palabraAdivinada = new StringBuilder();
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraAdivinada.append("-");
        }
        
        System.out.println("¡Bienvenido al juego del Ahorcado!");
        
        while (intentos > 0) {
            System.out.println("Palabra a adivinar: " + palabraAdivinada.toString());
            System.out.println("Intentos restantes: " + intentos);
            
            System.out.print("Introduce una letra: ");
            String letra = scanner.nextLine().toLowerCase();
            
            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (letra.charAt(0) == palabraSecreta.charAt(i)) {
                    palabraAdivinada.setCharAt(i, letra.charAt(0));
                    acierto = true;
                }
            }
            
            if (!acierto) {
                intentos--;
                System.out.println("¡Incorrecto! Has perdido un intento.");
            }
            
            if (palabraAdivinada.toString().equals(palabraSecreta)) {
                System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
                break;
            }
        }
        
        if (intentos == 0) {
            System.out.println("¡Lo siento! Has agotado tus intentos. La palabra secreta era: " + palabraSecreta);
        }
        
        scanner.close();
    }
}


/* Primero se mostrará tantos guiones como letras tenga la palabra secreta.
 * El usuario dispondrá de X intentos, que se irán decrementando tanto si acierta  como si no.
 * Si la letra que introduce el usuario está en la palabra secreta se muestran las  casillas correspondientes, sino se muestra
 * Al final de los intentos se le pedirá al usuario que intente adivinar la palabra  finalmente
 */
