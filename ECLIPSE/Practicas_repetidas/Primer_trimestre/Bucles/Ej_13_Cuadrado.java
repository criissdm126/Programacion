package Bucles;

import java.util.*;

public class Ej_13_Cuadrado {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        // Se pide el valor de n
        System.out.print("Introduce un numero entero, no se pueden decimal: ");
        num = sc.nextInt();
        
        if(num<=0) {
            System.out.print("Numero introducido incorrecto.");
        }
        
        // Se dibuja el cuadrado de n elementos de lado
        for (int i = 0; i < num; i++) { // i = columnas
            for (int j = 0; j < num; j++) { //j = filas
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}
/*Dibuja un cuadrado de n elementos de lado utilizando *.
* Los n elementos los introduce el usuario por pantalla
*/