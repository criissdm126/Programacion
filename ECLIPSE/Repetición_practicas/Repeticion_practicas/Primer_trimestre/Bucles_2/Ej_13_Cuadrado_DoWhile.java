package Bucles_2;

import java.util.*;

public class Ej_13_Cuadrado_DoWhile {
	
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
        
        do {
        	j = 0;
        	do {
        		System.out.print("*");
        		j++;
        	} while (j < num);
        	System.out.println();
        	i++;
        } while (i < num);
        
        sc.close();
    }
}