package Tema_2;

import java.util.*;

public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double num = input.nextInt();
        
        int valorAbsoluto = (int) (num >= 0 ? num : -num);
        
        System.out.println("El valor absoluto de " + num + " es " + valorAbsoluto);
        input.close();
    }
}

/*Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado*/