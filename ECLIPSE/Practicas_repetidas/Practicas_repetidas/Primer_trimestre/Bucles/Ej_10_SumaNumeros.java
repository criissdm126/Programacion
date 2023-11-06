package Bucles;

import java.util.*;

public class Ej_10_SumaNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        
        do {
            System.out.print("Introduce un numero (0 para terminar): "); //se preguntan los numeros
            numero = sc.nextInt();
            suma = suma + numero;
        } while (numero != 0); //si marca el cero, sale del bucle
        
        System.out.println("La suma de los numeros introducidos es: " + suma);
        
        sc.close();
    }

}

/*Pedir números hasta que se teclee un 0,
* mostrar la suma de todos los números introducidos
*/