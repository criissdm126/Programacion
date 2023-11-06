package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        // Crear objetos de Persona
        personas.add(new Persona("Juan", 123456789, 25));
        personas.add(new Persona("Ana", 987654321, 30));
        personas.add(new Persona("Carlos", 456789123, 18));
        personas.add(new Persona("Luisa", 654321987, 22));
        personas.add(new Persona("Pedro", 789123456, 40));
        personas.add(new Persona("María", 321987654, 35));
        personas.add(new Persona("Sofía", 876543219, 20));
        personas.add(new Persona("Miguel", 567891234, 28));
        personas.add(new Persona("Laura", 918273645, 25));
        
        // Ordenar por edad y nombre
        Collections.sort(personas, Comparator.comparingInt(Persona::getEdad).thenComparing(Persona::getNombre));
        
        // Mostrar solo el DNI de las personas ordenadas
        for (Persona persona : personas) {
            System.out.println("DNI: " + persona.getDni());
        }
    }
}