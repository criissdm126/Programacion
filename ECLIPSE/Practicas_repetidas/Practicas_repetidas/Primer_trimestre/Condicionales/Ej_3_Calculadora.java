package Condicionales;

import java.util.*;

public class Ej_3_Calculadora {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        //SE PIDEN LOS NUMEROS
		System.out.println("Introduzca el primer numero: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Introduzca el segundo numero: ");
		double num2 = sc.nextDouble();
		
		//selecciona la operación
		System.out.println("Se pueden realizar tres operaciones, la primera es una raiz cuadrada, la segunda una division y la tercera una potencia. Elija un numero del 1 al 3 en funcion de la operacion que quiera realizar: ");
		String num3 = sc.nextLine();
		
		int operacion = sc.nextInt();
		
		//se realiza la operación elegida y se muestra resultado
		if(operacion == 1) { //raiz cuadrada
			System.out.println("Se va a realizar una raiz cuadrada.");
			
			double op1 = Math.sqrt(num1);
			double op2 = Math.sqrt(num2);
			
			System.out.println(num3 + "El resultado del numero 1 es: " + op1 + " y del segundo numero es: " + op2);
		}
		
		else if (operacion == 2) { //division
			System.out.println("Se va a realizar una division.");
			System.out.println(num3 + "El resultado es: " + (num1/num2));
        
        }
		
		else if(operacion == 3) { // potencia
			System.out.println("Se va a realizar una potencia.");
			
			double pot1 = Math.pow(num1, num2);
			double pot2 = Math.pow(num2, num1);
			
			System.out.println(num3 + "El resultado del numero uno elevado al numero dos es: " + pot1);
			System.out.println(num3 + "El resultado del numero dos elevado al numero uno es: " + pot2);
		}
    }
}

/*Calculadora con dos números.
* Se muestra un menú 1 Raíz cuadrada de un nº, 2 Dividir dos números, 3 Potencia de dos números.
* Según la opción introducida se piden los datos al usuario y se muestra el resultado.
*/