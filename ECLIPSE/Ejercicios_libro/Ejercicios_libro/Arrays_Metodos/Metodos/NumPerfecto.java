package Metodos;

public class NumPerfecto {

    public static void main(String[] args) {
      
      for (int i = 1; i <= 1000; i++) {
        if (esNumeroPerfecto(i)) {
          System.out.println(i + " es un numero perfecto.");
        }
      }
    }
    
    public static boolean esNumeroPerfecto(int num) {
      
      int sumaDigitos = 0;
      int numDigitos = contarDigitos(num);
      
      int temp = num;
      while (temp != 0) {
        int digito = temp % 10;
        sumaDigitos += Math.pow(digito, numDigitos);
        temp /= 10;
      }
      
      return num == sumaDigitos;
    }
    
    public static int contarDigitos(int num) {
      int contador = 0;
      while (num != 0) {
        num /= 10;
        contador++;
      }
      return contador;
    }
}


/* Método para calcular si un número es perfecto.
 * Un nº se dice que es perfecto cuando la suma de cada uno de los dígitos elevado al nº de dígitos da como  resultado el mismo número.
 * Por ejemplo el 153 = 13 + 53 + 33
 * En el main realizar un programa que determine que números entre el 1 y el 1000 son perfectos.
 */


