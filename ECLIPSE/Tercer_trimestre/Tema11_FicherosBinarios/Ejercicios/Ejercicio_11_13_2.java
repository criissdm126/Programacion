package Ejercicios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio_11_13_2 {

	 public static void main(String[] args) {
	        try (DataInputStream dis = new DataInputStream(new FileInputStream("Ejercicio13.bin"))) {
	            while (dis.available() > 0) {
	                double valor = dis.readDouble();
	                System.out.println(valor);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}