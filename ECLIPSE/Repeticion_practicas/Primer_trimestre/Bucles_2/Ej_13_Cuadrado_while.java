package Bucles_2;

import java.util.*;

public class Ej_13_Cuadrado_while {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        int i = 0;
        int j;
        
        // Se pide el valor de n
        System.out.print("Introduce un numero entero, no se pueden decimal: ");
        num = sc.nextInt();
        
        if(num<=0) {
            System.out.print("Numero introducido incorrecto.");
            return;
        }
        
        while (i < num) { // i = columnas
        	j = 0;
        	while (j < num) { //j = filas
        		System.out.print("*");
        		j++;
        	}
        	System.out.println();
        	i++;
        }
        
        sc.close();
    }
}