package Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {

        int[] array = new int[10];
        inicializarArray(array);
        ordenarArray(array);
        mostrarArray(array);

        int nuevoValor = leerValor();
        insertaOrdenado(array, nuevoValor);
        mostrarArray(array);
    }

    // Inicializa el array con valores aleatorios entre 0 y 10
    public static void inicializarArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11); // Genera valores aleatorios entre 0 y 10
        }
    }

    // Ordena el array de menor a mayor utilizando el método sort de la clase Arrays
    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
    }

    // Muestra el contenido del array en la consola
    public static void mostrarArray(int[] array) {
        System.out.println("Contenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Lee un nuevo valor desde el teclado
    public static int leerValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un nuevo valor: ");
        int valor = scanner.nextInt();
        return valor;
    }

    public static void insertaOrdenado(int[] array, int nuevoValor) {
        int indice = array.length - 2; // Restamos 2 en lugar de 1 para dejar espacio para el nuevo valor y evitar el desbordamiento
        while (indice >= 0 && array[indice] > nuevoValor) {
            array[indice + 1] = array[indice];
            indice--;
        }
        array[indice + 1] = nuevoValor;
    }
    
    public static void insertaOrdenado1(int[] array, int nuevoValor) {
       
    	// Buscar la posición donde insertar el nuevo valor
        int posicion = 0;
        while (posicion < array.length && array[posicion] < nuevoValor) {
            posicion++;
        }

        // Generar un nuevo array con una posición más
        int[] nuevoArray = new int[array.length + 1];

        // Insertar el valor en la posición correspondiente del nuevo array
        for (int i = 0; i < posicion; i++) {
            nuevoArray[i] = array[i];
        }
        nuevoArray[posicion] = nuevoValor;
        for (int i = posicion + 1; i < nuevoArray.length; i++) {
            nuevoArray[i] = array[i - 1];
        }

        // Actualizar el array original con el nuevo array que tiene el nuevo valor insertado
        for (int i = 0; i < array.length; i++) {
            array[i] = nuevoArray[i];
        }
    }

}
