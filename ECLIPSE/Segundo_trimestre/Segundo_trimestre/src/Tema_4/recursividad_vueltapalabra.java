package Tema_4;

public class recursividad_vueltapalabra {

    public static void main(String[] args) {

        // invertir la palabra
        String palabra = "hola";

        System.out.println(invertir(palabra));
    }

    public static String invertir(String palabra) {

        if (palabra.isEmpty()) {
            return palabra;
        }

        return invertir(palabra.substring(1)) + palabra.charAt(0);
    }
}


