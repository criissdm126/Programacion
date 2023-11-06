package Examen_primer_trimestre;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        
        do {
            System.out.print("Introduce un numero entre 0 y 99 (o un numero negativo para salir): ");
            num = scanner.nextInt();
            int result = countDigits(num);
            
            if (result == -1) {
                System.out.println("El numero no está entre 0 y 99");
            } else {
                System.out.println("El numero tiene " + result + " cifras");
            }
            
        } while (num >= 0);
        
        scanner.close();
        System.out.println("Fin programa");
    }
    
    public static int countDigits(int num) {
        if (num < 0 || num > 99) {
            return -1;
        } else if (num < 10) {
            return 1;
        } else {
            return 2;
        }
    }
}
