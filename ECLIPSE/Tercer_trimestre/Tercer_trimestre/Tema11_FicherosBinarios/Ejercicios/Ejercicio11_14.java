package Ejercicios;

import java.io.*;
import java.util.*;

public class Ejercicio11_14 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		
		String frase = scanner.nextLine();
		scanner.close();
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Ejercicio14.bin"))) {
			dos.writeUTF(frase);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}






