package Math;

import java.util.Random;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
        // Crear una instancia de la clase Random
        Random random = new Random();

        // Generar un número entero aleatorio entre 1 y 10
        int numero = random.nextInt(10) + 1;

        // Mostrar el número por pantalla
        System.out.println("Número generado: " + numero);
    }
}
// Generar un número entero (aleatorio) entre 1 y 10, y mostrarlo por pantalla