package Ejercicios;

import java.io.*;

public class Ejercicio_14_2 {

	public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("Ejercicio14.bin"))) {
            String frase = dis.readUTF();
            System.out.println("La frase recuperada del archivo es: " + frase);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}