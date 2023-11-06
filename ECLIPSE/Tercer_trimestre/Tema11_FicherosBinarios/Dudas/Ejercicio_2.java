package Dudas;

import java.io.*;
import java.util.*;
public class Ejercicio_2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un valor double: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Introduce un numero entero: ");
        int num2 = sc.nextInt();
        
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("dudas_ejercicio_2.bin"))) {
            dos.writeDouble(num1);
        } 
        
        catch(FileNotFoundException e) {//este catch viene d ela carga del fichero
			System.out.println("Fichero no encontrado");
		}
		
        catch (IOException e) {//este catch viene del método redline
			System.out.println("Problema de lectura o escritura");
			
		}
        
        System.out.print("El numero double es: " + num1 + " y el numero entero es: " + num2);
	}
}
/*Escribir 1 double y 1 int
 * Leer 2 double
 * ¿Qué pasa?
 */

