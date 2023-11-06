package JUEGOS;

import java.util.Scanner;

public class VocalesyConsonantes {

    public static void main(String[] args) {
        
        int cuentavocales = 0;
        String total ="";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            System.out.println(letra);
            total = total + letra;
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                cuentavocales++;
            }
        }
        
        System.out.println("");
        for (char letra = 'b'; letra <= 'z'; letra += 2) {
            System.out.println(letra);
            total = total + letra;
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cuentavocales++;
            }
        }
        
        System.out.println("");
        for (char letra = 'a'; letra <= 'z'; letra += 2) {
            System.out.println(letra);
            total = total + letra;
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cuentavocales++;
            }
        }
        
        System.out.println("");
        for (char letra = 'z'; letra >= 'a'; letra--) {
            System.out.println(letra);
            total = total + letra;
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cuentavocales++;
            }
        }
        
        System.out.println("");
        for (int i = 1; i <= 26; i++) {
            System.out.print("_");
        }
        
        System.out.println("");
        System.out.println("Has generado: " + total.length() + " letras");
        System.out.println("Has puesto: " + cuentavocales+ " vocales");

    }

}




