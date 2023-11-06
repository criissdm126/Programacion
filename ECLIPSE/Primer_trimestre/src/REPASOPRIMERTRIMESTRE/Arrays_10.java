package REPASOPRIMERTRIMESTRE;

import java.util.Arrays;

public class Arrays_10 {

    public static void main(String[] args) {

        int pares[] = {7, 5, 2, 4, 3};
        posicionesPares(pares);

    }

    static void posicionesPares(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("El número en la posición " + i + " es par.");
            }
        }
    }
}
