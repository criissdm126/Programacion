package generar_num;

import java.util.*;

public class Ej2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;

        while (count < 10) {
            try {
                System.out.print("Introduce un numero positivo: ");
                int num = Integer.parseInt(sc.nextLine());

                if (num < 0) {
                    throw new Exception("No se permiten numeros negativos");
                } else if (num > 0) {
                    numbers[count] = num;
                    count++;
                }

            } catch (NumberFormatException e) {
                System.out.println("No se permiten letras, introduce un numero positivo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Los numeros introducidos son:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        sc.close();
    }
}
/*pedir numeros al usuarioi hasta conseguir 10 positivos*/
/*gestión de excepciones*/
/*mostrarlo por pantalla
 * Si el usuario pone 10 numeros positivos se le mostrará por pantalla
 * Si pone 3 positivos y uno negativo, ese negativo no contará, y aun le quedarán 7 numeros por introducir
 * Si pone una letra, le saltará una excepción y se le volverá a preguntar.
 * El cero no cuenta como numero positivo
 * */
/*pedir numeros al usuario hasta conseguir 10 positivos
 * si el numero esta duplicado excepción
 * si no introduce un numero excepción
 * final: listado de numeros primos y no primos
 */
		
		