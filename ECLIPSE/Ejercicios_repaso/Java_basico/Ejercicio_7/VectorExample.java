package Ejercicio_7;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.remove(1);
		vector.remove(1);
		System.out.println(vector);

	}

}

// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
// Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
/* Problema de utilizar un Vector con capacidad por defecto para 1000 elementos:
 * El problema es que el Vector con capacidad por defecto tiene un tamaño inicial pequeño,
 * lo que lleva a que se realicen operaciones frecuentes de redimensionamiento a medida que se agregan más elementos.
 * Estas operaciones de redimensionamiento pueden ser costosas en términos de tiempo de ejecución y consumo de memoria.*/
 