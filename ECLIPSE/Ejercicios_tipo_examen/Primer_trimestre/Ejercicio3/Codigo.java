package Ejercicio3;

import java.util.Scanner;

class Codigo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {// Mostrar las opciones de saludo y salida
            
            System.out.println("Elige un numero para saludar, 0 para salir:");
            System.out.println("1. Buenos dias.");
            System.out.println("2. Buenas tardes.");
            System.out.println("3. Buenas noches.");
            
            opcion = scanner.nextInt();// Leer la opción ingresada por el usuario
            
            switch (opcion) {// Realizar una acción en base a la opción seleccionada
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                case 1:
                    System.out.println("Buenos dias.");
                    break;
                case 2:
                    System.out.println("Buenas tardes.");
                    break;
                case 3:
                    System.out.println("Buenas noches.");
                    break;
                default:
                    System.out.println("Opcion invalida. Vuelve a intentarlo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}

/* A continuación se muestra la consola de un ejemplo de ejecución de programa:
 *    Si eliges 1, 2 o 3, te saluda
 *    si pulsas 0 sale del menú y si pulsas otro número te vuelve a mostrar el menú.
 * Escribe el código java para desarrollar este programa:
 *   Elige un número para saludadr, 0 para salir:
 *     1. Buenos días.
 *     2. Buenas tardes.
 *     3. Buenas noches.
 *     4
 *   Elige un número para saludadr, 0 para salir:
 *     1. Buenos días.
 *     2. Buenas tardes.
 *     3. Buenas noches.
 *    6
 *   Elige un número para saludadr, 0 para salir:
 *     1. Buenos días.
 *     2. Buenas tardes.
 *     3. Buenas noches.
 *    1
 *    Buenos días
 *     *   Elige un número para saludadr, 0 para salir:
 *     1. Buenos días.
 *     2. Buenas tardes.
 *     3. Buenas noches.
 *    0
 *    Fin del programa    
 */
