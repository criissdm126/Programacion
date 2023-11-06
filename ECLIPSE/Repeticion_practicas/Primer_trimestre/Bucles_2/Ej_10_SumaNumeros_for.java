package Bucles_2;

import java.util.*;

public class Ej_10_SumaNumeros_for {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        int suma = 0;
        
        for (; numero != 0;) {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = sc.nextInt();
            suma += numero;
        }
        
        System.out.println("La suma de los números introducidos es: " + suma);
        sc.close();
    }
}



