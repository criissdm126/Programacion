package Condicionales_2;

import java.util.Scanner;

public class capicua_switch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe un numero de tres cifras, y se le dira si es capicua. o no.");
        int num = sc.nextInt();
        
        int primero;
        int segundo;
        int tercero;
        
        switch (num / 100) {
            case 0:
                System.out.println("Numero incorrecto, tiene que ser positivo y de tres cifras.");
                break;
            default:
                primero = num / 100;
                segundo = (num % 100) / 10;
                tercero = num % 10;
                
                if (primero == tercero && segundo == segundo) {
                    System.out.println("El numero " + num + " es capicua.");
                } else {
                    System.out.println("El numero " + num + " no es capicua.");
                }
                break;
        }
        
        sc.close();
    }
}
