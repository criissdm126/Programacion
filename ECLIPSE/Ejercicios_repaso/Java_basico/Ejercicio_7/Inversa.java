package Ejercicio_7;

public class Inversa {

    public static void main(String[] args) {
        String texto = "hola mundo";
        String resultado = reverse(texto);
        System.out.println(resultado);
    }
    
    public static String reverse(String texto) {
        StringBuilder reversed = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            reversed.append(texto.charAt(i));
        }
        return reversed.toString();
    }

}

/*Dada la función:

	 public static String reverse(String texto) { }

	Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".*/