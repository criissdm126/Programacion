package Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio11_12 {

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
        
        try (DataInputStream dis = new DataInputStream(new FileInputStream("Ejercicio11.bin"))) {
            double valorLeido = dis.readDouble();
            System.out.println("El valor leido del archivo es: " + valorLeido);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}