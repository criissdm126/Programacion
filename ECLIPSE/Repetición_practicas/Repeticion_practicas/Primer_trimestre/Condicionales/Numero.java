package Condicionales;

import java.util.Scanner;

public class Numero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Pon un numero entre 0 y 99: "); // se pregunta un numero
        int numero = sc.nextInt();
        
        if (numero < 0 || numero > 99) { //se comprueba que esta dentro del rango
            System.out.println("El numero introducido esta fuera de rango.");
        }
        
        else {
            int unidades = numero % 10; // unidades 1 - 9
            int decenas = numero / 10; //decenas 10 - 100
            
            if (numero < 10) { //unidades
                switch (numero) {
                    case 0: System.out.println("cero"); break;
                    case 1: System.out.println("uno"); break;
                    case 2: System.out.println("dos"); break;
                    case 3: System.out.println("tres"); break;
                    case 4: System.out.println("cuatro"); break;
                    case 5: System.out.println("cinco"); break;
                    case 6: System.out.println("seis"); break;
                    case 7: System.out.println("siete"); break;
                    case 8: System.out.println("ocho"); break;
                    case 9: System.out.println("nueve"); break;
                }
            }
            else if (numero < 20) { //decenas
                switch (numero) {
                    case 10: System.out.println("diez"); break;
                    case 11: System.out.println("once"); break;
                    case 12: System.out.println("doce"); break;
                    case 13: System.out.println("trece"); break;
                    case 14: System.out.println("catorce"); break;
                    case 15: System.out.println("quince"); break;
                    default: System.out.println("dieci" + unidades); break;
                }
            }
            else { // numeros redondos (multiplos de 10)
                switch (decenas) {
                    case 2: System.out.print("veinte"); break;
                    case 3: System.out.print("treinta"); break;
                    case 4: System.out.print("cuarenta"); break;
                    case 5: System.out.print("cincuenta"); break;
                    case 6: System.out.print("sesenta"); break;
                    case 7: System.out.print("setenta"); break;
                    case 8: System.out.print("ochenta"); break;
                    case 9: System.out.print("noventa"); break;
                }
                if (unidades != 0) {
                    System.out.print(" y ");
                    switch (unidades) {
                        case 1: System.out.println("uno"); break;
                        case 2: System.out.println("dos"); break;
                        case 3: System.out.println("tres"); break;
                        case 4: System.out.println("cuatro"); break;
                        case 5: System.out.println("cinco"); break;
                        case 6: System.out.println("seis"); break;
                        case 7: System.out.println("siete"); break;
                        case 8: System.out.println("ocho"); break;
                        case 9: System.out.println("nueve"); break;
                    }
                } else {
                    System.out.println();
                }
            }
	}
}
}

/*Pedir un número de 0 a 99 y mostrarlo escrito.
* Por ejemplo, para 56 mostrar: cincuenta y seis
*/