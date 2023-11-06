package Ejercicios;

import java.io.*;
import java.util.*;

public class Ejercicio11_11 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un valor double: ");
        double valor = scanner.nextDouble();
        scanner.close();
        
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Ejercicio11.bin"))) {
            dos.writeDouble(valor);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.print("El numero es: " + valor);
    }
}