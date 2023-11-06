package Bucles_2;

public class Ej_11_Contador_for {

    public static void main(String[] args) {

        int num;
        int contador = 0;

        for(num = 100; num > 0; num -= 2) {
            System.out.println(num);
            if(num % 10 == 7) {
                contador++;
            }
        }

        System.out.println("Existen: "  +  contador + " sietes");

    }

}







