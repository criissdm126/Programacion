package Condicionales;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un valor para num1:");
        int num1 = sc.nextInt();

        System.out.println("Escribe un valor para num2:");
        int num2 = sc.nextInt();

        System.out.println("Elige la operación que quieres hacer con ellos:");
        System.out.println("1 para sumar");
        System.out.println("2 para restar");
        System.out.println("Haz una variante de este ejercicio para que el usuario pueda pulsar la tecla + para sumar y - para restar.");

        // Leer la opción de operación del usuario
        char opcion = sc.next().charAt(0);
        int resultado = 0;

        if (opcion == '1' || opcion == '+') {
            resultado = num1 + num2;
            System.out.println("El resultado de sumar " + num1 + " y " + num2 + " es " + resultado);
        } else if (opcion == '2' || opcion == '-') {
            resultado = num1 - num2;
            System.out.println("El resultado de restar " + num1 + " y " + num2 + " es " + resultado);
        } else {
            System.out.println("Operación no permitida");
        }

        sc.close();
    }
}


/*
 * • Ejercicio:
Escribe un valor para num1:
Escribe un valor para num2:
Elige la operación que quieres hacer con ellos:
1 para sumar
2 para restar
Haz una variante de este ejercicio para que el usuario pueda pulsar la tecla + para
sumar y – para restar.
Ejemplo de ejecución:
Si pulsa 1 se muestra "El resultado de sumar 3 y 4 es 7"
Si pulsa 2 se muestra "El resultado de restar 3 y 4 es -1"
Si pulsa otra cosa se muestra "Operación no permitida"

 */
