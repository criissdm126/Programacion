package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ProgramaPremio {

    public static void main(String[] args) {
        
    	// Generar una lista de 10 números aleatorios sin repetición en el rango del 1 al 100
        List<Integer> numeros = generarNumerosAleatorios(10, 1, 100);
        
        // Generar una lista de 10 letras aleatorias sin repetición desde la 'a' hasta la 'z'
        List<Character> letras = generarLetrasAleatorias(10, 'a', 'z');

        // Obtener el número mínimo de la lista de números generados
        int numeroMinimo = Collections.min(numeros);
        
        // Obtener la letra máxima de la lista de letras generadas
        char letraMaxima = Collections.max(letras);

        // Concatenar el número mínimo y la letra máxima en la variable 'premio'
        String premio = numeroMinimo + String.valueOf(letraMaxima);
        
        System.out.println("El premio es: " + premio); // Mostrar el premio en la consola
    }
    
    
    // Generar una lista de números aleatorios sin repetición en un rango específico
    
    private static List<Integer> generarNumerosAleatorios(int cantidad, int minimo, int maximo) {
        
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        while (numeros.size() < cantidad) {
            
            int numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo; // Generar un número aleatorio en el rango dado

            // Verificar si el número generado ya existe en la lista, si no, agregarlo
            if (!numeros.contains(numeroAleatorio)) {
                numeros.add(numeroAleatorio);
            }
        }

        return numeros;
    }

    // Generar una lista de letras aleatorias sin repetición dentro de un rango de caracteres
    private static List<Character> generarLetrasAleatorias(int cantidad, char inicio, char fin) {
        List<Character> letras = new ArrayList<>();
        Random random = new Random();

        while (letras.size() < cantidad) {
            
            char letraAleatoria = (char) (random.nextInt(fin - inicio + 1) + inicio); // Generar una letra aleatoria en el rango dado

            
            if (!letras.contains(letraAleatoria)) {// Verificar si la letra generada ya existe en la lista, si no, agregarla
                letras.add(letraAleatoria);
            }
        }

        return letras;
    }
}