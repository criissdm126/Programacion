package Ejercicio_7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Excepciones {
	
    public static void main(String[] args) {
        String fileIn = "archivo_origen.txt";
        String fileOut = "archivo_destino.txt";
        copyFile(fileIn, fileOut);
    }
    
    public static void copyFile(String fileIn, String fileOut) {
        try (InputStream inputStream = new FileInputStream(fileIn);
             OutputStream outputStream = new FileOutputStream(fileOut)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("Archivo copiado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }

}

/* Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 */
// Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

