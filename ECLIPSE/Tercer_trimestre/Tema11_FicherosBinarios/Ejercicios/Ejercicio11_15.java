package Ejercicios;

import java.io.*;

public class Ejercicio11_15 {

	public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("numeros.txt"));
            FileWriter pares = new FileWriter("par.txt");
            FileWriter impares = new FileWriter("impares.txt");

            String cadena;
            
            while ((cadena = br.readLine()) != null) {
                int num = Integer.parseInt(cadena.trim()); //trim = quita los espacios

                if (num % 2 == 0) {
                   //pares.write(num);
                    pares.write(num);
                } else {
                    impares.write(num);
                }
            }

            br.close();
            pares.close();
            impares.close();

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo");
        }
   // (ObjectInputStream br = new ObjectInputStream(new FileInputStream("numeros.dat")))
    }
}
/*numeros.dat
 *pares.dat
 *impares.dat
 */