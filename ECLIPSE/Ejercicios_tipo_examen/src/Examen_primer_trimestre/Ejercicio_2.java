package Examen_primer_trimestre;

public class Ejercicio_2 {

	public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print(i + "X");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}