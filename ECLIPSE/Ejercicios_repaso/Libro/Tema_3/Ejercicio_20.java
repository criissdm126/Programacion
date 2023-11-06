package Tema_3;

import java.util.*;

public class Ejercicio_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        double total = 0;
        while (true) {
            System.out.println("Cantidad de dinero: (ingrese 0 para salir)");
            double cantidad = sc.nextDouble();
            if (cantidad == 0) {
                break;
            }
            total += cantidad;
        }

        System.out.println("El dinero total es de: " + total);
        sc.close();
    }
}
