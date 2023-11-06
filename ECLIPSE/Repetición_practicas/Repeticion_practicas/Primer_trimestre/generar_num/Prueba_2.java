package generar_num;

import java.util.*;

public class Prueba_2 {

	public static void main(String[] args) {
		
		int [] numeros = new int [10];

		numeros[0] = 1;
		numeros[1] = 1;
		numeros[2] = 2;
		numeros[3] = 3;
		numeros[4] = 5;
		numeros[5] = 8;
		numeros[6] = 13;

		// System.out.println(Arrays.toString(numeros));
		
		// Mostrar los números de Fibonacci por pantalla
        System.out.println("Los numeros son los siguientes:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Escriba un numero: ");
        int num1 = sc.nextInt();
        
     // Determinar cuáles números deben ser sumados
        int numeroAnterior = numeros[numeros.length - 2];
        int ultimoNumero = numeros[numeros.length - 1];
        int nuevaSuma = 0;
        
        if (num1 == numeroAnterior + ultimoNumero) {
            // Si el nuevo número es la suma de los dos últimos números,
            // no es necesario hacer nada más
        } else if (num1 == ultimoNumero) {
            // Si el nuevo número es igual al último número, no es necesario
            // hacer nada más
        } else if (num1 == numeroAnterior) {
            // Si el nuevo número es igual al número anterior al último,
            // el último número debe ser eliminado y la nueva suma debe ser
            // el nuevo número más el número anterior al último
            numeros[numeros.length - 1] = num1;
            nuevaSuma = numeroAnterior + num1;
        } else {
            // Si el nuevo número no cumple ninguna de las condiciones anteriores,
            // el último número debe ser eliminado y la nueva suma debe ser la suma
            // del nuevo número y el último número anterior
            numeros[numeros.length - 1] = num1;
            nuevaSuma = num1 + ultimoNumero;
        }
        
        // Añadir la nueva suma al array si es necesario
        if (nuevaSuma > 0) {
            int[] nuevosNumeros = new int[numeros.length + 1];
            for (int i = 0; i < numeros.length; i++) {
                nuevosNumeros[i] = numeros[i];
            }
            nuevosNumeros[nuevosNumeros.length - 1] = nuevaSuma;
            numeros = nuevosNumeros;
        }
        
     // Mostrar los nuevos números de Fibonacci por pantalla
        System.out.println("\n\nLos nuevos numeros son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        sc.close();

	}


}

/*System.out.println("Cuando ponga un 0, se parara el contador, y se sumarán todos los numeros hasta el momento.");
Scanner sc = new Scanner (System.in);

System.out.println("Escriba vun numero: ");
int num1 = sc.nextInt();
//int num2 = 0;
int suma = 0;

int contador = 0;

while (num1 >0) {
	System.out.println(num1);

	if(num1 == 0) {
		contador++;
	}
	
	suma = num1 + num1;
}

System.out.println("El resultado es: " + contador);
System.out.println("El resultado de la suma es: " + suma);
sc.close();*/		/*System.out.println("Cuando ponga un 0, se parara el contador, y se sumarán todos los numeros hasta el momento.");
Scanner sc = new Scanner (System.in);

System.out.println("Escriba vun numero: ");
int num1 = sc.nextInt();
//int num2 = 0;
int suma = 0;

int contador = 0;

while (num1 >0) {
	System.out.println(num1);

	if(num1 == 0) {
		contador++;
	}
	
	suma = num1 + num1;
}

System.out.println("El resultado es: " + contador);
System.out.println("El resultado de la suma es: " + suma);
sc.close();*/