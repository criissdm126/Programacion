package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaLista {

    public static void main(String[] args) {
        
        List<String> listaNombres = new ArrayList<>();// Crear una lista vacía para almacenar los nombres ingresados por el usuario
        
        ingresarNombres(listaNombres); // Solicitar al usuario que ingrese los nombres y los agregar a la lista

        
        String nombreBuscado = solicitarNombre(); // Solicitar al usuario que ingrese un nombre para buscar en la lista

        // Verificar si la lista contiene el nombre buscado y mostrar el resultado
        
        boolean contieneNombre = verificarNombre(listaNombres, nombreBuscado);
        
        if (contieneNombre) {
            System.out.println("La lista contiene el nombre buscado.");
        }
        else {
            System.out.println("La lista no contiene el nombre buscado.");
        }
    }

    // Método para solicitar al usuario que ingrese los nombres y agregarlos a la lista
    
    private static void ingresarNombres(List<String> listaNombres) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los nombres (ingrese 'fin' para terminar):");

        String nombre;
        do {
            nombre = scanner.nextLine();

            if (!nombre.equalsIgnoreCase("fin")) {
                listaNombres.add(nombre);
            }
        } while (!nombre.equalsIgnoreCase("fin"));
    }

    
    
    private static String solicitarNombre() { // Método para solicitar al usuario que ingrese un nombre
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre para buscar en la lista:");
        return scanner.nextLine();
    }

    // Método para verificar si la lista contiene el nombre buscado
    
    private static boolean verificarNombre(List<String> listaNombres, String nombreBuscado) {
        return listaNombres.contains(nombreBuscado);
    }
}