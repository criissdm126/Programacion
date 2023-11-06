package Bucles_anidados;

import java.util.Scanner;

public class Escalera_letras {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el número de letras, y se mostrará una escalera: ");
        int num = sc.nextInt();
        
        sc.close();
        
        for (int i = num; i >= 1; i--) {
            for (char j = (char) ('a' + i - 1); j >= 'a'; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



/* Pintar escalera de letras según el número de letras que indique el usuario por  teclado.
 * Por ejemplo la siguiente ejecución sería con letras=4;
 *   d c b a
 *   c b a 
 *   b a
 *   a
 */

