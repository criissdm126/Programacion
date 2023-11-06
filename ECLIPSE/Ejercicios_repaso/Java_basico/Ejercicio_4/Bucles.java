package Ejercicio_4;

public class Bucles {

    public static void main(String[] args) {
    	
        String[] nombres = {"Hola", " ", "Mundo", "!"};
        String resultado = concatenarTextos(nombres);
        System.out.println("Resultado final: " + resultado);
    }

    public static String concatenarTextos(String[] textos) {
        String resultado = "";
        for (String texto : textos) {
            resultado += texto;
        }
        return resultado;
    }
}


// En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

// Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

// String[] nombres = {"", "", "", ""}