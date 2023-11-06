package Ficheros_y_arraylist;

import java.io.*;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
		String nombreFichero = "Animal.csv";
        String cadena;
        ArrayList<Animal> animales = new ArrayList<>();
		
		try (BufferedReader b = new BufferedReader(new FileReader(nombreFichero))) {
            while ((cadena = b.readLine()) != null) {
                cadena = cadena.replaceAll("\"", ""); // elimina todas las comillas dobles
                String[] datos = cadena.split(";");
                if (datos.length == 4) { // asegura que existan 4 elementos
                    Animal animal = new Animal(datos[0], datos[1], datos[2], Integer.parseInt(datos[3].trim()));
                    animales.add(animal);
                }
                else {
                    System.out.println("Error en la fila: " + cadena);
                }
            }
        }
        
		catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        
		catch (IOException e) {
            System.out.println("Problema de lectura o escritura");
        }
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Animales.bin"))) {
            oos.writeObject(animales);
        }
		catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
		catch (IOException e) {
            System.out.println("Problema de lectura o escritura");
        }
    }
}


/* codigo, tipo animal, nombre, edad
 * fichero csv, pàsarlo  aun arraylist que se llame animales
 * y del arraylist  aun fichero binario, serializable, writeobject
 */
