package Bucles;

import java.util.*;

public class SumaNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        
        do {
            System.out.print("Introduce un numero (0 para terminar): ");
            numero = sc.nextInt();
            suma += numero;
        } while (numero != 0);
        
        System.out.println("La suma de los numeros introducidos es: " + suma);
        
        sc.close();
    }

}

/*Pedir números hasta que se teclee un 0,
* mostrar la suma de todos los números introducidos
*/