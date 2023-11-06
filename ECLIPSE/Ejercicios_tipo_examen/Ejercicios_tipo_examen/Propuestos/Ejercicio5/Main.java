package Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
    public static void main(String[] args) {
    	
        List<Coche> cochecitos = new ArrayList<>();
        
        cochecitos.add(new Coche("Ford", "Rojo", 3));
        cochecitos.add(new Coche("Toyota", "Azul", 1));
        cochecitos.add(new Coche("Volkswagen", "Verde", 2));

        Collections.sort(cochecitos); // Ordenar los coches por identificador

        for (Coche coche : cochecitos) {
            System.out.println(coche); // Mostrar cada coche en la colección
        }
    }
}
