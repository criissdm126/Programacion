package Arrays;

public class Inversa {

    public static void main(String[] args) {
        
    	int[] array = {1, 2, 3, 4, 5}; // Ejemplo de array con valores

        System.out.println("Array en orden inverso:");
        mostrarArrayInverso(array);
    }

    public static void mostrarArrayInverso(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

// Mostrar los valores de un array en orden inverso.