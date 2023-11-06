package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class CuentaVocales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine().toLowerCase();
        int cantidadVocales = contarVocales(frase);
        System.out.println("La frase tiene " + cantidadVocales + " vocales.");
        sc.close();
    }

    static int contarVocales(String a) {
        int vocales = 0;
        for (int i = 0; i < a.length(); i++) {
            char letra = a.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        return vocales;
    }
}
