package Ejercicio1;

import java.io.*;

public class Media {
  
  // Calcula la media aritmética de los números presentes en un archivo de texto.
  
  public static double mediaNumeros(String nombreArchivo) {
    
    double suma = 0;    // Variable para almacenar la suma de los números
    int contador = 0;   // Variable para contar la cantidad de números
    
    try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
      String linea = br.readLine();   // Lee la primera línea del archivo
      String[] numeros = linea.split(" ");   // Divide la línea en un array de números
      
      // Recorre los números en el array y los suma
      for (String numero : numeros) {
        suma = suma + Double.parseDouble(numero);
        contador++;
        }
      }
      
      catch (IOException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
        }
      
    // Calcula la media dividiendo la suma entre el contador
    if (contador != 0) {
      return suma / contador;
      }
      else {
        return 0;   // Si el archivo está vacío, se devuelve 0 como resultado
        }
    }
}

/*genera un método que s ellame mediaNumeros, recibirá como parámetro un fichero de texto llamado numeros.txt que contiene sólo una cadena de números separados por un espacio en blanco.                                                                                             
 * El método debe devolver la media aritmética de los números leídos.
 * Por ejemplo si el fichero numeros.txt contiene la cadena 4 2 3 3 el resultado de ejecutar el método será de 3.                                                                                                                   No hay que hacer el programa principal, sólo desarrollar el método.
 */