package Juegos;

import java.util.Scanner;

public class Ahorcado2 {

    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);
        
        String palabraSecreta = "hola"; // Palabra secreta
        int intentos = 5; // Número de intentos
        
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraAdivinada[i] = '-';
        }
        
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        int numLetrasAdivinadas = 0;
        
        System.out.println("¡Bienvenido al juego del Ahorcado!");
        
        while (intentos > 0) {
            System.out.println("Palabra a adivinar: " + String.valueOf(palabraAdivinada));
            System.out.println("Letras adivinadas: " + String.valueOf(letrasAdivinadas));
            System.out.println("Intentos restantes: " + intentos);
            
            System.out.print("Introduce una letra: ");
            String input = scanner.nextLine().toLowerCase();
            
            char letra = input.charAt(0);
            
            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (letra == palabraSecreta.charAt(i)) {
                    palabraAdivinada[i] = letra;
                    acierto = true;
                }
            }
            
            if (!acierto) {
                intentos--;
                System.out.println("¡Incorrecto! Has perdido un intento.");
            } else {
                letrasAdivinadas[numLetrasAdivinadas] = letra;
                numLetrasAdivinadas++;
            }
            
            if (String.valueOf(palabraAdivinada).equals(palabraSecreta)) {
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

/*
 * con arrays
 * Cada vez que el usuario vaya acertando letras, se mostrará por pantalla todas  las letras acertadas hasta ese momento
 * (como se juega habitualmente al ahorcado)
 */
