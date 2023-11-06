package Enum_Mes;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de dias:");
        int numeroDiasIngresado = scanner.nextInt();

        Mes[] meses = Mes.values(); // obtener un arreglo de todos los valores del enum Mes
        // y se asigna a la variable meses, que es de tipo Mes[]

        boolean encontrado = false;

        for (Mes mes : meses) { //  itera sobre los elementos de un arreglo o una colección. 
            if (mes.getNumeroDias() == numeroDiasIngresado) {
                System.out.println("Mes encontrado: " + mes);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron meses con " + numeroDiasIngresado + " dias.");
        }

        scanner.close();
    }
}