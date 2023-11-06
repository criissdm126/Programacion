package Bucles_2;

import java.util.*;

public class Ej_10_SumaNumeros_while {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.print("Introduce un numero (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma = suma +  numero;
            System.out.print("Introduce otro numero (0 para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("La suma de los numeros introducidos es: " + suma);

        sc.close();
    }
}