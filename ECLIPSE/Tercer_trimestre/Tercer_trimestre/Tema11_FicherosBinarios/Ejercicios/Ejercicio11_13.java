package Ejercicios;
import java.io.*;

public class Ejercicio11_13 {

	public static void main(String[] args) {
        double[] tabla = {1.3, 2.5, 3.5, 4.4, 5.3};
        
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Ejercicio13.bin"))) {
            for (double valor : tabla) {
                dos.writeDouble(valor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
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
