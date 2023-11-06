package Pilas_Colas_Deques;

import java.util.Stack;
import java.util.Queue;

public class Principal {
    public static void main(String[] args) {
    	
        // Prueba de la Pila
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack content: " + stack.pop()); // Imprime: Stack content: 3

        System.out.println("Stack size: " + stack.size()); // Imprime: Stack size: 2

        // Prueba de la Cola
        Queue queue = new MyQueue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println("Queue content: " + queue.dequeue()); // Imprime: Queue content: A

        System.out.println("Queue size: " + queue.size()); // Imprime: Queue size: 2
    }
}