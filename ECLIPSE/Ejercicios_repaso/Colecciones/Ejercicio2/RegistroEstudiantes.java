package Ejercicio2;

import java.util.*;

public class RegistroEstudiantes {
	
    private ArrayList<Estudiante> estudiantes;

    public RegistroEstudiantes() {
        this.estudiantes = new ArrayList<>();
    }
	
	//  recibe como parámetros el número de identificación, nombre y edad del estudiante
	// y crea un objeto Estudiante para agregarlo a la colección.
    public void agregarEstudiante(int id, String nombre, int edad) {
        Estudiante estudiante = new Estudiante(id, nombre, edad);
        estudiantes.add(estudiante);
    }
	
	// muestra en consola la información de todos los estudiantes registrados.
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes registrados:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("ID: " + estudiante.getId());
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("-----------------------------");
        }
    }
	
	//  recibe como parámetro el número de identificación
	// y busca un estudiante en la colección. Si lo encuentra, muestra su información en consola.
    public void buscarEstudiante(int idBuscado) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == idBuscado) {
                System.out.println("Estudiante encontrado:");
                System.out.println("ID: " + estudiante.getId());
                System.out.println("Nombre: " + estudiante.getNombre());
                System.out.println("Edad: " + estudiante.getEdad());
                return; // Salir del método después de encontrar el estudiante
            }
        }
        
        // Si no se encontró el estudiante, mostrar un mensaje
        System.out.println("No se encontró un estudiante con el ID: " + idBuscado);
    }
}

/* Crea una clase RegistroEstudiantes que contenga una colección (ArrayList) de objetos Estudiante. Esta clase debe tener los siguientes métodos:
agregarEstudiante: recibe como parámetros el número de identificación, nombre y edad del estudiante y crea un objeto Estudiante para agregarlo a la colección.
mostrarEstudiantes: muestra en consola la información de todos los estudiantes registrados.
buscarEstudiante: recibe como parámetro el número de identificación y busca un estudiante en la colección. Si lo encuentra, muestra su información en consola.
*/