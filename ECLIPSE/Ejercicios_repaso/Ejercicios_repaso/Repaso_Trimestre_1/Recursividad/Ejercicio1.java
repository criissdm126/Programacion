package Recursividad;

public class Ejercicio1 {

    public static void main(String[] args) {
        int numero = 5; // Número para calcular el factorial
        int factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}

// Factorial de un numero