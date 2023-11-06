package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	
    public static void main(String[] args) {
    	
        Deque<String> arrayDeque = new ArrayDeque<>();

        // Agregar elementos al final de la cola
        arrayDeque.offer("Apple");
        arrayDeque.offer("Banana");
        arrayDeque.offer("Orange");

        // Agregar elementos al frente de la cola
        arrayDeque.offerFirst("Grape");
        arrayDeque.offerFirst("Cherry");

        System.out.println("ArrayDeque:");
        // Recorrer y mostrar los elementos de la cola
        while (!arrayDeque.isEmpty()) {
            String element = arrayDeque.poll();
            System.out.println(element);
        }
    }
}
