package Ejercicios;

import java.io.*;
import java.util.*;

public class Ejercicio11_16 {
	
public static void main(String[] args) {
    ArrayList<String> nombres = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    String nombre;
    
    // Abrir el archivo y leer los nombres 
    try (BufferedReader br = new BufferedReader(new FileReader("Ejercicio16.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            nombres.add(linea);
        }
    } catch (IOException e) {
        System.err.format("Error al leer el archivo.", e);
    }
    
    // Pedir nombres nuevos hasta que se ingrese "fin"
    while (true) {
        System.out.print("Ingrese un nombre (o \"fin\" para terminar): ");
        nombre = scanner.nextLine();
        if (nombre.equals("fin")) {
            break;
        } else {
            nombres.add(nombre);
            Collections.sort(nombres);
        }
    }
    
    // Escribir la lista actualizada en el archivo
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Ejercicio16.txt"))) {
        for (String n : nombres) {
            bw.write(n);
            bw.newLine();
        }
    } catch (IOException e) {
        System.err.format("Error al escribir en el archivo", e);
    }
    
    System.out.println("La lista de nombres ha sido actualizada.");
    scanner.close();
}

}