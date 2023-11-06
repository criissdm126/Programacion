package Bucles_2;

import java.util.Scanner;

public class TrocearNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos un número de al menos dos dígitos
        int numero = 0;
        while (numero < 10) {
            System.out.print("Introduce un numero de al menos dos digitos: ");
            numero = scanner.nextInt();
        }

        // Troceamos el número y lo mostramos por pantalla
        System.out.print("Los numeros son ");
        int divisor = 1;
        while (divisor <= numero) {
            divisor *= 10;
        }
        divisor /= 10;

        while (divisor >= 1) {
            int digito = numero / divisor;
            System.out.print(digito + " ");
            numero -= digito * divisor;
            divisor /= 10;
        }

        scanner.close();
    }

}