package String;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("- Mi nombre es " + nombre);
        System.out.println("- Mi nombre tiene " + nombre.length() + " letras");
        System.out.println("- La primera letra de " + nombre + " es " + nombre.charAt(0));
        System.out.println("- La ultima letra de " + nombre + " es " + nombre.charAt(nombre.length() - 1));
        System.out.println("- Tengo " + edad + " años y el año que viene tendre " + (edad + 1));

        scanner.nextLine(); // Limpiar el búfer de entrada

        System.out.print("Ingrese sus apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.println("- Mis apellidos son " + apellidos);
    }
}


/* Pedir nombre y la edad por teclado. Mostrar por pantalla lo siguiente y completarlo según corresponda:
 *   - Mi nombre es _______________
 *   - Mi nombre tiene ________ letras
 *   - La primera letra de __________ es __________
 *   - La última letra de ___________ es __________
 *   - Tengo ___ años y el año que viene tendré ___
 *   - Mis apellidos son ___________
 */