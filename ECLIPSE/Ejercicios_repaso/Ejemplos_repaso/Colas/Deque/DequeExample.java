package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
	
    public static void main(String[] args) {
    	
        Deque<String> deque = new ArrayDeque<>();

        deque.offerFirst("Apple");
        deque.offerLast("Banana");
        deque.offerLast("Orange");

        System.out.println("Deque:");
        while (!deque.isEmpty()) {
            String element = deque.pollFirst();
            System.out.println(element);
        }
    }
}
