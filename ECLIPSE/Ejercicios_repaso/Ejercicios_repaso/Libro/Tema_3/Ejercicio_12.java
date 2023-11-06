package Tema_3;

import java.util.*;

public class Ejercicio_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero binario: ");
        String binario = sc.nextLine();

        int decimal = 0;
        int potencia = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(binario.charAt(i));
            decimal += digito * Math.pow(2, potencia);
            potencia++;
        }

        System.out.println("El numero decimal es: " + decimal);

        sc.close();

    }

}

// Modifica la actividad 11 para que el usuario pueda introducir el número binario y el progreama muestra su conversión a decimal