package REPASOPRIMERTRIMESTRE;

import java.util.Scanner;

public class Método_Cuenta_Vocales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine().toLowerCase();
        System.out.println(cuentaVocales(frase));
        sc.close();

    }

    static int cuentaVocales(String a) {
        int vocales = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        return vocales;
    }
}
