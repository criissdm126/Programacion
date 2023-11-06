package Examen_primer_trimestre;

public class Ejercicio_6 {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2, 7};
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        System.out.println("El valor máximo del array es: " + maximo);
    }
    
    public static int obtenerMaximo(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

}